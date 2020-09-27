package org.mofgen.core.codegen

import org.mofgen.mGLang.GeneratorExpression
import org.mofgen.mGLang.ForStatement
import org.mofgen.mGLang.GenSwitch
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.List
import com.google.inject.Inject
import org.mofgen.interpreter.TypeCalculator
import org.mofgen.mGLang.MofgenFile
import org.mofgen.interpreter.TypeRegistry
import org.eclipse.xtext.TypeRef
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PatternObject
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.util.NameProvider
import org.mofgen.mGLang.GenIfElseSwitch
import org.mofgen.mGLang.GenSwitchCase
import org.mofgen.mGLang.GenSwitchExpression
import org.mofgen.mGLang.GenCaseWithCast
import org.mofgen.mGLang.GenCaseWithoutCast

/**
 * Translates given expressions to source code that will be used as part of the API.
 */
class GeneratorTranslator {
	
	@Inject static TypeCalculator typeChecker
	
	
	// ------------------------------------------ GeneratorExpression dispatcher ------------------------------------------
	def static translate(GeneratorExpression expr){
		return translateGen(expr)
	}
	
	def static dispatch private translateGen(ForStatement forStatement){
		return translateForStatement(forStatement)
	}
	
	def static dispatch private translateGen(GenIfElseSwitch zwitch){
		return
		'''
		«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
			if(«caze.when») {
				«FOR bodyExpr : caze.body.expressions SEPARATOR ';'»
					«translateGenSwitch(bodyExpr)»
				«ENDFOR»
			}
		«ENDFOR»
		'''
	} // TODO Default!
	
	def static dispatch private translateGen(GenSwitchCase zwitch){
		return
		'''
		«FOR caze : zwitch.cases SEPARATOR 'else' AFTER ''»
			«IF caze instanceof GenCaseWithCast»
				if(«caze.node» instanceof «caze.node.type.name»){
					«IF caze.when !== null»
						if(«caze.when»){
					«ENDIF»
					«FOR bodyExpr : caze.body.expressions SEPARATOR ';'»
						«translateGenSwitch(bodyExpr)»
					«ENDFOR»
					«IF caze.when !== null»
						}
					«ENDIF»
				}
			«ENDIF»
			«IF caze instanceof GenCaseWithoutCast»
				if(«caze.^val»){
					«FOR bodyExpr : caze.body.expressions SEPARATOR ';'»
						«translateGenSwitch(bodyExpr)»
					«ENDFOR»
				}
			«ENDIF»
		«ENDFOR»
		'''
	} // TODO Default!
	
	def static dispatch private translateGen(Collection coll){
		return translateCollection(coll)
	}
	
	def static dispatch private translateGen(PatternCall pc){		
		return translatePatternCall(pc)
	}
	
	def static dispatch private translateGen(PatternObject obj){
		return translatePatternObject(obj)
	}
	
	def static dispatch private translateGen(Variable variable){
		return
		'''
		«typeChecker.evaluate(variable.value)» «variable.name» = «variable.value»
		'''
	}
	
	def static dispatch private translateGen(VariableManipulation vm){
		return '''«vm.^var» = «vm.^val»'''
	}
	
	def static dispatch private translateGen(CollectionManipulation cm){
		return '''«cm»'''}
	
	// ------------------------------------------ GenSwitchExpression dispatcher ------------------------------------------
	def static translate(GenSwitchExpression expr){
		return translateGenSwitch(expr)
	}
	
	def static dispatch private translateGenSwitch(ForStatement forStatement){
		return translateForStatement(forStatement)
	}
		
	def static dispatch private translateGenSwitch(Collection coll){
		return translateCollection(coll)
	}
	
	def static dispatch private translateGenSwitch(PatternCall pc){
		return translatePatternCall(pc)
	}
	
	def static dispatch private translateGenSwitch(PatternObject po){
		return translatePatternObject(po)
	}
	
	
	// ------------------------------------------ single translations ------------------------------------------
	
	def static private translateForStatement(ForStatement forStatement){
		val head = forStatement.head
		val headSrc = switch head{
			RangeForHead: '''int «head.iteratorVar» = «head.range.start»; «head.iteratorVar»<=«head.range.end»'''
			GeneralForEachHead: '''«head.eref.EReferenceType.name» «head.iteratorVar.name» : «head.src»'.'«head.eref» '''
			ListForEachHead: '''«getListType(head.list)» «head.iteratorVar» : «head.list.name»'''
		}
		
		return '''for(«headSrc»){
			«FOR bodyExpr : forStatement.body.commands»
				«translateGen(bodyExpr)»
			«ENDFOR»
		}'''
	}
	
	def static private translateCollection(Collection coll){
		if(coll instanceof List){
			return '''List<«getListType(coll)»> «coll.name» = new LinkedList<>();'''
		}
		if(coll instanceof Map){
			return '''Map<«getMapKeyType(coll)», «getMapEntryType(coll)»> «coll.name» = new HashMap<>();'''
		}
	}
	
	def static private translatePatternCall(PatternCall pc){
		return '''«NameProvider.getPatternClassName(pc.called)».create(
		«FOR param : pc.params.params SEPARATOR ',' AFTER ')'»
			«JavaFileGenerator.getJavaType(pc.called.parameters.get(pc.params.params.indexOf(param)))» «param»
		«ENDFOR»
		'''
	}
	
	def static private translatePatternObject(PatternObject obj){
		return '''
		«NameProvider.getPatternClassName(obj.patternCall.called)» «obj.name» = «translateGen(obj.patternCall)»
		'''
	}
	
	// ------------------------------------------ helper methods ------------------------------------------
	
	def static private getListType(List list){
		TypeRegistry.getListType(list)
	}
		
	def static private getMapKeyType(Map map){
		TypeRegistry.getMapKeyType(map)
	}
	
	def static private getMapEntryType(Map map){
		TypeRegistry.getMapEntryType(map)
	}

}