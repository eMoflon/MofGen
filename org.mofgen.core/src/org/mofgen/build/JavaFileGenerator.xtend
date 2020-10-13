package org.mofgen.build

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.api.EClassifiersManager
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.MofgenFile
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeContent
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.util.NameProvider
import org.eclipse.emf.ecore.EClass
import org.mofgen.util.MofgenUtil
import java.util.List

/**
 * This class contains the templates for the API Java classes.
 */
class JavaFileGenerator {

	static Logger logger = MofgenBuilder.logger

	/**
	 * The name of the package.
	 */
	String packageName

	/**
	 * The prefix for the API class name.
	 */
	String classNamePrefix

	/**
	 * The Name of the inherited generator super class
	 */
	final String APP_SUPER_CLASS = "MofgenApp"

	/**
	 * The Name of the inherited generator super class
	 */
	final String GENERATOR_SUPER_CLASS = "MofgenGenerator"

	/**
	 * The Name of the inherited pattern super class
	 */
	final String PATTERN_SUPER_CLASS = "MofgenPattern"

	/**
	 * Utility to handle the mapping between EClassifier names to meta-model names.
	 */
	EClassifiersManager eClassifiersManager

	MofgenFile editorModel;

	/**
	 * Creates a new JavaFileGenerator.
	 */
	new(String classNamePrefix, String packageName, MofgenFile editorModel, EClassifiersManager eClassifiersManager) {
		this.classNamePrefix = classNamePrefix
		this.packageName = packageName
		this.eClassifiersManager = eClassifiersManager
		this.editorModel = editorModel
		triggerTypeRegistry(editorModel)
	}

	/**
	 * Generates the Java App class.
	 */
	def generateAppClass(IFolder appPackage) {
		val imports = eClassifiersManager.importsForPackages
		imports.addAll('java.util.LinkedList', 'java.util.List', 'org.mofgen.api.MofgenApp', 'org.mofgen.api.MofgenGenerator',
		'SimpleMofgen.api.generators.TestGenerator', 'org.eclipse.emf.ecore.EObject')

		val generators = EcoreUtil2.getAllContentsOfType(editorModel, Generator)

		val appSourceCode = '''
			«printHeader(appPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_API_LOCATION), imports)»
			
			/**
			 * A mofgen application.
			 */
			public class «NameProvider.getAppClassName(appPackage.project.name)» extends «APP_SUPER_CLASS»{
				
				/**
				* A list containing all defined generators
				*/
				List<MofgenGenerator> generators;
				
				/**
				 * Creates a mofgen application
				 * 
				 * @param workspacePath «««TODO maybe utilize workspace path here»»
					       	     the workspace path
				 */
				public «NameProvider.getAppClassName(appPackage.project.name)»(final String workspacePath) {
					«««super(workspacePath);
					generators = new LinkedList<>();
					«FOR gen : generators»
						generators.add(new «NameProvider.getGeneratorClassName(gen)»("«gen.name»"));
					«ENDFOR»
				}
				
				@Override
				public void startGeneration(){
					System.out.println("Starting generation...");
					for(MofgenGenerator gen : generators){
						System.out.println("Starting generator "+gen.getName()+"...");
						EObject result = gen.start();
						
						String path = "D:\\Workspaces\\runtime-EclipseApplication\\SimpleMofgen\\generatedModels"; «««TODO 
						saveResource(result, path, gen.getName());
					}
					System.out.println("Done!");
				}
			}
		'''
		writeFile(appPackage.getFile(NameProvider.getAppClassName(appPackage.project.name) + '.java'), appSourceCode)
	}

	/**
	 * Generates the Java Generator class for the given generator.
	 */
	def generateGenClass(IFolder genPackage, Generator gen) {
		val imports = newHashSet('java.util.ArrayList', 'java.util.List', 'java.util.Map', 'java.util.HashMap',
			'java.util.LinkedList', 'org.eclipse.emf.ecore.EObject', 'org.mofgen.api.MofgenGenerator')
		imports.add(genPackage.project.name + '.api.patterns.*')
		imports.addAll(eClassifiersManager.getAllImports(editorModel))

		val genSourceCode = '''
			«printHeader(genPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_GENERATOR_LOCATION), imports)»
			
			/**
			 * The generator «NameProvider.getGeneratorClassName(gen)».
			 */
			public class «NameProvider.getGeneratorClassName(gen)» extends «GENERATOR_SUPER_CLASS» {
			
				public «NameProvider.getGeneratorClassName(gen)» (String name){
					this.name = name;
				}
			
				@Override
				/**
				* Runs the specified generator with the given parameters.
				* @return the EObject to be saved aka the containing root object of the generated structure (Must be specified by the user!)
				*/
				public EObject start(«IF gen.params.size == 0») {«ELSE»,«ENDIF»
				«FOR parameter : gen.params SEPARATOR ', ' AFTER '){'»final «getJavaTypeAsString(parameter)» «parameter.name»Value«ENDFOR»
				«FOR expression : gen.commands»
					«GeneratorTranslator.translate(expression)»;
				«ENDFOR»
				}				
			}
			
		'''
		// TODO provide overriding toString implementation
		writeFile(genPackage.getFile(NameProvider.getGeneratorClassName(gen) + ".java"), genSourceCode)
	}

