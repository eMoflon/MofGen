package org.moflon.mofgen.build;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.EcoreUtil2;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.utilities.ClasspathUtil;
import org.moflon.mofgen.api.EClassifiersManager;
import org.moflon.mofgen.build.util.NameProvider;
import org.moflon.mofgen.lang.generator.MofgenBuilderExtension;
import org.moflon.mofgen.lang.mofgenLanguage.Generator;
import org.moflon.mofgen.lang.mofgenLanguage.MofgenFile;
import org.moflon.mofgen.lang.mofgenLanguage.Node;
import org.moflon.mofgen.lang.mofgenLanguage.Pattern;

public class MofgenBuilder implements MofgenBuilderExtension {

	public static final Logger logger = Logger.getLogger(MofgenBuilder.class);

	protected static final String DEFAULT_SRC_LOCATION = "src";
	public static final String MOFGEN_FILE_EXTENSION = "mofgen";
	protected static final String DEFAULT_API_LOCATION = "/api";
	protected static final String DEFAULT_GENERATOR_LOCATION = DEFAULT_API_LOCATION+"/generators";
	protected static final String DEFAULT_PATTERN_LOCATION = DEFAULT_API_LOCATION+"/patterns";
	protected static final String DEFAULT_MODEL_LOCATION = "generatedModels";

	/**
	 * The name of the source folder containing the generated API.
	 */
	private final static String SOURCE_GEN_FOLDER = "src-gen";

	/**
	 * The project which is built.
	 */
	protected IProject project;

	/**
	 * The name of the package.
	 */
	private String packageName;
	
	/**
	 * used to determine all necessary imports and dependencies in the manifest
	 */
	public static Registry globalPackageRegistry;
	
