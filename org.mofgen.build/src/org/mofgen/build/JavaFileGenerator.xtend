package org.mofgen.build

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.api.EClassifiersManager
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.MofgenFile
import org.mofgen.mGLang.Pattern
import org.mofgen.util.NameProvider

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
	public final static String APP_SUPER_CLASS = "MofgenApp"

	/**
	 * The Name of the inherited generator super class
	 */
	public final static String GENERATOR_SUPER_CLASS = "MofgenGenerator"

	/**
	 * The Name of the inherited pattern super class
	 */
	public final static String PATTERN_SUPER_CLASS = "MofgenPattern"

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
	}

	/**
	 * Generates the Java App class.
	 */
	def generateAppClass(IFolder appPackage, IFile mofgenFile) {
		logger.debug("Creating App class for "+mofgenFile.name+" ..")
		val imports = eClassifiersManager.importsForPackages
		imports.addAll('java.util.LinkedList', 'java.util.List', 'org.mofgen.api.MofgenApp',
			'org.mofgen.api.' + GENERATOR_SUPER_CLASS,
			appPackage.project.name + '.api.generators.' + NameProvider.getFileName(mofgenFile) + '.*',
			'org.eclipse.emf.ecore.EObject')

		val generators = EcoreUtil2.getAllContentsOfType(editorModel, Generator)

		val modelPath = appPackage.project.getFolder(MofgenBuilder.DEFAULT_MODEL_LOCATION).location.toString

		val className = NameProvider.getAppClassName(mofgenFile)

		val appSourceCode = '''
			«printHeader(appPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_API_LOCATION), imports)»
			
			/**
			 * A mofgen application.
			 */
			public class «className» extends «APP_SUPER_CLASS»{
				
				/**
				* A list containing all defined generators
				*/
				List<MofgenGenerator> generators;
				
				/**
				 * Creates a mofgen application
				 */
				public «className»() {
					«««super(workspacePath);
					generators = new LinkedList<>();
					«FOR gen : generators»
						generators.add(new «NameProvider.getGeneratorClassName(gen)»());
					«ENDFOR»
				}
				
				@Override
				public void startGeneration(){
					System.out.println("Starting generation...");
					for(MofgenGenerator gen : generators){
						System.out.println("Starting generator "+gen.getName()+"...");
						EObject result = gen.start();
						
						String path = "«modelPath»";
						saveResource(result, path, gen.getName());
					}
					System.out.println("Done!");
				}
				
				public String toString(){
					return "«className»\nGenerators: "+generators.toString();
				}
			}
		'''
		val finalSrcCode = MofgenCodeFormatter.formatCode(filterGeneratedCode(appSourceCode));
		logger.debug("Saving App class for "+mofgenFile.name+" ..")
		writeFile(appPackage.getFile(className + '.java'), finalSrcCode)
		logger.debug("Done!\n")
	}

	/**
	 * Generates the Java Generator class for the given generator.
	 */
	def generateGenClass(IFolder genPackage, Generator gen) {
		logger.debug("Creating generator class for "+gen.name+" ..")
		val imports = newHashSet('java.util.ArrayList', 'java.util.List', 'java.util.Map', 'java.util.HashMap',
			'java.util.LinkedList', 'org.eclipse.emf.ecore.EObject', 'org.eclipse.emf.ecore.util.EcoreUtil', 'org.mofgen.api.' + GENERATOR_SUPER_CLASS)
		imports.add(genPackage.project.name + '.api.patterns.' + genPackage.name + ".*")
		imports.addAll(eClassifiersManager.getAllImports(editorModel))

		val genSourceCode = '''
			«printHeader(genPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_GENERATOR_LOCATION)+"."+genPackage.name, imports)»
			«GeneratorTranslator.translate(gen)»
			
		'''
		val finalSrcCode = MofgenCodeFormatter.formatCode(filterGeneratedCode(genSourceCode));
		logger.debug("Saving generator class for "+gen.name+" ..")
		writeFile(genPackage.getFile(NameProvider.getGeneratorClassName(gen) + ".java"), finalSrcCode)
		logger.debug("Done!\n")
	}

	/**
	 * Generates the Java Generator class for the given pattern.
	 */
	def generatePatternClass(IFolder patternPackage, Pattern pattern) {
		logger.debug("Creating pattern class for "+pattern.name+" ..")
		val imports = eClassifiersManager.getAllImports(editorModel)
		imports.addAll(
			'org.mofgen.api.' + PATTERN_SUPER_CLASS,
			'org.eclipse.emf.ecore.EObject'
		)

		val patternSourceCode = '''
			«printHeader(patternPackage.project.name+NameProvider.locationToPackageName(MofgenBuilder.DEFAULT_PATTERN_LOCATION)+"."+patternPackage.name, imports)»
			«PatternTranslator.translate(pattern)»
			
		'''

		val finalSrcCode = MofgenCodeFormatter.formatCode(filterGeneratedCode(patternSourceCode));
		
		logger.debug("Saving pattern class for "+pattern.name+" ..")
		writeFile(patternPackage.getFile(NameProvider.getPatternClassName(pattern) + ".java"), finalSrcCode)
		logger.debug("Done!\n")
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
	 * filters the given String by removing all semicolons following a curled bracket, orphaned semicolons in empty lines and semicolons following semicolons.
	 */
	def filterGeneratedCode(String code) {
		val codeProcessed = code.replaceAll("};+", "}").replaceAll(";+[\\n\\t\\r]*;+[\\n\\r]", ";\n").replaceAll(
			"}[\\n\\t\\r]*;*[\\n\\r]", "}\n")
		return codeProcessed;
	}
}
