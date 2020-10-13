package org.mofgen.build

import com.google.inject.Inject
import org.mofgen.interpreter.TypeCalculator
import org.mofgen.interpreter.TypeRegistry
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.mGLang.ForStatement
import org.mofgen.mGLang.GenCaseBody
import org.mofgen.mGLang.GenCaseWithCast
import org.mofgen.mGLang.GenCaseWithoutCast
import org.mofgen.mGLang.GenIfElseSwitch
import org.mofgen.mGLang.GenSwitchCase
import org.mofgen.mGLang.GenSwitchExpression
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.GeneratorExpression
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.util.NameProvider
import org.mofgen.util.MofgenUtil
import org.eclipse.emf.ecore.EClassifier
import org.mofgen.mGLang.GenReturn
import org.eclipse.emf.ecore.xmi.XMIResource

/**
 * Translates given expressions to source code that will be used as part of the API.
 */
class GeneratorTranslator {

	@Inject static TypeCalculator typeChecker = new TypeCalculator();

	// ------------------------------------------ GeneratorExpression dispatcher ------------------------------------------
	def static String translate(GeneratorExpression expr) {
		return translateGen(expr)
	}

	def static dispatch private String translateGen(ForStatement forStatement) {
		return translateForStatement(forStatement)
	}

	def static dispatch private String translateGen(GenIfElseSwitch zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				if(«MofgenUtil.getTextFromEditorFile(caze.when)») {
					«FOR bodyExpr : caze.body.expressions SEPARATOR ';' AFTER ';'»
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
			«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
				«IF caze instanceof GenCaseWithCast»
					if(«MofgenUtil.resolveRefOrCall(zwitch.attribute)» instanceof «caze.node.type.instanceTypeName»){
						«caze.node.type.instanceTypeName»«caze.node.name» = («caze.node.type.instanceTypeName»)«MofgenUtil.resolveRefOrCall(zwitch.attribute)»;
						«IF caze.when !== null»
							if(«MofgenUtil.getTextFromEditorFile(caze.when)»){
						«ENDIF»
						«FOR bodyExpr : caze.body.expressions SEPARATOR ';' AFTER ';'»
							«translateGenSwitch(bodyExpr)»
						«ENDFOR»
						«IF caze.when !== null»
							}
						«ENDIF»
					}
				«ENDIF»
				«IF caze instanceof GenCaseWithoutCast»
					if(«caze.^val»){
						«FOR bodyExpr : caze.body.expressions SEPARATOR ';' AFTER ';'»
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
		return translatePatternCall(pc)
	}

	def static dispatch private String translateGen(Variable variable) {
		if (variable.value instanceof PatternCall) {
			val calledPattern = (variable.value as PatternCall).called
			val patternReturn = calledPattern.^return
			var patternType = ""
			if (patternReturn.returnValue !== null) {
				patternType = patternReturn.returnValue.type.instanceClassName
			} else {
				patternType = NameProvider.getPatternClassName(calledPattern)
			}

			return '''
				«patternType» «variable.name» = «translatePatternCall(variable.value as PatternCall)»
			'''
		} else {
			return '''
				«(typeChecker.evaluate(variable.value) as EClassifier).name» «variable.name» = «MofgenUtil.getTextFromEditorFile(variable.value)»
			'''
		}
	}

	def static dispatch private String translateGen(VariableManipulation vm) {
		return '''«vm.^var» = «vm.^val»'''
	}

	def static dispatch private String translateGen(CollectionManipulation cm) { return '''«cm»''' }
	
		
	def static dispatch private String translateGen(GenReturn ret){
	
		return '''
		return «ret.returnValue.name»
		'''
	}

	// ------------------------------------------ GenSwitchExpression dispatcher ------------------------------------------
	def static String translate(GenSwitchExpression expr) {
		return translateGenSwitch(expr)
	}

	def static dispatch private String translateGenSwitch(ForStatement forStatement) {
		return translateForStatement(forStatement)
	}

	def static dispatch private String translateGenSwitch(Collection coll) {
		return translateCollection(coll)
	}

	def static dispatch private String translateGenSwitch(PatternCall pc) {
		return translatePatternCall(pc)
	}

	// ------------------------------------------ single translations ------------------------------------------
	def static private String translateForStatement(ForStatement forStatement) {
		val head = forStatement.head
		val headSrc = switch head {
			RangeForHead: '''int «head.iteratorVar» = «MofgenUtil.getTextFromEditorFile(head.range.start)»; «head.iteratorVar» <= «MofgenUtil.getTextFromEditorFile(head.range.end)»; «head.iteratorVar»++'''
			GeneralForEachHead: '''«head.eref.EReferenceType.name» «head.iteratorVar.name» : «MofgenUtil.getTextFromEditorFile(head.src)».«NameProvider.getGetterName(head.eref)»() '''
			ListForEachHead: '''«getListType(head.list).name» «head.iteratorVar.name» : «head.list.name»'''
		}

		return '''for(«headSrc»){
		«FOR bodyExpr : forStatement.body.commands»
			«translateGen(bodyExpr)»
		«ENDFOR»
		}'''
	}

	def static private String translateCollection(Collection coll) {
		if (coll instanceof List) {
			return '''List<«getListType(coll).name»> «coll.name» = new LinkedList<>()'''
		}
		if (coll instanceof Map) {
			return '''Map<«getMapKeyType(coll).name», «getMapEntryType(coll).name»> «coll.name» = new HashMap<>()'''
		}
	}

	def static private String translatePatternCall(PatternCall pc) {
		val pReturn = pc.called.^return
		if (pReturn !== null && pReturn.returnValue !== null) {
			return '''(new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»)«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»).«MofgenUtil.getGetterMethod(pReturn.returnValue)»;
				«ENDIF»
			'''
		} else {
			return '''new «NameProvider.getPatternClassName(pc.called)»(«IF pc.params.params.empty»);«ELSE»«FOR param : pc.params.params SEPARATOR ',' AFTER ')'» «MofgenUtil.getTextFromEditorFile(param)»«ENDFOR»
				«ENDIF»
			'''
		}

	}

	// ------------------------------------------ helper methods ------------------------------------------
	def static private getListType(List list) {
		TypeRegistry.getListType(list)
	}

	def static private getMapKeyType(Map map) {
		TypeRegistry.getMapKeyType(map)
	}

	def static private getMapEntryType(Map map) {
		TypeRegistry.getMapEntryType(map)
	}

}