	/**
	 * Generates the Java Generator class for the given pattern.
	 */
	def generatePatternClass(IFolder patternPackage, Pattern pattern) {
		val imports = eClassifiersManager.getAllImports(editorModel)
		imports.addAll(
			'org.mofgen.api.MofgenPattern',
			'org.eclipse.emf.ecore.EObject'
		)

		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)

		val patternParameterTypes = newHashMap();
		if (!pattern.parameters.empty) {
			for (parameter : pattern.parameters) {
				if (parameter instanceof PrimitiveParameter) {
					patternParameterTypes.put(parameter, parameter.type.literal)
				} else if (parameter instanceof ParameterNodeOrPattern) {
					val type = parameter.type
					if (type instanceof EClass) {
						patternParameterTypes.put(parameter, type.name)
					} else if (type instanceof Pattern) {
						patternParameterTypes.put(parameter, NameProvider.getPatternClassName(type))
					} else {
						throw new IllegalStateException();
					}
				} else {
					throw new IllegalStateException();
				}

			}
		}

		val patternSourceCode = '''
			«printHeader(patternPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_PATTERN_LOCATION), imports)»
			
			/**
			* The pattern «NameProvider.getPatternClassName(pattern)».
			*/
			public class «NameProvider.getPatternClassName(pattern)» extends «PATTERN_SUPER_CLASS»{
				
				«FOR node : nodes SEPARATOR ';' AFTER ';'»
					«node.type.name» «node.name»
				«ENDFOR»
				
				public «NameProvider.getPatternClassName(pattern)»(«IF !pattern.parameters.empty»«FOR entry : patternParameterTypes.entrySet SEPARATOR ','»«entry.value» «entry.key.name»
				«ENDFOR»«ENDIF»){
					«FOR node : nodes SEPARATOR ';'»
						«node.name» = «MofgenUtil.getCreationOfEObject(node.type)»;
						«IF node.createdBy instanceof NodeContent»
							«FOR refAssign : (node.createdBy as NodeContent).refsAssigns SEPARATOR ';'»
								«PatternTranslator.translate(node, refAssign)»
							«ENDFOR»
						«ENDIF»
						
						«IF node.createdBy instanceof PatternCall»
							«PatternTranslator.translate(node.createdBy as PatternCall)»
						«ENDIF»
					«ENDFOR»
				}
				
				«PatternTranslator.createGetters(pattern)»
			}
		'''
		// TODO provide overriding toString implementation
		writeFile(patternPackage.getFile(NameProvider.getPatternClassName(pattern) + ".java"), patternSourceCode)
	}

	/**
	 * Sub template for the package declaration and import statements.
	 */
	private static def printHeader(String packageDeclaration, Set<String> imports) {
		return '''
			package «packageDeclaration»;
			
			«FOR importClass : imports.sortBy[it.toLowerCase]»
				import «importClass»;
			«ENDFOR»
		'''
	}

	/**
	 * Returns the name of the package.
	 */
	private def getSubPackageName(String subPackage) {
		val dot = if(packageName.equals("")) "" else "."
		return '''«packageName»«dot»«subPackage»'''
	}

	/**
	 * Returns the equivalent Java type as String for the given Parameter object.
	 */
	static def getJavaTypeAsString(Parameter parameter) {
		if (parameter instanceof PrimitiveParameter) {
			val type = parameter.type
			return type.literal
		}
		if (parameter instanceof ParameterNodeOrPattern) {
			val type = parameter.type
			if (type instanceof Node) {
				return type.type.instanceTypeName
			} else if (type instanceof Pattern) {
				return type.eClass.instanceTypeName
			} else {
				return new IllegalArgumentException(
					"Parameter that is not primitive must reference a node or a pattern");
			}
		}
	}

	/**
	 * Creates the file containing the content.
	 */
	private static def writeFile(IFile file, String content) {
		val contentStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))
		if (file.exists) {
			file.setContents(contentStream, true, true, null)
		} else {
			file.create(contentStream, true, null)
		}
	}

	/**
	 * Triggers type registry once to collect all needed types for collection management.
	 */
	private static def triggerTypeRegistry(MofgenFile file) {
//		TypeRegistry.update = false; // strange errors when doing this, yet turning it off in turn of potential performance loss
		TypeRegistry.update(file)
	}
}
