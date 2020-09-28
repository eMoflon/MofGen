package org.mofgen.codegen

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.api.EClassifiersManager
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.MofgenFile
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeContent
import org.mofgen.mGLang.Parameter
import org.mofgen.mGLang.ParameterNode
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.util.NameProvider

import static org.mofgen.interpreter.TypeRegistry.*
import java.io.File
import java.io.IOException
import java.io.FileWriter
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import org.mofgen.codegen.PatternTranslator
import org.mofgen.mGLang.MGLangPackage
import org.apache.log4j.Logger

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
	 * Generates the Java Generator class for the given generator.
	 */
	def generateGenClass(/*IFolder genPackage, TODO */ Generator gen) {
		// TODO
		val imports = newHashSet('java.util.ArrayList',
		'java.util.List',
		'java.util.Map',
		'java.util.HashMap',
		'java.util.LinkedList',
		'org.eclipse.emf.ecore.EObject',
		'org.mofgen.api.MofgenGenerator')
		
		imports.add('mofgenTest.api.patterns.*') //TODO determine programmatically
		
		val genSourceCode = '''
			«printHeader('mofgenTest.'+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_GENERATOR_LOCATION), imports)»
			
			/**
			 * The generator «NameProvider.getGeneratorClassName(gen)».
			 */
			public class «NameProvider.getGeneratorClassName(gen)» extends «GENERATOR_SUPER_CLASS» {
			
			«««TODO Documentation?
			@Override
				/**
				* Runs the specified generator with the given parameters
				*/
				public void start(«IF gen.params.size == 0») {«ELSE»,«ENDIF»
				«FOR parameter : gen.params SEPARATOR ', ' AFTER '){'»final «getJavaType(parameter)» «parameter.name»Value«ENDFOR»
			«FOR expression : gen.commands»
				«GeneratorTranslator.translate(expression)»;
			«ENDFOR»
			}
			
			}

		'''
		// TODO provide overriding toString implementation
		
		val path ="D:\\Workspaces\\runtime-EclipseApplication\\mofgenTest\\src-gen\\mofgenTest\\api\\generators\\" 
		writeFile(path+NameProvider.getGeneratorClassName(gen) + ".java", genSourceCode)
//		writeFile(genPackage.getFile(NameProvider.getGeneratorClassName(gen) + ".java"), genSourceCode) TODO replace
	}

	/**
	 * Generates the Java Generator class for the given pattern.
	 */
	def generatePatternClass(/*IFolder patternPackage, TODO */  Pattern pattern) {
		// TODO
		val imports = eClassifiersManager.getImportsForNodeTypes(pattern.commands.filter(Node).toList)
		imports.addAll(
			eClassifiersManager.getImportsForParameterNodeTypes(pattern.parameters.filter(ParameterNode).toList))
		imports.addAll(
			'org.mofgen.api.MofgenPattern',
			'org.mofgen.mGLang.MGLangFactory'
		)
		
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val patternSourceCode = '''
			«printHeader('mofgenTest.'+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_PATTERN_LOCATION), imports)»
			
			/**
			* The pattern «NameProvider.getPatternClassName(pattern)».
			*/
			public class «NameProvider.getPatternClassName(pattern)» extends MofgenPattern{
				
				«FOR node : nodes SEPARATOR ';' AFTER ';'»
					«node.type.instanceTypeName» «node.name»
				«ENDFOR»
								
				@Override
				/**
				* TODO in Template Generation
				*/
				«««TODO Return type
				public static void create(«IF pattern.parameters.empty»
				«ELSE»«FOR param : pattern.parameters SEPARATOR ','»final«getJavaType(param)»«param.name»Value«ENDFOR»«ENDIF»){
					«FOR node : nodes SEPARATOR ';'»
						«node.name» = («node.type.instanceTypeName») MGLangFactory.eINSTANCE.create(«node.type»)
						«IF node.createdBy instanceof NodeContent»
							«FOR refAssign : (node.createdBy as NodeContent).refsAssigns SEPARATOR ';'»
								«PatternTranslator.translate(node, refAssign)»
							«ENDFOR»
						«ENDIF»
						
						«IF node.createdBy instanceof PatternCall»
							«««TODO
							throw new UnsupportedOperationException("Nodes created by PatternCalls are not yet supported!")
						«ENDIF»
					«ENDFOR»
				}
			}
		'''
		// TODO provide overriding toString implementation
		
		val path ="D:\\Workspaces\\runtime-EclipseApplication\\mofgenTest\\src-gen\\mofgenTest\\api\\patterns\\" 
		writeFile(path+NameProvider.getPatternClassName(pattern) + ".java", patternSourceCode)
		//writeFile(patternPackage.getFile(NameProvider.getPatternClassName(pattern) + ".java"), patternSourceCode) TODO replace
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
//		val dot = if(packageName.equals("")) "" else "."
//		return '''«packageName»«dot»«subPackage»'''
// TODO replace
	
	return "mofgen"
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
			return parameter.type.instanceTypeName
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

	private static def writeFile(String path, String content) {
		try {
			val myObj = new File(path);
			if (myObj.createNewFile()) {
				logger.info("File created: " + myObj.getName());
			} else {
				logger.info("File at "+ path + " already exists.");
			}
			try (val writer =
             new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8)){
		      writer.write(content);
		      writer.close();
		      logger.info("Successfully wrote to file at "+path);
		    } catch (IOException e) {
		      logger.error("Error writing to "+ path);
		      e.printStackTrace();
		    }
		} catch (IOException e) {
			logger.error("Error creating file "+ path);
			e.printStackTrace();
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
