package org.mofgen.build

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
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
import org.mofgen.mGLang.GenWhenCase
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListAdHoc
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.MapAdHoc
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.VariableDeclaration
import org.mofgen.mGLang.VariableDefinition
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.util.MofgenUtil
import org.mofgen.util.NameProvider

/**
 * Translates given expressions to source code that will be used as part of the API.
 */
class GeneratorTranslator {

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
				«translate(caze)»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
					«FOR bodyExpr : (zwitch.^default.body as GenCaseBody).expressions»
						«translate(bodyExpr)»;
					«ENDFOR»
				}
			«ENDIF»
		'''
	}

	def static dispatch private String internalTranslate(GenWhenCase caze) {
		return '''
			if(«translate(caze.when)») {
			«FOR bodyExpr : caze.body.expressions»
				«translate(bodyExpr)»;
			«ENDFOR»
			}
		'''
	}

	def static dispatch private String internalTranslate(GenCaseWithCast caze) {
		val zwitch = EcoreUtil2.getContainerOfType(caze, GenSwitchCase)
		return '''
		if(«translate(zwitch.attribute)» instanceof «caze.node.type.name»){
			«caze.node.type.name» «caze.node.name» = («caze.node.type.name») «translate(zwitch.attribute)»;
			«IF caze.when !== null»
				if(«translate(caze.when)»){
			«ENDIF»
			«FOR bodyExpr : caze.body.expressions»
				«translate(bodyExpr)»;
			«ENDFOR»
			«IF caze.when !== null»
				}
				«IF zwitch.^default !== null && doCasesContainReturn(zwitch)»
					else {
						//default case to guarantee return
					«FOR bodyExpr : (zwitch.^default.body as GenCaseBody).expressions»
						«translate(bodyExpr)»;
					«ENDFOR»
					}
				«ENDIF»
		«ENDIF»
		}'''
	}
	
	def static boolean doCasesContainReturn(GenSwitchCase zwitch){
		for(caze : zwitch.cases){
			val expressions = caze.body.expressions
			if(expressions.filter(GenReturn).empty){
				return false
			}
		}
		return true
	}

	def static dispatch private String internalTranslate(GenCaseWithoutCast caze) {
		val zwitch = EcoreUtil2.getContainerOfType(caze, GenSwitchCase)
		val isEnum = TypeCalculator.evaluate(zwitch.attribute) === TypeModelPackage.Literals.ENUM
		return isEnum ? translateCaseWithEnum(caze) : translateCaseWithoutEnum(caze)
	}

	def static private translateCaseWithoutEnum(GenCaseWithoutCast caze) {
		val zwitch = EcoreUtil2.getContainerOfType(caze, GenSwitchCase)
		return '''
		if(«translate(caze.^val)» == «translate(zwitch.attribute)»){
		«FOR bodyExpr : caze.body.expressions»
			«translate(bodyExpr)»;
		«ENDFOR»
		}'''
	}

	def static dispatch private String internalTranslate(GenSwitchCase zwitch) {
		val isEnum = TypeCalculator.evaluate(zwitch.attribute) === TypeModelPackage.Literals.ENUM
		return isEnum ? translateGenSwitchCaseWithEnum(zwitch) : translateGenSwitchCaseWithoutEnum(zwitch)
	}

	def static private String translateGenSwitchCaseWithoutEnum(GenSwitchCase zwitch) {
		return '''
			«FOR caze : zwitch.cases SEPARATOR 'else'»
				«translate(caze)»
			«ENDFOR»
			«IF zwitch.^default !== null»
				else {
				«FOR bodyExpr : (zwitch.^default.body as GenCaseBody).expressions»
					«translate(bodyExpr)»;
				«ENDFOR»
				}
			«ENDIF»
		'''
	}

	def static private String translateGenSwitchCaseWithEnum(GenSwitchCase zwitch) {
		return '''
			switch(«translate(zwitch.attribute)»){
			«FOR caze : zwitch.cases»
				«translate(caze)»
			«ENDFOR»
			«IF zwitch.^default !== null»
				default: {
				«FOR bodyExpr : (zwitch.^default.body as GenCaseBody).expressions»
					«translate(bodyExpr)»;
				«ENDFOR»
				}
			«ENDIF»
			}
		'''
	}

	def static private translateCaseWithEnum(GenCaseWithoutCast caze) {
		// clip enum reference to qualified enum in java code
		val caseSrc = translate(caze.^val).split('\\.')
		return '''
		case «caseSrc.get(caseSrc.length-1)»: {
		«FOR bodyExpr : caze.body.expressions»
			«translate(bodyExpr)»;
		«ENDFOR»
		}'''
	}

	def static dispatch private String internalTranslate(VariableDeclaration variable) {
		val type = TypeCalculator.getVarType(variable);
		var varTypeSrc = "";
		if (type instanceof Pattern) {
			varTypeSrc = NameProvider.getPatternClassName(type)
		} else if (type instanceof EClass) {
			varTypeSrc = type2src(type)
		} else {
			throw new IllegalArgumentException("Variable type is neither EClass nor Pattern")
		}

		return '''
			«varTypeSrc» «variable.name» = null;
		'''
	}

	def static dispatch private String internalTranslate(VariableDefinition variable) {
		val varType = TypeCalculator.getVarType(variable)
		val varTypeSrc = type2src(varType)

		return '''
			«varTypeSrc» «variable.name» = «translate(variable.value)»;
		'''
	}

	/**
	 * Translates a given type into source code
	 */
	def static dispatch private String type2src(EClassifier type) {
		var varType = type.name
		if (type === TypeModelPackage.Literals.DOUBLE) {
			varType = "double"
		}
		if (type === TypeModelPackage.Literals.INTEGER) {
			varType = "int"
		}
		if (type === TypeModelPackage.Literals.BOOLEAN) {
			varType = "boolean"
		}
		return varType
	}

	/**
	 * Translates a given type into source code
	 */
	def static dispatch private String type2src(Pattern type) {
		var varType = NameProvider.getPatternClassName(type)
		return varType
	}

	def static dispatch private String internalTranslate(VariableManipulation vm) {
		return '''«vm.^var.name» = «translate(vm.^val)»'''
	}

	def static dispatch private String internalTranslate(CollectionManipulation cm) {
		return GeneralTranslator.translate(cm)
	}

	def static dispatch private String internalTranslate(GenReturn ret) {
		return '''return «ret.returnValue === null ? "null" : translate(ret.returnValue)»'''
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
