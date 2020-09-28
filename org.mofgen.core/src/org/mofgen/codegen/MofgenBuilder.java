package org.mofgen.codegen;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.mofgen.MGLangStandaloneSetup;
import org.mofgen.api.EClassifiersManager;
import org.mofgen.codegen.JavaFileGenerator;
import org.mofgen.mGLang.Generator;
import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.MofgenFile;
import org.mofgen.mGLang.Pattern;
import org.mofgen.util.NameProvider;
import org.moflon.core.utilities.LogUtils;

import glossarDocumentation.GlossarDocumentationPackage;;

public class MofgenBuilder {

	public static final Logger logger = Logger.getLogger(MofgenBuilder.class);

	protected static final String DEFAULT_SRC_LOCATION = "src";
	public static final String MOFGEN_FILE_EXTENSION = "mofgen";
	protected static final String DEFAULT_GENERATOR_LOCATION = "api/generators";
	protected static final String DEFAULT_PATTERN_LOCATION = "api/patterns";

	/**
	 * The name of the source folder containing the generated API.
	 */
	private final static String SOURCE_GEN_FOLDER = "src-gen";

	/**
	 * The project which is built.
	 */
	protected IProject project;

	/**
	 * The path of the package which is built.
	 */
	private IPath path;

	/**
	 * The name of the package.
	 */
	private String packageName;

//	@Override
//	public void run(final IProject project, final IProgressMonitor monitor) {
	public void run() {
		logger.info("Running MofGenBuilder:");
		MGLangPackage.eINSTANCE.eClass();
		double tic = System.currentTimeMillis();
		MGLangStandaloneSetup.doSetup();

		logger.info("Creating API..");

		// TODO replace:
//		List<IFile> mofgenFiles = null;
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		IProject project = root.getProject("mofgenTest");
//		try {
//			mofgenFiles = getFiles(project);
//		} catch (Exception e) {
//			logger.error("Could not gather necessary .mofgen-files. Error: \n" + e.getMessage());
//			return;
//		}

//		IFolder apiPackage = ensureSourceGenPackageExists(); TODO uncomment

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Map<IFile, MofgenFile> editorModels = new HashMap<>();
		Set<String> metaModels = new HashSet<String>();

//		mofgenFiles.forEach(mofgenFile -> {
//			URI uri = URI.createPlatformResourceURI(mofgenFile.getFullPath().toString(), true);
//			Resource file = resourceSet.getResource(uri, true);
//			try {
//				EcoreUtil2.resolveLazyCrossReferences(file, () -> false);
//			} catch (WrappedException e) {
//				logger.info(
//						String.format("Error resolving cross references in file %s.", mofgenFile.getName()));
//				return;
//			}
//
//			if (!file.getContents().isEmpty()) {
//				MofgenFile editorModel = (MofgenFile) file.getContents().get(0);
//				editorModels.put(mofgenFile, editorModel);
//				editorModel.getImports().forEach(i -> metaModels.add(i.getUri())); //TODO works like this?
//			}
//		});

		String mofgenFilePath = "D:\\Workspaces\\runtime-EclipseApplication\\mofgenTest\\src\\test.mofgen";
//		URI uri = URI.createPlatformResourceURI(mofgenFilePath, true);
		URI uri = URI.createFileURI(mofgenFilePath);
		Resource file = resourceSet.getResource(uri, true);
		try {
			EcoreUtil2.resolveLazyCrossReferences(file, () -> false);
		} catch (WrappedException e) {
//			logger.info(String.format("Error resolving cross references in file %s.", mofgenFile.getName()));
			logger.info(String.format("Error resolving cross references in file %s.", mofgenFilePath));
			return;
		}
		MofgenFile editorModel = null;
		if (!file.getContents().isEmpty()) {
			editorModel = (MofgenFile) file.getContents().get(0);
//			editorModels.put(mofgenFile, editorModel);
			editorModel.getImports().forEach(i -> metaModels.add(i.getUri()));
		}

		EcoreUtil.resolveAll(resourceSet);

//		for (Entry<IFile, MofgenFile> e : editorModels.entrySet()) {
//			generateAPI(apiPackage, e.getKey(), e.getValue(), loadMetaModels(metaModels, resourceSet));
//		} TODO replace
		generateAPI(editorModel, loadMetaModels(metaModels, resourceSet));
		double toc = System.currentTimeMillis();
		logger.info("Creating API.. Done! (" + (toc - tic) / 1000.0 + " seconds.)");
	}

