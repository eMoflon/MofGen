package org.mofgen.build;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mofgen.api.EClassifiersManager;
import org.mofgen.generator.MofgenBuilderExtension;
import org.mofgen.mGLang.MofgenFile;


public class MofgenBuilder implements MofgenBuilderExtension{

	@Override
	public void run(IProject project, Resource resource) {
		System.out.println("Running extension: " + this.getClass().getSimpleName());
		System.out.println("Given project: " + project.getName());
		System.out.println("Given resource: " + resource.getURI());
		
		// clean old code and create folders
		try {
			removeGeneratedCode(project, "src-gen/**");
			createFolders(project);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
//		// Create intermediate grapel model and ibex patterns
//		MofgenFile grapelFile = (MofgenFile) resource.getContents().get(0);
//		
//		if(ibexModel!= null) {
//			try {
//				// TODO
//				//updateManifest(project, this::processManifestForPackage);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				return;
//			}
//		}
//		
//		//TODO: Build Mofgen API
//		GrapelAPIGenerator apiGenerator = new GrapelAPIGenerator(project, container, Arrays.asList("Democles", "HiPE", "Viatra"));
//		try {
//			apiGenerator.generateCode();
//		} catch (CoreException e1) {
//			e1.printStackTrace();
//			//cleanup
//			if(container.eResource() != null)
//				container.eResource().unload();
//			return;
//		}
//		
//		//cleanup
//		if(container.eResource() != null)
//			container.eResource().unload();
//		
//		try {
//			project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
//		} catch (CoreException e) {
//			e.printStackTrace();
//			return;
//		}
	}

	public static void removeGeneratedCode(final IProject project, final String pattern) throws CoreException {
		// TODO Switch to this kind of traversal for optimal performance
//		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
//				new AntPatternCondition(new String[] { pattern }) //
//				);
//		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}
	
	/**
	 * Creates the given folder (and any missing intermediate folders) if it does
	 * not exist yet.
	 *
	 * @param folder
	 * @param monitor
	 */
	private void createFolderIfNotExists(final IFolder folder, final IProgressMonitor monitor)
			throws CoreException {
		final IPath projectRelativePath = folder.getProjectRelativePath();
		final int segmentCount = projectRelativePath.segmentCount();
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + folder, segmentCount);
		for (int i = segmentCount - 1; i >= 0; --i) {
			final IFolder subFolder = folder.getProject().getFolder(projectRelativePath.removeLastSegments(i));
			if (!subFolder.exists())
				subFolder.create(true, true, subMon.split(1));
		}
	}
	
	public void createFolders(IProject project) throws CoreException {
		createFolderIfNotExists(project.getFolder("src"), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("bin"), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("src-gen"), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api"), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api/patterns"), new NullProgressMonitor());
		createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api/gens"), new NullProgressMonitor());
	}
	
	private void updateManifest(final IProject project, final BiFunction<IProject, Manifest, Boolean> updateFunction) throws CoreException {
		// TODO
		// new ManifestFileUpdater().processManifest(project, manifest -> updateFunction.apply(project, manifest));
	}
	
	private boolean processManifestForPackage(IProject project, Manifest manifest) {
		// TODO
		return false;
//		List<String> dependencies = new ArrayList<String>();
//		dependencies.addAll(Arrays.asList("org.emoflon.ibex.common", "org.emoflon.ibex.gt", "grapelmodel"));
//		collectEngineExtensions().forEach(engine -> dependencies.addAll(engine.getDependencies()));
//		boolean changedBasics = ManifestFileUpdater.setBasicProperties(manifest, project.getName());
//		boolean updatedDependencies = ManifestFileUpdater.updateDependencies(manifest, dependencies);
//		return changedBasics || updatedDependencies;
	}
	
//	public static Collection<GTEngineBuilderExtension> collectEngineBuilderExtensions() {
//		return ExtensionsUtil.collectExtensions(GTEngineBuilderExtension.BUILDER_EXTENSON_ID, "class", GTEngineBuilderExtension.class);
//	}
//	
//	public static void findAllEPackages(final MofgenFile mofgenFile, final Registry packageRegistry) {
//		mofgenFile.getNodeSet().getNodes().forEach(node -> {
//			EPackage foreign = node.getType().getEPackage();
//			if(!packageRegistry.containsKey(foreign.getNsURI())) {
//				packageRegistry.put(foreign.getNsURI(), foreign);
//			}
//		});
//	}
	
	public static void generateAPI(final IProject project, final IFolder apiPackage, final MofgenFile mofgenFile,
			final Registry packageRegistry) throws CoreException {
		// TODO
//		JavaFileGenerator generator = new JavaFileGenerator(getClassNamePrefix(project), project.getName(), createEClassifierManager(packageRegistry));
//		IFolder matchesPackage = ensureFolderExists(apiPackage.getFolder("matches"));
//		IFolder rulesPackage = ensureFolderExists(apiPackage.getFolder("rules"));
//		IFolder probabilitiesPackage = ensureFolderExists(apiPackage.getFolder("probabilities"));
//		
//		Set<IBeXPattern> ruleContextPatterns = new HashSet<>();
//		ibexModel.getRuleSet().getRules().forEach(ibexRule -> {
//			generator.generateMatchClass(matchesPackage, ibexRule);
//			generator.generateRuleClass(rulesPackage, ibexRule);
//			generator.generateProbabilityClass(probabilitiesPackage, ibexRule);
//			ruleContextPatterns.add(ibexRule.getLhs());
//		});
//		
//		ibexModel.getPatternSet().getContextPatterns().stream()
//		.filter(pattern -> !ruleContextPatterns.contains(pattern))
//		.filter(pattern -> !pattern.getName().contains("CONDITION"))
//		.forEach(pattern -> {
//			generator.generateMatchClass(matchesPackage, pattern);
//			generator.generatePatternClass(rulesPackage, pattern);
//		});
//
//		generator.generateAPIClass(apiPackage, ibexModel,
//				String.format("%s/%s/%s/api/ibex-patterns.xmi", project.getName(), "src-gen", project.getName().replace(".", "/")));
//		generator.generateAppClass(apiPackage);
	}
	
	public static IFolder ensureFolderExists(final IFolder folder) throws CoreException{
		if (!folder.exists()) {
			folder.create(true, true, null);
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
		//save for debugging
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource output = rs.createResource(URI.createURI(path));
		output.getContents().add(object);
		Map<Object, Object> saveOptions = ((XMIResource)output).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		try {
			((XMIResource)output).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("GrapeLModel model saved to: "+output.getURI().path());
	}

}
