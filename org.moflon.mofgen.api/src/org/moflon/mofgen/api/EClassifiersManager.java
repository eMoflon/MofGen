package org.moflon.mofgen.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.moflon.core.utilities.*;
import org.moflon.mofgen.lang.interpreter.TypeCalculator;
import org.moflon.mofgen.lang.mofgenLanguage.Collection;
import org.moflon.mofgen.lang.mofgenLanguage.MofgenFile;
import org.moflon.mofgen.lang.mofgenLanguage.Node;
import org.moflon.mofgen.lang.mofgenLanguage.ParameterNodeOrPattern;
import org.moflon.mofgen.lang.mofgenLanguage.VariableDeclaration;

/**
 * This class manages the mapping between names of EClasses/EDataTypes to the
 * name of the meta-model.
 */
public class EClassifiersManager {
	/**
	 * The mapping eClassifier name to the name of the package containing the
	 * meta-model code.
	 */
	private Map<String, String> eClassifierNameToPath = new HashMap<String, String>();

	/**
	 * The mapping name of the meta-model Java Package to the name of the package
	 * containing it.
	 */
	private Map<String, String> packageNameToPath = new HashMap<String, String>();
	private Map<String, String> factoryNameToPath = new HashMap<String, String>();

	/**
	 * The mappings of URIs to package paths set via the properties file.
	 */
	private final Map<String, String> mappings;

	/**
	 * Creates a new EClassifiersManager.
	 * 
	 * @param mappings the mappings of URIs to package paths set via the properties
	 *                 file
	 */
	public EClassifiersManager(final Map<String, String> mappings) {
		this.mappings = mappings;
	}

	/**
	 * Loads the EClasses from the given meta-model resource.
	 * 
	 * @param ecoreFile the resource
	 */
	public void loadMetaModelClasses(final Resource ecoreFile) {
		EObject rootElement = ecoreFile.getContents().get(0);
		if (rootElement instanceof EPackage) {
			loadMetaModelClasses((EPackage) rootElement);
		}
	}

	/**
	 * Loads the EClasses from the given package.
	 * 
	 * @param ePackage the package
	 */
	private void loadMetaModelClasses(final EPackage ePackage) {
		boolean isEcore = "ecore".equals(ePackage.getName());
		String name = isEcore ? "org.eclipse.emf.ecore" : getPackagePath(ePackage);
		ePackage.getEClassifiers().stream() //
				.filter(c -> !isEcore || c instanceof EClass) //
				.forEach(c -> eClassifierNameToPath.put(c.getName(), name));
		if (!isEcore) {
			addPackage(ePackage);
		}

		ePackage.getESubpackages().forEach(p -> loadMetaModelClasses(p));
	}

	/**
	 * Returns the import path for the Java package containing the code for the
	 * given Ecore package.
	 * 
	 * @param ePackage the package
	 * @return the import path for package
	 */
	private String getPackagePath(final EPackage ePackage) {
		String uriString = ePackage.eResource().getURI().toString();
		if (mappings.containsKey(uriString)) {
			return mappings.get(uriString);
		} else {
			return EcoreUtils.getFQNIfPossible(ePackage).orElse(ePackage.getName());
		}
	}

	/**
	 * Adds the EPackage to the meta-models.
	 * 
	 * @param ePackage the package to add
	 */
	private void addPackage(final EPackage ePackage) {
		String packageClassName = getPackageClassName(ePackage.getName());
		String factoryClassName = getFactoryClassName(ePackage.getName());
		String packageImport = getPackagePath(ePackage) + "." + packageClassName;
		String factoryImport = getPackagePath(ePackage) + "." + factoryClassName;
		packageImport = correctPackageImportWithMapping(packageImport);
		packageNameToPath.put(packageClassName, packageImport);
		factoryNameToPath.put(packageClassName, factoryImport);
	}

	/**
	 * Give the user the chance to correct any package mapping with values in the
	 * property file.
	 * 
	 * @param packageImport initial import
	 * @return fixed import
	 */
	private String correctPackageImportWithMapping(String packageImport) {
		if (mappings.containsKey(packageImport))
			return mappings.get(packageImport);
		return packageImport;
	}

	/**
	 * Return the name of the Factory class.
	 * 
	 * @param modelName the package of the meta-model
	 */
	private static String getPackageClassName(String modelName) {
		return Character.toUpperCase(modelName.charAt(0)) + modelName.substring(1) + "Package";
	}

	/**
	 * Return the name of the Package class.
	 * 
	 * @param modelName the package of the meta-model
	 */
	private static String getFactoryClassName(String modelName) {
		return Character.toUpperCase(modelName.charAt(0)) + modelName.substring(1) + "Factory";
	}