	/**
	 * Generate a Rule and a Match class for every rule and the API class.
	 * 
	 * @param apiPackage          the package containing the API code
	 * @param gtRuleSet           the graph transformation rules
	 * @param eClassifiersManager the EClassifiers handler
	 */
	private void generateAPI(/* final IFolder apiPackage, final IFile mofgenFile, TODO */ final MofgenFile editorModel,
			final EClassifiersManager eClassifiersManager) {
		JavaFileGenerator fileGenerator = new JavaFileGenerator(
				"test"/* NameProvider.getClassNamePrefix(mofgenFile) TODO */, packageName, editorModel,
				eClassifiersManager);
//		IFolder generatorPackage = ensureFolderExists(apiPackage.getFolder(DEFAULT_GENERATOR_LOCATION));
//		IFolder patternPackage = ensureFolderExists(apiPackage.getFolder(DEFAULT_PATTERN_LOCATION));

		List<Generator> generators = EcoreUtil2.getAllContentsOfType(editorModel, Generator.class);
		generators.forEach(g -> fileGenerator.generateGenClass(g));

		List<Pattern> patterns = EcoreUtil2.getAllContentsOfType(editorModel, Pattern.class);
		patterns.forEach(p -> fileGenerator.generatePatternClass(p));
	}

	public static void saveResource(EObject model, String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		URI uri = URI.createFileURI(path);
		Resource modelResource = rs.createResource(uri);
		modelResource.getContents().add(model);

		Map<Object, Object> saveOptions = ((XMIResource) modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);

		try {
			((XMIResource) modelResource).save(saveOptions);
		} catch (IOException e) {
			LogUtils.error(logger, "Couldn't save resource: \n " + e.getMessage());
		}
//		modelResource.unload();
	}

	/**
	 * Creates the target package.
	 * 
	 * @return the folder
	 */
	private IFolder ensureSourceGenPackageExists() {
		IFolder folder = ensureFolderExists(project.getFolder(SOURCE_GEN_FOLDER));
		for (int i = 0; (i < path.segmentCount()); i++) {
			folder = ensureFolderExists(folder.getFolder(path.segment(i)));
		}
		folder = folder.getFolder("api");
		if (folder.exists()) {
			try {
				folder.delete(true, null);
			} catch (CoreException e) {
				logger.error("Could not delete old package.");
			}
		}
		return ensureFolderExists(folder);
	}

	/**
	 * Creates the given folder if the folder does not exist yet.
	 */
	private IFolder ensureFolderExists(final IFolder folder) {
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				logger.warn("Could not create folder " + folder.getName() + ".");
			}
		}
		return folder;
	}

	/**
	 * Returns the list of .mofgen files.
	 * 
	 * @return the list of files
	 */
	private List<IFile> getFiles(final IProject project) throws Exception {
		List<IFile> files = new LinkedList<>();
		crawlSubfolders(project.getFolder(DEFAULT_SRC_LOCATION), files);
		return files.stream() //
				.filter(f -> MOFGEN_FILE_EXTENSION.equals(f.getFileExtension()) && f.exists()) //
				.collect(Collectors.toList());
	}

	/**
	 * Loads the EClassifiers from the meta-models into an EClassifiersManager.
	 * 
	 * @param metaModels  the meta-model URIs
	 * @param resourceSet the resource set
	 * @return the mapping between EClassifier names to meta-model names
	 */
	private EClassifiersManager loadMetaModels(final Set<String> metaModels, final ResourceSet resourceSet) {
//		Map<String, String> map = MoflonPropertiesContainerHelper.loadIfExists(project) //
//				.map(m -> m.getImportMappings()) //
//				.map(i -> MoflonPropertiesContainerHelper.mappingsToMap(i)) //
//				.orElse(new HashMap<String, String>()); TODO?

		Map<String, String> map = new HashMap<>(); 
		EClassifiersManager eClassifiersManager = new EClassifiersManager(map);
		
		//TODO Cannot load ?
		GlossarDocumentationPackage.eINSTANCE.eClass();
		MGLangPackage.eINSTANCE.eClass();
		
		metaModels.forEach(uri -> {
			try {
				Resource ecoreFile = resourceSet.getResource(URI.createPlatformResourceURI(uri, true), true);
				ecoreFile.load(null);
				eClassifiersManager.loadMetaModelClasses(ecoreFile);
			} catch (Exception e) {
				logger.error("Could not load meta-model " + uri + ".");
			}
		});
		return eClassifiersManager;
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
