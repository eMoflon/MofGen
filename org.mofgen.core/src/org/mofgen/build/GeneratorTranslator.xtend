package org.mofgen.build

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClassifier
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
import org.mofgen.mGLang.GenSwitchExpression
import org.mofgen.mGLang.GeneratorExpression
import org.mofgen.mGLang.List
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider

/**
 * Translates given expressions to source code that will be used as part of the API.
 */
class GeneratorTranslator {

	@Inject static TypeCalculator typeChecker = new TypeCalculator();

	// ------------------------------------------ GeneratorExpression dispatcher ------------------------------------------
	def static String translate(GeneratorExpression expr) {
		return translateGen(expr)
	}

	def static dispatch private String translateGen(GenForStatement forStatement) {
		return translateForStatement(forStatement)
	}

	def static dispatch private String translateGen(GenIfElseSwitch zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				if(«MofgenUtil.getTextFromEditorFile(caze.when)») {
					«FOR bodyExpr : caze.body.expressions»
						«translateGenSwitch(bodyExpr)»
					«ENDFOR»
				}
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«(zwitch.^default as GenCaseBody).expressions»
				}
			«ENDIF»
		'''
	}

	def static dispatch private String translateGen(GenSwitchCase zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else'»
				«IF caze instanceof GenCaseWithCast»
					if(«MofgenUtil.resolveRefOrCall(zwitch.attribute)» instanceof «caze.node.type.instanceTypeName»){
						«caze.node.type.instanceTypeName»«caze.node.name» = («caze.node.type.instanceTypeName»)«MofgenUtil.resolveRefOrCall(zwitch.attribute)»;
						«IF caze.when !== null»
							if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
						«ENDIF»
						«FOR bodyExpr : caze.body.expressions»
							«translateGenSwitch(bodyExpr)»
						«ENDFOR»
						«IF caze.when !== null»
							}
						«ENDIF»
					}
				«ENDIF»
				«IF caze instanceof GenCaseWithoutCast»
					if(«caze.^val»){
						«FOR bodyExpr : caze.body.expressions»
							«translateGenSwitch(bodyExpr)»
						«ENDFOR»
					}
				«ENDIF»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«(zwitch.^default as GenCaseBody).expressions»
				}
			«ENDIF»
		'''
	}

	def static dispatch private String translateGen(Collection coll) {
		return translateCollection(coll)
	}

	def static dispatch private String translateGen(PatternCall pc) {
		return '''«translatePatternCall(pc)»;'''
	}

	def static dispatch private String translateGen(Variable variable) {
		if (variable.value instanceof PatternCall) {
			val calledPattern = (variable.value as PatternCall).called
			val patternReturn = calledPattern.^return
			var patternType = ""
			if (patternReturn.returnValue !== null) {
				patternType = patternReturn.returnValue.type.name
			} else {
				patternType = NameProvider.getPatternClassName(calledPattern)
			}

			return '''
				«patternType» «variable.name» = «translatePatternCall(variable.value as PatternCall)»;
			'''
		} else {
			val evalResult = (typeChecker.evaluate(variable.value) as EClassifier)
			return '''
				«evalResult.name» «variable.name» = «MofgenUtil.getTextFromEditorFile(variable.value)»;
			'''
		}
	}

	def static dispatch private String translateGen(VariableManipulation vm) {
		return '''«vm.^var» = «vm.^val»;'''
	}

	def static dispatch private String translateGen(CollectionManipulation cm) { return '''«cm»''' }
	
		
	def static dispatch private String translateGen(GenReturn ret){
	
		return '''
		return «ret.returnValue.name»;
		'''
	}

	// ------------------------------------------ GenSwitchExpression dispatcher ------------------------------------------
	def static String translate(GenSwitchExpression expr) {
		return translateGenSwitch(expr)
	}

	def static dispatch private String translateGenSwitch(GenForStatement forStatement) {
		return translateForStatement(forStatement)
	}

	def static dispatch private String translateGenSwitch(Collection coll) {
		return translateCollection(coll)
	}

	def static dispatch private String translateGenSwitch(PatternCall pc) {
		return translatePatternCall(pc)
	}

	// ------------------------------------------ single translations ------------------------------------------
	def static private String translateForStatement(GenForStatement forStatement) {
		val head = forStatement.head
		val headSrc = GeneralTranslator.translateForHead(head)

		return '''for(«headSrc»){
		«FOR bodyExpr : forStatement.body.commands» 
			«translateGen(bodyExpr)»
		«ENDFOR»
		}'''
	}

	def static private String translateCollection(Collection coll) {
		if (coll instanceof List) {
			return '''List<«MofgenUtil.getListType(coll).name»> «coll.name» = new LinkedList<>();'''
		}
		if (coll instanceof Map) {
			return '''Map<«MofgenUtil.getMapKeyType(coll).name», «MofgenUtil.getMapEntryType(coll).name»> «coll.name» = new HashMap<>();'''
		}
	}

	def static private String translatePatternCall(PatternCall pc) {
		return GeneralTranslator.translatePatternCall(pc)
	}



}