	/**
	 * Determines the set of necessary imports for the given EClassifiers.
	 * 
	 * @param types the EClassifiers to import
	 * @return the types for Java import statements
	 */
	private Set<String> getImportsForTypes(final Set<? extends EClassifier> types) {
		Set<String> imports = new TreeSet<String>();
		types.stream().distinct().forEach(eClassifier -> {
			String typePackageName = eClassifierNameToPath.get(eClassifier.getName());
			if (typePackageName != null) {
				imports.add(typePackageName + '.' + eClassifier.getName());
			}
		});
		return imports;
	}

	/**
	 * Determines the set of necessary imports for the given editor model.
	 * @param editorModel the editor model to search
	 * @return the types for Java import statements
	 */
	public Set<String> getAllImports(MofgenFile editorModel){
		Set<String> imports = new TreeSet<String>();
		imports.addAll(getImportsForNodeTypes(EcoreUtil2.getAllContentsOfType(editorModel, Node.class)));
		imports.addAll(getImportsForParameterNodeTypes(EcoreUtil2.getAllContentsOfType(editorModel, ParameterNodeOrPattern.class)));
		imports.addAll(getImportsForCollectionTypes(EcoreUtil2.getAllContentsOfType(editorModel, Collection.class)));
		imports.addAll(getImportsForPackages());
		imports.addAll(getImportsForFactories());
		imports.addAll(getImportsForVariableTypes(EcoreUtil2.getAllContentsOfType(editorModel, VariableDeclaration.class)));
		return imports;
	}

	/**
	 * Determines the set of necessary type imports for a set of nodes.
	 * 
	 * @param nodes the nodes
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForNodeTypes(final List<Node> nodes) {
		return getImportsForTypes(nodes.stream().map(n -> n.getType()).collect(Collectors.toSet()));
	}

	/**
	 * Determines the set of necessary type imports for a list of parameter nodes.
	 * 
	 * @param parameters the parameters
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForParameterNodeTypes(final List<ParameterNodeOrPattern> parameters) {
		return getImportsForTypes(parameters.stream().filter(n -> n.getType() instanceof EClass)
				.map(n -> (EClass) n.getType()).collect(Collectors.toSet()));
	}

	/**
	 * Determines the set of necessary type imports for a list of variables
	 * (definitions and declarations)
	 * 
	 * @param parameters the parameters
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForVariableTypes(final List<VariableDeclaration> decls) {
		return getImportsForTypes(decls.stream().map(d -> (EClassifier) d.getType()).collect(Collectors.toSet()));
	}

	/**
	 * Determines the set of necessary type imports for a set of collections.
	 * 
	 * @param parameters the parameters
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForCollectionTypes(final List<Collection> colls) {
		Set<EClassifier> typeSet = new HashSet<>();
		for (Collection c : colls) {
			if (c instanceof org.moflon.mofgen.lang.mofgenLanguage.List) {
				EObject val = TypeCalculator.getListType((org.moflon.mofgen.lang.mofgenLanguage.List) c);
				if (val instanceof EClassifier) {
					typeSet.add((EClassifier) val);
				}
			} else if (c instanceof org.moflon.mofgen.lang.mofgenLanguage.Map) {
				typeSet.add(TypeCalculator.getMapType((org.moflon.mofgen.lang.mofgenLanguage.Map) c, true));
				typeSet.add(TypeCalculator.getMapType((org.moflon.mofgen.lang.mofgenLanguage.Map) c, false));
			} else {
				throw new IllegalStateException("There should be no collection of type other than List or Map");
			}
		}
		return getImportsForTypes(typeSet);
	}

	/**
	 * Provides the corresponding Package- and Factory- classes
	 * 
	 * @param ePackage - the wanted package
	 * @return the import names as Strings
	 */
	public Set<String> getImportsForEPackages(final Set<EPackage> ePackages) {
		Set<String> imports = new HashSet<>();
		for (EPackage ePackage : ePackages) {
			imports.add(ePackage.getNsPrefix() + "Package");
			imports.add(ePackage.getNsPrefix() + "Factory");
		}
		return imports;
	}

	/**
	 * Returns the names of the meta-model packages.
	 * 
	 * @return names of the meta-model packages
	 */
	public Set<String> getPackages() {
		return packageNameToPath.keySet();
	}

	/**
	 * Determines the set of necessary imports for the meta-models packages.
	 * 
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForPackages() {
		return new HashSet<String>(packageNameToPath.values());
	}

	/**
	 * Determines the set of necessary imports for the meta-models factories.
	 * 
	 * @return the types for Java import statements
	 */
	public Set<String> getImportsForFactories() {
		return new HashSet<String>(factoryNameToPath.values());
	}
}
