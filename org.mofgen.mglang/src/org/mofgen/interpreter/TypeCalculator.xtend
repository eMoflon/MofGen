package org.mofgen.interpreter

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.BooleanLiteral
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.IteratorVariable
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.MathFunc
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NullLiteral
import org.mofgen.mGLang.NumberLiteral
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.PrimitiveType
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.StringLiteral
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.Variable
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.utils.MofgenModelUtils

class TypeCalculator {

	def static EObject evaluate(ArithmeticExpression expr) {
		if (expr === null) {
			throw new IllegalArgumentException("Received null expression")
		}
		val eval = internalEvaluate(expr)
		if (eval instanceof EClass) {
			return MofgenModelUtils.getEClassForInternalModel(eval)
		} else {
			return eval
		}
	}

	def static dispatch private EObject internalEvaluate(Node node) {
		return node.type
	}
	
	def static dispatch private EObject internalEvaluate(Variable variable){
		return TypeRegistryDispatcher.getVarType(variable)
	}

	def static dispatch private EObject internalEvaluate(Tertiary tertiary) {
		val evalLeft = evaluate(tertiary.left) as EClass
		val evalRight = evaluate(tertiary.right) as EClass

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.STRING
				case MINUS: throw new MismatchingTypesException("Cannot subtract Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.STRING &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			// -------------------- Strings -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.STRING
				case MINUS: throw new MismatchingTypesException("Cannot subtract from Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.STRING
				case MINUS: throw new MismatchingTypesException("Cannot subtract Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.BOOLEAN && evalRight === TypeModelPackage.Literals.BOOLEAN) {
			// -------------------- Boolean Values -----------------------	
			switch (tertiary.op) {
				case PLUS: throw new MismatchingTypesException("Cannot add boolean values")
				case MINUS: throw new MismatchingTypesException("Cannot subtract boolean values")
				case OR: return TypeModelPackage.Literals.BOOLEAN
			}

		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			if (evalLeft === TypeModelPackage.Literals.DOUBLE || evalRight === TypeModelPackage.Literals.DOUBLE) {
				// -------------------- Numerical Values -----------------------	
				switch (tertiary.op) {
					case PLUS: return TypeModelPackage.Literals.DOUBLE
					case MINUS: return TypeModelPackage.Literals.DOUBLE
					case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
				}
			} else {
				// -------------------- Numerical Values -----------------------	
				switch (tertiary.op) {
					case PLUS: return TypeModelPackage.Literals.INTEGER
					case MINUS: return TypeModelPackage.Literals.INTEGER
					case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
				}
			}
		} else {
			var evalLeftString = "NULL"
			var evalRightString = "NULL"

			if (evalLeft instanceof EClass) {
				evalLeftString = evalLeft.name
			}
			if (evalLeft instanceof Pattern) {
				evalLeftString = evalLeft.name
			}
			if (evalRight instanceof EClass) {
				evalRightString = evalRight.name
			}
			if (evalRight instanceof Pattern) {
				evalRightString = evalRight.name
			}

			throw new MismatchingTypesException(
				"Cannot use operator " + tertiary.op.toString + " with given values " + evalLeftString + " and " +
					evalRightString)
		}
	}

	def static dispatch private EObject internalEvaluate(Secondary secondary) {
		val evalLeft = evaluate(secondary.left) as EClass
		val evalRight = evaluate(secondary.right) as EClass

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (secondary.op) {
				case MOD: throw new MismatchingTypesException("Cannot use modulo on Strings")
				case XOR: throw new MismatchingTypesException("Cannot use logical XOR on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.BOOLEAN && evalRight === TypeModelPackage.Literals.BOOLEAN) {
			// -------------------- Boolean Values -----------------------	
			switch (secondary.op) {
				case MOD: throw new MismatchingTypesException("Cannot use modulo on boolean values")
				case XOR: return TypeModelPackage.Literals.BOOLEAN
			}
		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			if (evalLeft === TypeModelPackage.Literals.DOUBLE || evalRight === TypeModelPackage.Literals.DOUBLE) {
				// -------------------- Numerical Values -----------------------	
				switch (secondary.op) {
					case MOD: throw new MismatchingTypesException("Can only use modulo on integer values")
					case XOR: throw new MismatchingTypesException("Can only use modulo on integer values")
				}
			} else {
				// -------------------- Numerical Values -----------------------	
				switch (secondary.op) {
					case MOD: return TypeModelPackage.Literals.INTEGER
					case XOR: throw new MismatchingTypesException("Can only use modulo on integer values")
				}
			}
		} else {
			var evalLeftString = "NULL"
			var evalRightString = "NULL"

			if (evalLeft instanceof EClass) {
				evalLeftString = evalLeft.name
			}
			if (evalLeft instanceof Pattern) {
				evalLeftString = evalLeft.name
			}
			if (evalRight instanceof EClass) {
				evalRightString = evalRight.name
			}
			if (evalRight instanceof Pattern) {
				evalRightString = evalRight.name
			}

			throw new MismatchingTypesException(
				"Cannot use operator " + secondary.op.toString + " with given values " + evalLeftString + " and " +
					evalRightString)
		}
	}

	def static dispatch private EObject internalEvaluate(Primary primary) {
		val evalLeft = evaluate(primary.left) as EClass
		val evalRight = evaluate(primary.right) as EClass

//		if (evalLeft === TypeModelPackage.Literals.NULL_OBJECT || evalRight === TypeModelPackage.Literals.NULL_OBJECT) {
//			switch (primary.op) {
//				case MUL: throw new MismatchingTypesException("Cannot multiply Strings")
//				case DIV: throw new MismatchingTypesException("Cannot divide Strings")
//				case AND: throw new MismatchingTypesException("Cannot use logical AND on Strings")
//			}
//		}
		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (primary.op) {
				case MUL: throw new MismatchingTypesException("Cannot multiply Strings")
				case DIV: throw new MismatchingTypesException("Cannot divide Strings")
				case AND: throw new MismatchingTypesException("Cannot use logical AND on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.BOOLEAN && evalRight === TypeModelPackage.Literals.BOOLEAN) {
			// -------------------- Boolean Values -----------------------	
			switch (primary.op) {
				case MUL: throw new MismatchingTypesException("Cannot multiply boolean values")
				case DIV: throw new MismatchingTypesException("Cannot divide boolean values")
				case AND: return TypeModelPackage.Literals.STRING
			}
		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			if (evalLeft === TypeModelPackage.Literals.DOUBLE || evalRight === TypeModelPackage.Literals.DOUBLE) {
				// -------------------- Numerical Values -----------------------	
				switch (primary.op) {
					case MUL: return TypeModelPackage.Literals.DOUBLE
					case DIV: return TypeModelPackage.Literals.DOUBLE
					case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
				}
			} else {
				// -------------------- Numerical Values -----------------------	
				switch (primary.op) {
					case MUL: return TypeModelPackage.Literals.INTEGER
					case DIV: return TypeModelPackage.Literals.DOUBLE
					case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
				}
			}
		} else {
			var evalLeftString = "NULL"
			var evalRightString = "NULL"

			if (evalLeft instanceof EClass) {
				evalLeftString = evalLeft.name
			}
			if (evalLeft instanceof Pattern) {
				evalLeftString = evalLeft.name
			}
			if (evalRight instanceof EClass) {
				evalRightString = evalRight.name
			}
			if (evalRight instanceof Pattern) {
				evalRightString = evalRight.name
			}

			throw new MismatchingTypesException(
				"Cannot use operator " + primary.op.toString + " with given values " + evalLeftString + " and " +
					evalRightString)
		}
	}

	def static dispatch private EObject internalEvaluate(Rel rel) {
		val evalLeft = evaluate(rel.left) as EClass
		val evalRight = evaluate(rel.right) as EClass

		if (evalLeft === TypeModelPackage.Literals.NULL_OBJECT || evalRight === TypeModelPackage.Literals.NULL_OBJECT) {
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case LESS: throw new MismatchingTypesException("Can compare none only for (in)equality")
			}
		}

		if (evalLeft !== evalRight) {
			throw new MismatchingTypesException("Cannot compare objects of different types for (in)equality")
		}

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case LESS: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
			}
		} else if (evalLeft === TypeModelPackage.Literals.BOOLEAN && evalRight === TypeModelPackage.Literals.BOOLEAN) {
			// -------------------- Boolean Values -----------------------	
			switch (rel.relation) {
				case GREATER:
					throw new MismatchingTypesException("Can only compare boolean values for (in)equality.")
				case GREATER_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (in)equality.")
				case EQUAL:
					return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL:
					return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (in)equality.")
				case LESS:
					throw new MismatchingTypesException("Can only compare boolean values for (in)equality.")
			}
		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			// -------------------- Numerical Values -----------------------	
			return TypeModelPackage.Literals.BOOLEAN
		} else {
			var evalLeftString = "NULL"
			var evalRightString = "NULL"

			if (evalLeft instanceof EClass) {
				evalLeftString = evalLeft.name
			}
			if (evalLeft instanceof Pattern) {
				evalLeftString = evalLeft.name
			}
			if (evalRight instanceof EClass) {
				evalRightString = evalRight.name
			}
			if (evalRight instanceof Pattern) {
				evalRightString = evalRight.name
			}

			throw new MismatchingTypesException(
				"Cannot use operator " + rel.relation.toString + " with given values " + evalLeftString + " and " +
					evalRightString)
		}
	}

	def static dispatch private EObject internalEvaluate(BooleanLiteral lit) {
		return TypeModelPackage.Literals.BOOLEAN
	}

	def static dispatch private EObject internalEvaluate(NullLiteral lit) {
		return TypeModelPackage.Literals.NULL_OBJECT
	}

	def static dispatch private EObject internalEvaluate(NumberLiteral lit) {
		val value = lit.^val
		if (Math.floor(value) == (value as int)) {
			return TypeModelPackage.Literals.INTEGER
		} else {
			return TypeModelPackage.Literals.DOUBLE
		}
	}

	def static dispatch private EObject internalEvaluate(StringLiteral lit) {
		return TypeModelPackage.Literals.STRING
	}

	def static dispatch private EObject internalEvaluate(NegationExpression negExpr) {
		val toNeg = negExpr.expr
		val eval = evaluate(toNeg)
		if (eval === TypeModelPackage.Literals.STRING) {
			throw new MismatchingTypesException("Cannot negate String")
		}
		if (eval === TypeModelPackage.Literals.NUMBER) {
			throw new MismatchingTypesException("Cannot negate numerical value")
		}
		if (eval === TypeModelPackage.Literals.BOOLEAN) {
			return TypeModelPackage.Literals.BOOLEAN
		}

		throw new MismatchingTypesException("Unhandled type in negating expression")
	}

	def static dispatch private EObject internalEvaluate(FunctionCall fc) {
		val expr = fc.expr
		val op = fc.func
		val exprType = evaluate(expr)
		if (exprType === TypeModelPackage.Literals.STRING) {
			throw new MismatchingTypesException("Cannot use function " + op.getName + "on String")
		}
		if (exprType === TypeModelPackage.Literals.BOOLEAN) {
			throw new MismatchingTypesException("Cannot use function " + op.getName + "on Boolean")
		}

		if (op == MathFunc.ABS) {
			return exprType
		} else if (op == MathFunc.SQRT) {
			return TypeModelPackage.Literals.DOUBLE
		} else {
			throw new UnsupportedOperationException("Type for using operator " + op.getName + " can not be calculcated")
		}

	}

	def static dispatch private EObject internalEvaluate(RefOrCall roc) {

		if (roc.ref !== null && roc.ref.eIsProxy) {
			return null;
		}

		var highestRoc = getSuperRoc(roc)
		var ref = highestRoc.ref

		if (ref === null && highestRoc.thisUsed) {
			return EcoreUtil2.getContainerOfType(highestRoc, Pattern)
		}

		if (ref === null || ref.eIsProxy) {
			return null;
		}

		switch ref {
			Variable:
				return TypeRegistryDispatcher.getVarType(ref)
			PrimitiveParameter: {
				if (ref.type !== null) {
					switch ref.type {
						case PrimitiveType.DOUBLE: {
							return TypeModelPackage.Literals.DOUBLE
						}
						case PrimitiveType.INT: {
							return TypeModelPackage.Literals.INTEGER
						}
						case PrimitiveType.CHAR: {
							return TypeModelPackage.Literals.STRING
						}
						case PrimitiveType.BOOLEAN: {
							return TypeModelPackage.Literals.BOOLEAN
						}
					}
				}
			}
			ParameterNodeOrPattern: {
				if (ref.type !== null && ref.type instanceof Pattern) {
					return ref.type
				} else {
					return MofgenModelUtils.getEClassForInternalModel(ref.type as EClassifier)
				}
			}
			EEnum: {
				return TypeModelPackage.Literals.ENUM
			}
			EEnumLiteral: {
				return TypeModelPackage.Literals.ENUM_LITERAL
			}
			Node: {
				return (ref as Node).type
			}
			Map: {
				return TypeModelPackage.Literals.MAP
			}
			List: {
				return TypeModelPackage.Literals.LIST
			}
			EAttribute: {
				return MofgenModelUtils.getEClassForInternalModel(ref.EType)
			}
			EReference: {
				return MofgenModelUtils.getEClassForInternalModel(ref.EType)
			}
			EOperation: {
				val op = ref
				val trg = roc.target
				if (trg !== null && trg.ref !== null && trg.ref instanceof List) {
					if (op == TypeModelPackage.Literals.LIST___GET__INT) {
						return TypeRegistryDispatcher.getListType(trg.ref as List)
					}
				}
				if (trg !== null && trg.ref !== null && trg.ref instanceof Map) {
					if (op == TypeModelPackage.Literals.MAP___GET__EOBJECT) {
						return TypeRegistryDispatcher.getMapEntryType(trg.ref as Map)
					}
					if (op == TypeModelPackage.Literals.MAP___GET_KEY_TO_ENTRY__EOBJECT) {
						return TypeRegistryDispatcher.getMapKeyType(trg.ref as Map)
					}
					if (op == TypeModelPackage.Literals.MAP___REMOVE__EOBJECT) {
						return TypeRegistryDispatcher.getMapEntryType(trg.ref as Map)
					}
				}
				return MofgenModelUtils.getEClassForInternalModel(op.EType)
			}
			IteratorVariable: {
				val container = ref.eContainer
				switch container {
					RangeForHead: {
						return TypeModelPackage.Literals.INTEGER
					}
					GeneralForEachHead: {
						if (container.eref == TypeModelPackage.Literals.MAP__ENTRIES) {
							return TypeRegistryDispatcher.getMapEntryType(container.src.ref as Map)
						} else if (container.eref == TypeModelPackage.Literals.MAP__KEYS) {
							return TypeRegistryDispatcher.getMapKeyType(container.src.ref as Map)
						} else {
							return container.eref.EType
						}
					}
					ListForEachHead: {
						return TypeRegistryDispatcher.getListType(container.list)
					}
				}
			}
			Pattern:
				return ref
			default: {
				throw new IllegalStateException("Could not handle type of " + highestRoc.ref)
			}
		}
	}

	/**
	 * @return the top-roc element, containing all sub-roc-objects if existent
	 */
	def private static getSuperRoc(RefOrCall roc) {
		var iterator = roc
		while (iterator.eContainer instanceof RefOrCall) {
			iterator = iterator.eContainer as RefOrCall
		}
		return iterator
	}

	def static dispatch private internalEvaluate(UnaryMinus uMinus) {
		val eval = evaluate(uMinus.expr)
		if (eval === TypeModelPackage.Literals.STRING) {
			throw new MismatchingTypesException("Cannot negate string.")
		}
		if (eval === TypeModelPackage.Literals.BOOLEAN) {
			throw new MismatchingTypesException(
				"Cannot use minus-operator on boolean value. For negation use '!' instead.")
		}
		return eval;
	}

	def static dispatch private EObject internalEvaluate(PatternCall pc) {
		val calledPattern = pc.called
		val ret = pc.called.^return
		if (ret !== null) {
			val retValue = internalEvaluate(ret.retValue)
			if (retValue !== null) {
				return retValue
			} else {
				return calledPattern
			}
		} else {
			return null
		}
	}
}
