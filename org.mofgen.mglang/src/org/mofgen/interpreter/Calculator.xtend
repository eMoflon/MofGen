package org.mofgen.interpreter

import org.eclipse.emf.ecore.EOperation
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.BooleanLiteral
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.NumberLiteral
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.StringLiteral
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.UnaryMinus
import org.mofgen.mGLang.VariableDeclaration
import org.mofgen.mGLang.VariableDefinition
import org.mofgen.utils.MofgenModelUtils

class Calculator {

	def static Object evaluate(ArithmeticExpression expr) {
		// Actual calculation
		val result = internalEvaluate(expr)
		switch (result) {
			case Double: return MofgenModelUtils.getIntegerIfPossible(result as Double)
			case Integer: return result as Integer
			case String: return result as String
			case Boolean: return result as Boolean
			case EOperation: return result as EOperation
		}
		return result
	}

	def static dispatch private Object internalEvaluate(Tertiary tertiary) {
		val evalLeft = evaluate(tertiary.left)
		val evalRight = evaluate(tertiary.right)

		if (evalLeft instanceof String && evalRight instanceof String) {
			// -------------------- Strings -----------------------	
			val castLeft = evalLeft as String
			val castRight = evalRight as String

			switch (tertiary.op) {
				case PLUS: return castLeft + castRight
				case MINUS: throw new MismatchingTypesException("Cannot subtract Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft instanceof String && evalRight instanceof Number) {
			// -------------------- Strings -----------------------	
			val castLeft = evalLeft as String
			val castRight = evalRight as Number

			switch (tertiary.op) {
				case PLUS: return castLeft + castRight.toString
				case MINUS: throw new MismatchingTypesException("Cannot subtract from Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft instanceof Number && evalRight instanceof String) {
			// -------------------- Strings -----------------------	
			val castLeft = evalLeft as Number
			val castRight = evalRight as String

			switch (tertiary.op) {
				case PLUS: return castLeft.toString + castRight
				case MINUS: throw new MismatchingTypesException("Cannot subtract Strings")
				case OR: throw new MismatchingTypesException("Cannot use logical OR on Strings")
			}
		} else if (evalLeft instanceof Boolean && evalRight instanceof Boolean) {
			// -------------------- Boolean Values -----------------------	
			val castLeft = evalLeft as Boolean
			val castRight = evalRight as Boolean
			switch (tertiary.op) {
				case PLUS: throw new MismatchingTypesException("Cannot add boolean values")
				case MINUS: throw new MismatchingTypesException("Cannot subtract boolean values")
				case OR: return castLeft || castRight
			}

		} else if (evalLeft instanceof Number && evalRight instanceof Number) {
			// -------------------- Numerical Values -----------------------	
			if (evalLeft instanceof Integer && evalRight instanceof Integer) {
				var castLeft = evalLeft as Integer
				var castRight = evalRight as Integer

				switch (tertiary.op) {
					case PLUS: castLeft + castRight
					case MINUS: castLeft - castRight
					case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
				}
			} else {
				var castLeft = evalLeft as Double
				var castRight = evalRight as Double

				switch (tertiary.op) {
					case PLUS: castLeft + castRight
					case MINUS: castLeft - castRight
					case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
				}
			}

		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def static dispatch private Object internalEvaluate(Secondary secondary) {
		val evalLeft = evaluate(secondary.left)
		val evalRight = evaluate(secondary.right)

		if (evalLeft instanceof String && evalRight instanceof String) {
			// -------------------- Strings -----------------------	
			switch (secondary.op) {
				case MOD: throw new MismatchingTypesException("Cannot use modulo on Strings")
				case XOR: throw new MismatchingTypesException("Cannot use logical XOR on Strings")
			}
		} else if (evalLeft instanceof Boolean && evalRight instanceof Boolean) {
			// -------------------- Boolean Values -----------------------	
			val castLeft = evalLeft as Boolean
			val castRight = evalRight as Boolean
			switch (secondary.op) {
				case MOD: throw new MismatchingTypesException("Cannot use modulo on boolean values")
				case XOR: return !(castLeft == castRight)
			}
		} else if (evalLeft instanceof Number && evalRight instanceof Number) {
			// -------------------- Numerical Values -----------------------	
			if (evalLeft instanceof Integer && evalRight instanceof Integer) {
				var castLeft = evalLeft as Integer
				var castRight = evalRight as Integer

				switch (secondary.op) {
					case MOD: return castLeft % castRight
					case XOR: throw new MismatchingTypesException("Cannot use XOR on numerical values")
				}
			} else {
				switch (secondary.op) {
					case MOD:
						throw new MismatchingTypesException("Can only use modulo on integer values but got double")
					case XOR:
						throw new MismatchingTypesException("Cannot use XOR on numerical values")
				}
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def static dispatch private Object internalEvaluate(Primary primary) {
		val evalLeft = evaluate(primary.left)
		val evalRight = evaluate(primary.right)

		if (evalLeft instanceof String && evalRight instanceof String) {
			// -------------------- Strings -----------------------	
			switch (primary.op) {
				case MUL: throw new MismatchingTypesException("Cannot multiply Strings")
				case DIV: throw new MismatchingTypesException("Cannot divide Strings")
				case AND: throw new MismatchingTypesException("Cannot use logical AND on Strings")
			}
		} else if (evalLeft instanceof Boolean && evalRight instanceof Boolean) {
			// -------------------- Boolean Values -----------------------	
			val castLeft = evalLeft as Boolean
			val castRight = evalRight as Boolean
			switch (primary.op) {
				case MUL: throw new MismatchingTypesException("Cannot multiply boolean values")
				case DIV: throw new MismatchingTypesException("Cannot divide boolean values")
				case AND: return castLeft && castRight
			}
		} else if (evalLeft instanceof Number && evalRight instanceof Number) {
			// -------------------- Numerical Values -----------------------	
			if (evalLeft instanceof Integer && evalRight instanceof Integer) {
				var castLeft = evalLeft as Integer
				var castRight = evalRight as Integer

				switch (primary.op) {
					case MUL: return castLeft * castRight
					case DIV: return castLeft / castRight
					case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
				}
			} else {
				var castLeft = evalLeft as Double
				var castRight = evalRight as Double

				switch (primary.op) {
					case MUL: return castLeft * castRight
					case DIV: return castLeft / castRight
					case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
				}
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def static dispatch private Object internalEvaluate(Rel rel) {
		val evalLeft = evaluate(rel.left)
		val evalRight = evaluate(rel.right)

		if (evalLeft.class !== evalRight.class) {
			throw new MismatchingTypesException("Cannot compare objects of different types for equality")
		}

		if (evalLeft instanceof String && evalRight instanceof String) {
			// -------------------- Strings -----------------------	
			val castLeft = evalLeft as String
			val castRight = evalRight as String

			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case EQUAL: return castLeft.equals(castRight)
				case UNEQUAL: return !castLeft.equals(castRight)
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
				case LESS: throw new MismatchingTypesException("Can only compare Strings for (un)equality.")
			}
		} else if (evalLeft instanceof Boolean && evalRight instanceof Boolean) {
			// -------------------- Boolean Values -----------------------	
			val castLeft = evalLeft as Boolean
			val castRight = evalRight as Boolean
			switch (rel.relation) {
				case GREATER:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case GREATER_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case EQUAL:
					return castLeft == castRight
				case UNEQUAL:
					return castLeft != castRight
				case LESS_OR_EQUAL:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
				case LESS:
					throw new MismatchingTypesException("Can only compare boolean values for (un)equality.")
			}
		} else if (evalLeft instanceof Number && evalRight instanceof Number) {
			// -------------------- Numerical Values -----------------------	
			val castLeft = evalLeft as Double
			val castRight = evalRight as Double
			switch (rel.relation) {
				case GREATER: return castLeft > castRight
				case GREATER_OR_EQUAL: return castLeft >= castRight
				case EQUAL: return castLeft == castRight
				case UNEQUAL: return castLeft != castRight
				case LESS_OR_EQUAL: return castLeft <= castRight
				case LESS: return castLeft < castRight
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def static dispatch private Object internalEvaluate(BooleanLiteral lit) {
		return lit.^val
	}

	def static dispatch private Object internalEvaluate(NumberLiteral lit) {
		val value = lit.^val
		if (Math.floor(value) == (value as int)) {
			return value as int
		} else {
			return value as double
		}
	}

	def static dispatch private Object internalEvaluate(StringLiteral lit) {
		return lit.^val
	}

	def static dispatch private Object internalEvaluate(NegationExpression negExpr) {
		val toNeg = negExpr.expr
		val eval = evaluate(toNeg)
		if (eval instanceof String) {
			throw new MismatchingTypesException("Cannot negate String")
		}
		if (eval instanceof Number) {
			throw new MismatchingTypesException("Cannot negate numerical value")
		}
		if (eval instanceof Boolean) {
			return !eval
		}

		throw new CalculatorException("Unhandled type in negating expression")
	}

	def static dispatch private Object internalEvaluate(FunctionCall fc) {
		val func = fc.func
		val eval = evaluate(fc.expr)

		switch (func) {
			case SQRT: {
				if (eval instanceof String) {
					throw new MismatchingTypesException("Cannot take root of String")
				}
				if (eval instanceof Double) {
					return Math.sqrt(eval);
				}
				if (eval instanceof Integer) {
					return MofgenModelUtils.getIntegerIfPossible(Math.sqrt(eval))
				}
				if (eval instanceof Boolean) {
					throw new MismatchingTypesException("Cannot take root of boolean value")
				}
			}
			case ABS: {
				if (eval instanceof String) {
					throw new MismatchingTypesException("Cannot take absolute value of String")
				}
				if (eval instanceof Double) {
					return MofgenModelUtils.getIntegerIfPossible(Math.abs(eval));
				}
				if (eval instanceof Integer) {
					return Math.abs(eval);
				}
				if (eval instanceof Boolean) {
					throw new MismatchingTypesException("Cannot take absolute value of boolean value")
				}
			}
		}
	}

	def static dispatch private Object internalEvaluate(RefOrCall roc) {
		if (roc.ref instanceof VariableDefinition) {
			return internalEvaluate((roc.ref as VariableDefinition).value)
		}
		if(roc.ref instanceof VariableDeclaration){
			return roc.ref
		}
		if (roc.ref instanceof PrimitiveParameter) {
			return roc.ref
//			val primPram = roc.ref as PrimitiveParameter
//			switch primPram.type {
//				case PrimitiveType.DOUBLE,
//				case PrimitiveType.INT: {
//					return 0.0
//				}
//				case PrimitiveType.CHAR: {
//					return ""
//				}
//				case PrimitiveType.BOOLEAN: {
//					return false
//				}
//			}
		}
		return roc.ref
	}

	def static dispatch private Object internalEvaluate(UnaryMinus uMinus) {
		val eval = evaluate(uMinus.expr)
		if (eval instanceof String) {
			throw new MismatchingTypesException("Cannot negate string.")
		}
		if (eval instanceof Boolean) {
			throw new MismatchingTypesException(
				"Cannot use minus-operator on boolean value. For negation use '!' instead.")
		}
		if(eval instanceof Integer){
			return -(eval);
		}else if(eval instanceof Double){
			return -(eval);
		}else{
			throw new UnsupportedOperationException("Only Integer or Double values should be negated but got: "+eval)
		}
	}

	def static dispatch private Object internalEvaluate(PatternCall pc) {
		return pc
	}

}