	@Override
	public void run(IProject project) {
		// TODO builder runs as often as files exist in project at first launch
		logger.info("Running MofGenBuilder:");
		logger.info("Given project: " + project.getName());
		
		globalPackageRegistry = new EPackageRegistryImpl();
		
		this.project = project;
		double tic = System.currentTimeMillis();

		// clean old code and create folders
		logger.info("Cleaning old code...");
		try {
			removeGeneratedCode(project, "src-gen/**");
			createFolders(project);
		} catch (CoreException e) {
			logger.error("Creating project folders failed with: "+e.getMessage()+"\n"+e.getStackTrace());
			return;
		}
		logger.info("Cleaning old code... Done!");
		logger.info("Creating API...");
		
		List<IFile> mofgenFiles = null;
		try {
			mofgenFiles = getMofgenFiles(project);
		} catch (Exception e) {
			logger.error("Retrieving mofgen files failed with: "+e.getMessage()+"\n"+e.getStackTrace());
		}
		if(mofgenFiles != null) {
			for(IFile mofgenFile : mofgenFiles) {
				// use local registry for determining imports per file in generated source code
				Registry localPackageRegistry = new EPackageRegistryImpl();
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				ResourceSet rs = new ResourceSetImpl();
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				Resource fileResource = rs.createResource(URI.createPlatformResourceURI(mofgenFile.getFullPath().toPortableString(), false));
				try {
					fileResource.load(null);
				} catch (IOException e) {
					logger.error("Loading resource from file "+mofgenFile.getName()+" failed.");
					logger.error(e.getStackTrace());
				}
				
				MofgenFile editorModel = null;
				if (!fileResource.getContents().isEmpty()) {
					editorModel = (MofgenFile) fileResource.getContents().get(0);
					findAllEPackages(editorModel, localPackageRegistry);
					findAllEPackages(editorModel, globalPackageRegistry);
				}
				
				IFolder apiPackage = ensureFolderExists(project.getFolder(SOURCE_GEN_FOLDER + "/" + project.getName().replace(".", "/")));
				try {
					generateAPI(apiPackage, mofgenFile, editorModel, createEClassifierManager(localPackageRegistry));
				}catch(Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		}
		
		try {
			updateManifest(project, this::processManifestForPackage);
		} catch (CoreException e) {
			logger.error("Updating Manifest failed with " + e.getMessage()+"\n"+e.getStackTrace());
		}
		

		try {
			addPluginDependenciesToBuildPath(project);
		} catch (JavaModelException e) {
			logger.error("Adding plugin dependencies to project failed with " + e.getMessage()+"\n"+e.getStackTrace());
		}
		
		try {
			project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			logger.error(e.getMessage());
		}
		
		double toc = System.currentTimeMillis();
		logger.info("Creating API... Done! (" + (toc - tic) / 1000.0 + " seconds.)");
	}

	/**
	 * Generates App, generator and pattern classes.
	 * 
	 * @param apiPackage
	 * @param mofgenFile
	 * @param editorModel
	 * @param eClassifiersManager
	 * @throws CoreException 
	 */
	private void generateAPI(final IFolder apiPackage, final IFile mofgenFile, final MofgenFile editorModel,
			final EClassifiersManager eClassifiersManager) {
		JavaFileGenerator fileGenerator = new JavaFileGenerator(NameProvider.getClassNamePrefix(mofgenFile),
				packageName, editorModel, eClassifiersManager);

		String mofgenFileName = NameProvider.getFileName(mofgenFile);
		
		IFolder appPackage = ensureFolderExists(apiPackage.getFolder(DEFAULT_API_LOCATION));
		IFolder generatorPackage = ensureFolderExists(apiPackage.getFolder(DEFAULT_GENERATOR_LOCATION + "/" + mofgenFileName));
		IFolder patternPackage = ensureFolderExists(apiPackage.getFolder(DEFAULT_PATTERN_LOCATION + "/" + mofgenFileName));
		
		fileGenerator.generateAppClass(appPackage, mofgenFile);
		
		List<Generator> generators = EcoreUtil2.getAllContentsOfType(editorModel, Generator.class);
		generators.forEach(g -> fileGenerator.generateGenClass(generatorPackage, g));

		List<Pattern> patterns = EcoreUtil2.getAllContentsOfType(editorModel, Pattern.class);
		patterns.forEach(p -> fileGenerator.generatePatternClass(patternPackage, p));

	}

	/**
	 * Creates the given folder (and any missing intermediate folders) if it does
	 * not exist yet.
	 *
	 * @param folder
	 * @param monitor
	 */
	private void createFolderIfNotExists(final IFolder folder, final IProgressMonitor monitor) throws CoreException {
		final IPath projectRelativePath = folder.getProjectRelativePath();
		final int segmentCount = projectRelativePath.segmentCount();
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + folder, segmentCount);
		for (int i = segmentCount - 1; i >= 0; --i) {
			final IFolder subFolder = folder.getProject().getFolder(projectRelativePath.removeLastSegments(i));
			if (!subFolder.exists())
				subFolder.create(true, true, subMon.split(1));
		}
	}
	
	/**
	 * Adds the plug-in dependencies to the build path and thus adds them to the build path
	 * @param project
	 * @throws JavaModelException
	 */
	private void addPluginDependenciesToBuildPath(IProject project) throws JavaModelException {
		// org.eclipse.pde.core.requiredPlugins
		IJavaProject javaProject = JavaCore.create(project);
		final IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		final IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		IPath requiredPlugins = new Path("org.eclipse.pde.core.requiredPlugins");
		newEntries[oldEntries.length] = JavaCore.newContainerEntry(requiredPlugins);
		javaProject.setRawClasspath(newEntries, null);
	}

	public void createFolders(IProject project) throws CoreException {
		createFolderIfNotExists(project.getFolder(DEFAULT_SRC_LOCATION), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("bin"), new NullProgressMonitor());
		
		IFolder srcGenFolder = project.getFolder(SOURCE_GEN_FOLDER);
		createFolderIfNotExists(srcGenFolder, new NullProgressMonitor());
		ClasspathUtil.makeSourceFolderIfNecessary(srcGenFolder);
		
		createFolderIfNotExists(project.getFolder(SOURCE_GEN_FOLDER + "/" + project.getName().replace(".", "/") + "/" + DEFAULT_API_LOCATION),
				new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder(SOURCE_GEN_FOLDER + "/" + project.getName().replace(".", "/") + "/" + DEFAULT_PATTERN_LOCATION),
				new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder(SOURCE_GEN_FOLDER + "/" + project.getName().replace(".", "/") + "/" + DEFAULT_GENERATOR_LOCATION),
				new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder(DEFAULT_MODEL_LOCATION),
				new NullProgressMonitor());
	}

	private void updateManifest(final IProject project, final BiFunction<IProject, Manifest, Boolean> updateFunction)
			throws CoreException {
		 new ManifestFileUpdater().processManifest(project, manifest ->
		 updateFunction.apply(project, manifest));
	}

	private boolean processManifestForPackage(IProject project, Manifest manifest) {
		List<String> dependencies = new ArrayList<String>();
		dependencies.addAll(Arrays.asList("org.eclipse.emf.ecore", "org.moflon.mofgen.api"));
		Set<String> ePackageDependencies = globalPackageRegistry.values().stream().map(p -> ((EPackage)p).getNsPrefix()).collect(Collectors.toSet());
		dependencies.addAll(ePackageDependencies);
		boolean changedBasics = ManifestFileUpdater.setBasicProperties(manifest, project.getName());
		boolean updatedDependencies = ManifestFileUpdater.updateDependencies(manifest, dependencies);
		
		return changedBasics || updatedDependencies;
	}

	public static void findAllEPackages(final MofgenFile mofgenFile, final Registry packageRegistry) {
		// TODO go through imports rather than nodes
		EcoreUtil2.getAllContentsOfType(mofgenFile, Node.class).forEach(node -> {
			EPackage foreign = node.getType().getEPackage();
			if (!packageRegistry.containsKey(foreign.getNsURI())) {
				packageRegistry.put(foreign.getNsURI(), foreign);
			}
		});
	}

	private IFolder ensureFolderExists(final IFolder folder) {
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				logger.warn("Failed to create folder " + folder.toString() + " with exception:\n" + e.getMessage());
			}
		}
		return folder;
	}

	public static String getClassNamePrefix(final IProject project) {
		URI projectNameAsURI = URI.createFileURI(project.getName().replace(".", "/"));
		String prefix = projectNameAsURI.lastSegment();
		return Character.toUpperCase(prefix.charAt(0)) + prefix.substring(1);
	}

	public static EClassifiersManager createEClassifierManager(final Registry packageRegistry) {
		EClassifiersManager eClassifiersManager = new EClassifiersManager(new HashMap<>());
		packageRegistry.values().stream().filter(x -> (x instanceof EPackage)).forEach(obj -> {
			EPackage epackage = (EPackage) obj;
			eClassifiersManager.loadMetaModelClasses(epackage.eResource());
		});
		return eClassifiersManager;
	}

	public static void saveResource(EObject object, String path) {
		// save for debugging
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource output = rs.createResource(URI.createURI(path));
		output.getContents().add(object);
		Map<Object, Object> saveOptions = ((XMIResource) output).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		try {
			((XMIResource) output).save(saveOptions);
		} catch (IOException e) {
			logger.warn("Saving resource failed with message: "+e.getMessage()+"\n"+e.getStackTrace());
		}
		System.out.println("GrapeLModel model saved to: " + output.getURI().path());
	}
	
	private List<IFile> getMofgenFiles(final IProject project) throws Exception {
		List<IFile> files = new LinkedList<>();
		crawlSubfolders(project.getFolder(DEFAULT_SRC_LOCATION), files);
		return files.stream() //
				.filter(f -> MOFGEN_FILE_EXTENSION.equals(f.getFileExtension()) && f.exists()) //
				.collect(Collectors.toList());
	}

	private void removeGeneratedCode(IProject project, String pathString) {
		IPath path = Path.fromOSString(pathString);
		if(path.lastSegment().equals("**")) {
			IFolder folder = project.getFolder(path.removeLastSegments(1));
			try {
				folder.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				logger.error("Error occured when deleting old code.");
				logger.error(e.toString());
				e.printStackTrace();
			}
		}else {
			IFolder folder = project.getFolder(path);
			IFile file = project.getFile(path);
			try {
				folder.delete(true,  new NullProgressMonitor());
				file.delete(true,  new NullProgressMonitor());
			} catch (CoreException e) {
				logger.error("Error occured when deleting old code.");
				logger.error(e.toString());
				e.printStackTrace();
			}
		}
	}
	
	private void crawlSubfolders(final IFolder root, final List<IFile> files) throws CoreException {
		if (!root.exists())
			return;
		IResource[] members = root.members();
		for (int i = 0; i < members.length; i++) {
			IResource current = members[i];
			if (current.getType() == IResource.FILE) {
				files.add((IFile) current);
			} else if (current.getType() == IResource.FOLDER) {
				crawlSubfolders((IFolder) current, files);
			}
		}
	}

}
