package org.mofgen.build

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.mofgen.interpreter.TypeCalculator
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.mGLang.GenCaseBody
import org.mofgen.mGLang.GenCaseWithCast
import org.mofgen.mGLang.GenCaseWithoutCast
import org.mofgen.mGLang.GenForStatement
import org.mofgen.mGLang.GenIfElseSwitch
import org.mofgen.mGLang.GenReturn
import org.mofgen.mGLang.GenSwitchCase
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListAdHoc
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.MapAdHoc
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Pattern

/**
 * Translates given expressions to source code that will be used as part of the API.
 */
class GeneratorTranslator {

	@Inject static TypeCalculator typeChecker = new TypeCalculator();

	// ------------------------------------------ GeneratorExpression dispatcher ------------------------------------------
	def static String translate(EObject expr) {
		return internalTranslate(expr)
	}

	def static dispatch private String internalTranslate(Generator gen) {
		return '''
				«getGeneratorDoc(gen)»
				«getGeneratorSignature(gen)»
			
				public «NameProvider.getGeneratorClassName(gen)» (){
					this.name = "«gen.name»";
				}
			
				@Override
				/**
				* Runs the specified generator with the given parameters.
				* @return the EObject to be saved aka the containing root object of the generated structure (Must be specified by the user!)
				*/
				public EObject start(«IF gen.params.size == 0») {«ELSE»,«ENDIF»
				«FOR parameter : gen.params SEPARATOR ', ' AFTER '){'»final «MofgenUtil.getJavaTypeAsString(parameter)» «parameter.name»Value«ENDFOR»
					«FOR expression : gen.commands»
					«GeneratorTranslator.translate(expression)»;
					«ENDFOR»
				}				
			}
			'''
	}

	private static def getGeneratorDoc(Generator gen) {
		return '''
			/**
			* The generator «NameProvider.getGeneratorClassName(gen)».
			*/
		'''
	}

	private static def getGeneratorSignature(Generator gen) {
		return '''
			public class «NameProvider.getGeneratorClassName(gen)» extends «JavaFileGenerator.GENERATOR_SUPER_CLASS» {
		'''
	}

	def static dispatch private String internalTranslate(GenIfElseSwitch zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				if(«MofgenUtil.getTextFromEditorFile(caze.when)») {
					«FOR bodyExpr : caze.body.expressions»
						«translate(bodyExpr)»;
					«ENDFOR»
				}
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«FOR bodyExpr : (zwitch.^default as GenCaseBody).expressions»
						«translate(bodyExpr)»;
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	def static dispatch private String internalTranslate(GenSwitchCase zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else'»
				«IF caze instanceof GenCaseWithCast»
					if(«translate(zwitch.attribute)» instanceof «caze.node.type.instanceTypeName»){
						«caze.node.type.instanceTypeName»«caze.node.name» = («caze.node.type.instanceTypeName»)«translate(zwitch.attribute)»;
						«IF caze.when !== null»
							if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
						«ENDIF»
						«FOR bodyExpr : caze.body.expressions»
							«translate(bodyExpr)»;
						«ENDFOR»
						«IF caze.when !== null»
							}
						«ENDIF»
					}
				«ENDIF»
				«IF caze instanceof GenCaseWithoutCast»
					if(«caze.^val»){
						«FOR bodyExpr : caze.body.expressions»
							«translate(bodyExpr)»;
						«ENDFOR»
					}
				«ENDIF»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«FOR bodyExpr : (zwitch.^default as GenCaseBody).expressions»
						«translate(bodyExpr)»;
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	def static dispatch private String internalTranslate(Variable variable) {
		if (variable.value instanceof PatternCall) {
			val calledPattern = (variable.value as PatternCall).called
			val patternReturn = calledPattern.^return
			var patternType = ""
			if (patternReturn.returnValue !== null) {
				val retValue = patternReturn.returnValue
				if(retValue instanceof Node){
					patternType = retValue.type.name
				}else if(retValue instanceof ParameterNodeOrPattern){
					val retValueType = retValue.type
					if(retValueType instanceof EClassifier){
						patternType = retValueType.name
					}else if(retValueType instanceof Pattern){
						// TODO
						throw new UnsupportedOperationException()
					}
				}
			} else {
				patternType = NameProvider.getPatternClassName(calledPattern)
			}

			return '''
				«patternType» «variable.name» = «translate(variable.value as PatternCall)»;
			'''
		} else {
			val evalResult = (typeChecker.evaluate(variable.value) as EClassifier)
			return '''
				«evalResult.name» «variable.name» = «MofgenUtil.getTextFromEditorFile(variable.value)»;
			'''
		}
	}

	def static dispatch private String internalTranslate(VariableManipulation vm) {
		return '''«vm.^var.name» = «translate(vm.^val)»'''
	}

	def static dispatch private String internalTranslate(CollectionManipulation cm) {
		return GeneralTranslator.translate(cm)
	}

	def static dispatch private String internalTranslate(GenReturn ret) {
		return '''return «translate(ret.returnValue)»'''
	}

	def static dispatch private String internalTranslate(PatternCall pc) {
		return GeneralTranslator.translate(pc)
	}

	def static dispatch private String internalTranslate(GenForStatement forStatement) {
		val head = forStatement.head
		val headSrc = translate(head)

		return '''for(«headSrc»){
		«FOR bodyExpr : forStatement.body.commands» 
			«translate(bodyExpr)»;
		«ENDFOR»
		}'''
	}

	def static dispatch private String internalTranslate(Collection coll) {
		if (coll instanceof List) {
			return '''
				List<«MofgenUtil.getListType(coll).name»> «coll.name» = new LinkedList<>();
				«fillCollection(coll)»
			'''
		}
		if (coll instanceof Map) {
			return '''
				Map<«MofgenUtil.getMapKeyType(coll).name», «MofgenUtil.getMapEntryType(coll).name»> «coll.name» = new HashMap<>();
				«fillCollection(coll)»
			'''
		}
	}

	// all objects that have to be translated but are not exclusive to patterns are forwarded to the general translator
	private static def dispatch String internalTranslate(EObject obj) {
		return GeneralTranslator.translate(obj)
	}

	def static private String fillCollection(List list) {
		val defOrDecl = list.defOrDecl
		if (defOrDecl instanceof ListAdHoc) {
			return '''
				// filling list «list.name»
				«FOR elem : defOrDecl.elements»
					«list.name».add(«GeneralTranslator.translate(elem)»);
				«ENDFOR»
			'''
		}
	}

	def static private String fillCollection(Map map) {
		val defOrDecl = map.defOrDecl
		if (defOrDecl instanceof MapAdHoc) {
			return '''
				// filling map «map.name»
				«FOR entry : defOrDecl.entries»
					«map.name».put(«GeneralTranslator.translate(entry.key)», «GeneralTranslator.translate(entry.value)»);
				«ENDFOR»
			'''
		}
	}

}
