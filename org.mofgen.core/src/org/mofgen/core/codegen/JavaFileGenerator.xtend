package org.mofgen.core.codegen

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.mofgen.api.EClassifiersManager
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.MofgenFile
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.ParameterNode
import org.mofgen.mGLang.PrimitiveParameter

import static org.mofgen.interpreter.TypeRegistry.*
import org.mofgen.mGLang.Pattern
import org.mofgen.util.NameProvider
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.MGLangPackage
import org.mofgen.mGLang.MGLangFactory
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.NodeContent
import org.mofgen.mGLang.PatternCall

/**
 * This class contains the templates for the API Java classes.
 */
class JavaFileGenerator {
	/**
	 * The name of the package.
	 */
	String packageName

	/**
	 * The prefix for the API class name.
	 */
	String classNamePrefix

	final String GENERATOR_SUPER_CLASS = "MofgenGenerator"

	/**
	 * Utility to handle the mapping between EClassifier names to meta-model names.
	 */
	EClassifiersManager eClassifiersManager

	/**
	 * Creates a new JavaFileGenerator.
	 */
	new(String classNamePrefix, String packageName, MofgenFile editorModel, EClassifiersManager eClassifiersManager) {
		this.classNamePrefix = classNamePrefix
		this.packageName = packageName
		this.eClassifiersManager = eClassifiersManager
		triggerTypeRegistry(editorModel)
	}

	/**
	 * Generates the Java App class.
	 */
	def generateAppClass(IFolder appPackage) {
		val imports = eClassifiersManager.importsForPackages
		imports.addAll()
		val appSourceCode = '''
			«printHeader(getSubPackageName('api'), imports)»
			
			/**
			 * A mofgen application.
			 */
			public class «appClassName» extends GraphTransformationApp<«appClassName»> {
				
				/**
				 * Creates a mofgen application
				 * 
				 * @param engine
				 *            the pattern matching engine
				 * @param workspacePath
				 *            the workspace path
				 */
				public «appClassName»(final String workspacePath) {
					super(workspacePath);
				}
			}
		'''
		writeFile(appPackage.getFile(appClassName + '.java'), appSourceCode)
	}

	/**
	 * Generates the Java Generator class for the given rule.
	 */
	def generateGenClass(IFolder genPackage, Generator gen) {
		// TODO
		val imports = newHashSet('java.util.ArrayList',
			'java.util.List',
			'org.mofgen.core.api.MofgenGenerator')
		
		val genSourceCode = '''
			«printHeader(getSubPackageName('api.generators'), imports)»
			
			/**
			 * The generator «gen.name».
			 */
			public class «NameProvider.getGeneratorClassName(gen)» extends «GENERATOR_SUPER_CLASS» {
			
			«««TODO Documentation?

				@Override
				/**
				* Runs the specified generator with the Oiven pOrameters.
				*/
				public void start(«IF gen.params.size == 0») {«ELSE»,«ENDIF»
					«FOR parameter : gen.params SEPARATOR ', ' AFTER '){'»final «getJavaType(parameter)» «parameter.name»Value«ENDFOR»
				«FOR expression : gen.commands»
					«GeneratorTranslator.translate(expression)»;
				«ENDFOR»
			}
			
				@Override
				protected List<String> getParameterNames() {
					List<String> names = new ArrayList<String>();
					«FOR param : gen.params»
						names.add("«param.name»");
					«ENDFOR»
					return names;
				}
			}
		'''
		// TODO provide overriding toString implementation
		writeFile(genPackage.getFile(NameProvider.getGeneratorClassName(gen) + ".java"), genSourceCode)
	}
	
	/**
	 * Generates the Java Generator class for the given rule.
	 */
	def generatePatternClass(IFolder patternPackage, Pattern pattern) {
		// TODO
		val imports = eClassifiersManager.getImportsForNodeTypes(pattern.commands.filter(Node).toList)
		imports.addAll(eClassifiersManager.getImportsForParameterNodeTypes(pattern.parameters.filter(ParameterNode).toList))
//		imports.addAll(
//			'java.util.List',
//		)

		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val patternSourceCode = '''
			«printHeader(getSubPackageName('api.patterns'), imports)»
			
			/**
			* The pattern «pattern.name».
			*/
			public class «NameProvider.getPatternClassName(pattern)» {
				
				«FOR node : nodes SEPARATOR ';'»
					«node.type.instanceTypeName» «node.name»
				«ENDFOR»
				
				public «NameProvider.getPatternClassName(pattern)»(«IF pattern.parameters.empty»
				«ELSE»«FOR param : pattern.parameters SEPARATOR ','»final«getJavaType(param)»«param.name»Value«ENDFOR»«ENDIF»){
					«FOR node : nodes SEPARATOR ';'»
						«node.name» = («node.type.instanceTypeName») MGLangFactory.eINSTANCE.create(«node.type»)
						«IF node.createdBy instanceof NodeContent»
							«FOR refAssign : (node.createdBy as NodeContent).refsAssigns SEPARATOR ';'»
								«PatternTranslator.translate(node, refAssign)»
							«ENDFOR»
						«ENDIF»
						
						«IF node.createdBy instanceof PatternCall»
						
						«ENDIF»
					«ENDFOR»
					
				}
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
	 * Returns the name of the API class.
	 */
	private def getAppClassName() {
		return classNamePrefix + "App"
	}

	/**
	 * Returns the name of the package.
	 */
	private def getSubPackageName(String subPackage) {
		val dot = if(packageName.equals("")) "" else "."
		return '''«packageName»«dot»«subPackage»'''
	}

	/**
	 * Returns the equivalent Java type for the EDataType.
	 */
	static def getJavaType(Parameter parameter) {
		if (parameter instanceof PrimitiveParameter) {
			val type = parameter.type
			return type.literal
		}
		if (parameter instanceof ParameterNode) {
			return parameter.type.instanceTypeName // TODO correct attribute of type used?
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
	 * Triggers type registry once to collect all needed generic types for collection management.
	 */
	private static def triggerTypeRegistry(MofgenFile file) {
		TypeRegistry.update = false;
		TypeRegistry.update(file)
	}
}
