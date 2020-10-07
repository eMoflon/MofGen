package org.mofgen.interpreter

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.BooleanLiteral
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.List
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NumberLiteral
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.PrimitiveType
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.StringLiteral
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.Variable
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.utils.MofgenModelUtils
import org.mofgen.mGLang.Pattern

class TypeCalculator {

	def evaluate(ArithmeticExpression expr) {
		return internalEvaluate(expr)
	}

	def dispatch private internalEvaluate(Tertiary tertiary) {
		val evalLeft = evaluate(tertiary.left)
		val evalRight = evaluate(tertiary.right)

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.STRING
				case MINUS: throw new MismatchingTypesException("Cannot subtract Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Strings -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.STRING
				case MINUS: throw new MismatchingTypesException("Cannot subtract from Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft === TypeModelPackage.Literals.NUMBER && evalRight === TypeModelPackage.Literals.STRING) {
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

		} else if (evalLeft === TypeModelPackage.Literals.NUMBER && evalRight === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Numerical Values -----------------------	
			switch (tertiary.op) {
				case PLUS: return TypeModelPackage.Literals.NUMBER
				case MINUS: return TypeModelPackage.Literals.NUMBER
				case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Secondary secondary) {
		val evalLeft = evaluate(secondary.left)
		val evalRight = evaluate(secondary.right)

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
		} else if (evalLeft === TypeModelPackage.Literals.NUMBER && evalRight === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Numerical Values -----------------------	
			switch (secondary.op) {
				case MOD: return TypeModelPackage.Literals.NUMBER
				case XOR: throw new MismatchingTypesException("Cannot use modulo on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Primary primary) {
		val evalLeft = evaluate(primary.left)
		val evalRight = evaluate(primary.right)

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
		} else if (evalLeft === TypeModelPackage.Literals.NUMBER && evalRight === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Numerical Values -----------------------	
			switch (primary.op) {
				case MUL: return TypeModelPackage.Literals.NUMBER
				case DIV: return TypeModelPackage.Literals.NUMBER
				case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Rel rel) {
		val evalLeft = evaluate(rel.left)
		val evalRight = evaluate(rel.right)

		if (evalLeft !== evalRight) {
			throw new MismatchingTypesException("Cannot compare objects of different types for equality")
		}

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case LESS: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
			}
		} else if (evalLeft === TypeModelPackage.Literals.BOOLEAN && evalRight === TypeModelPackage.Literals.BOOLEAN) {
			// -------------------- Boolean Values -----------------------	
			switch (rel.relation) {
				case GREATER:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case GREATER_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case EQUAL:
					return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL:
					return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case LESS:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
			}
		} else if (evalLeft === TypeModelPackage.Literals.NUMBER && evalRight === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Numerical Values -----------------------	
			return TypeModelPackage.Literals.BOOLEAN
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(BooleanLiteral lit) {
		return TypeModelPackage.Literals.BOOLEAN
	}

	def dispatch private internalEvaluate(NumberLiteral lit) {
		return TypeModelPackage.Literals.NUMBER
	}

	def dispatch private internalEvaluate(StringLiteral lit) {
		return TypeModelPackage.Literals.STRING
	}

	def dispatch private internalEvaluate(NegationExpression negExpr) {
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

	def dispatch private internalEvaluate(FunctionCall fc) {
		val expr = fc.expr
		val op = fc.func
		if (evaluate(expr) === TypeModelPackage.Literals.STRING) {
			throw new MismatchingTypesException("Cannot use function " + op.getName + "on String")
		}
		if (evaluate(expr) === TypeModelPackage.Literals.BOOLEAN) {
			throw new MismatchingTypesException("Cannot use function " + op.getName + "on Boolean")
		}

		return TypeModelPackage.Literals.NUMBER
	}

	def dispatch private internalEvaluate(RefOrCall roc) {

		var ref = roc.ref
		switch ref {
			Variable:
				return internalEvaluate(ref.value)
			PrimitiveParameter: {
				switch ref.type {
					case PrimitiveType.DOUBLE,
					case PrimitiveType.INT: {
						return TypeModelPackage.Literals.NUMBER
					}
					case PrimitiveType.STRING,
					case PrimitiveType.CHAR: {
						return TypeModelPackage.Literals.STRING
					}
					case PrimitiveType.BOOLEAN: {
						return TypeModelPackage.Literals.BOOLEAN
					}
				}
			}
			ParameterNodeOrPattern: {
				if (ref.type instanceof Pattern) {
					return ref.type
				}else{
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
				return (roc.ref as Node).type
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
				if (trg.ref instanceof List) {
					if (op == TypeModelPackage.Literals.LIST___GET__INT) {
						return TypeRegistry.getListType(trg.ref as List)
					}
				}
				if (trg.ref instanceof Map) {
					if (op == TypeModelPackage.Literals.MAP___GET__EOBJECT) {
						return TypeRegistry.getMapEntryType(trg.ref as Map)
					}
					if (op == TypeModelPackage.Literals.MAP___GET_KEY_TO_ENTRY__EOBJECT) {
						return TypeRegistry.getMapKeyType(trg.ref as Map)
					}
				}
				return MofgenModelUtils.getEClassForInternalModel(op.EType)
			}
			default: {
				throw new IllegalStateException("Could not handle type of " + roc.ref)
			}
		}
	}

	def dispatch private internalEvaluate(UnaryMinus uMinus) {
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

	def dispatch private internalEvaluate(PatternCall pc) {
		val ret = pc.called.^return
		val calledPattern = pc.called
		if(ret !== null){
			val retValue = ret.returnValue
			if(retValue !== null){
				return retValue.type
			}else{
				return calledPattern
			}
		}else{
			return null
		}
	}
}
