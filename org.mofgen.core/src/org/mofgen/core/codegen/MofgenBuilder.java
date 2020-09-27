package org.mofgen.core.codegen;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.mofgen.MGLangStandaloneSetup;
import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.MofgenFile;
import org.moflon.core.utilities.LogUtils;

public class MofgenBuilder{

	public static final Logger logger = Logger.getLogger(MofgenBuilder.class);
	
	public static final String DEFAULT_SRC_LOCATION = "src";
	public static final String MOFGEN_FILE_EXTENSION = "mofgen";

//	@Override
	public void run(final IProject project, final IProgressMonitor monitor) {
		logger.log(Priority.INFO, "Running MofGenBuilder:");
		double tic = System.currentTimeMillis();
		MGLangStandaloneSetup.doSetup();

		logger.log(Priority.INFO, "Creating API..");
		List<IFile> mofgenFiles = null;
		try {
			mofgenFiles = getFiles(project);
		} catch (Exception e) {
			logger.error("Could not gather necessary .mofgen-files. Error: \n" + e.getMessage());
			return;
		}

//		IFolder metamodelFolder = project.getFolder(SimSGBuilder.DEFAULT_METAMODEL_LOCATION);
//		IFolder instancesFolder = project.getFolder(SimSGBuilder.DEFAULT_MODEL_LOCATION);
//		IFolder definitionsFolder = project.getFolder(SimSGBuilder.DEFAULT_DEFINITION_LOCATION);
//		
//		final IPath instancesPath = instancesFolder.getLocation();
//
//		final String metamodelLocation = metamodelFolder.getFullPath().toPortableString();
//		final String instancesLocation = instancesFolder.getFullPath().toPortableString();
//		final String definitionsLocation = definitionsFolder.getFullPath().toPortableString();
//		
//		final String metamodelProjectRelative = metamodelFolder.getProjectRelativePath().toPortableString();
//		final String instancesProjectRelative = instancesFolder.getProjectRelativePath().toPortableString();
//
//		final String intermediateModelSuffix = "_intermediate.xmi";
//		final String containerSuffix = "_container.xmi";
//		final String ibexPatternsSuffix = "_ibexpatterns.xmi";
//		final String definitionSuffix = "_definition.xmi";
//
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Map<IFile, MofgenFile> editorModels = new HashMap<>();

		mofgenFiles.forEach(mofgenFile -> {
			URI uri = URI.createPlatformResourceURI(mofgenFile.getFullPath().toString(), true);
			Resource file = resourceSet.getResource(uri, true);
			try {
				EcoreUtil2.resolveLazyCrossReferences(file, () -> false);
			} catch (WrappedException e) {
				logger.log(Priority.INFO,
						String.format("Error resolving cross references in file %s.", mofgenFile.getName()));
				return;
			}

			if (!file.getContents().isEmpty()) {
				MofgenFile editorModel = (MofgenFile) file.getContents().get(0);
				editorModels.put(mofgenFile, editorModel);
			}
		});
		EcoreUtil.resolveAll(resourceSet);

		double toc = System.currentTimeMillis();
		logger.log(Priority.INFO,
				"Creating API.. Done! (" + (toc - tic) / 1000.0 + " seconds.)");
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
	 * Returns the list of .react files.
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
