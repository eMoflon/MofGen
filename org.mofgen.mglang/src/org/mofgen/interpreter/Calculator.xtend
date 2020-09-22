package org.mofgen.interpreter

import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.Tertiary
import org.mofgen.mGLang.Secondary
import org.mofgen.mGLang.Primary
import org.mofgen.mGLang.Rel
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.BooleanLiteral
import org.mofgen.mGLang.NumberLiteral
import org.mofgen.mGLang.StringLiteral
import org.eclipse.emf.ecore.EOperation
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.PrimitiveParameter
import org.mofgen.mGLang.PrimitiveType
import org.mofgen.mGLang.UnaryMinus
import com.google.inject.Inject
import org.mofgen.typeModel.TypeModelPackage

class Calculator {

	@Inject TypeCalculator typeChecker
	
	def Object evaluate(ArithmeticExpression expr) {
		//Actual calculation
		val result = internalEvaluate(expr)
		switch (result.class) {
			case Double: return result as Double
			case Integer: return result as Double
			case String: return result as String
			case Boolean: return result as Boolean
			case EOperation: return result as EOperation
		}
		return result
	}

	def dispatch private internalEvaluate(Tertiary tertiary) {
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

		} else if(typeChecker.evaluate(tertiary.left) === TypeModelPackage.Literals.NUMBER && typeChecker.evaluate(tertiary.right) === TypeModelPackage.Literals.NUMBER) {
			// -------------------- Numerical Values -----------------------	
			val castLeft = evalLeft as Double
			val castRight = evalRight as Double
			switch (tertiary.op) {
				case PLUS: castLeft + castRight
				case MINUS: castLeft - castRight
				case OR: throw new MismatchingTypesException("Cannot use logical OR on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Secondary secondary) {
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
		} else if (evalLeft instanceof Double && evalRight instanceof Double) {
			// -------------------- Numerical Values -----------------------	
			val castLeft = evalLeft as Integer
			val castRight = evalRight as Integer
			switch (secondary.op) {
				case MOD: return castLeft % castRight
				case XOR: throw new MismatchingTypesException("Cannot use modulo on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Primary primary) {
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
		} else if (evalLeft instanceof Double && evalRight instanceof Double) {
			// -------------------- Numerical Values -----------------------	
			val castLeft = evalLeft as Double
			val castRight = evalRight as Double
			switch (primary.op) {
				case MUL: return (castLeft * castRight) as Double
				case DIV: return (castLeft / castRight) as Double
				case AND: throw new MismatchingTypesException("Cannot use logical AND on numerical values")
			}
		} else {
			throw new MismatchingTypesException("Invalid Expression.")
		}
	}

	def dispatch private internalEvaluate(Rel rel) {
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
		} else if (evalLeft instanceof Double && evalRight instanceof Double) {
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

	def dispatch private internalEvaluate(BooleanLiteral lit) {
		return lit.^val
	}

	def dispatch private internalEvaluate(NumberLiteral lit) {
		return lit.^val
	}

	def dispatch private internalEvaluate(StringLiteral lit) {
		return lit.^val
	}

	def dispatch private internalEvaluate(NegationExpression negExpr) {
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

	def dispatch private internalEvaluate(FunctionCall fc) {
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
					return Math.floor(Math.sqrt(eval)) as int;
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
					return Math.abs(eval) as double;
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

	def dispatch private internalEvaluate(RefOrCall roc) {
		if (roc.ref instanceof Variable) {
			return internalEvaluate((roc.ref as Variable).value)
		}
		// TODO This can usually be only inferred during runtime. therefore separate type checker? OR even turn THIS class into a type checker only?
		if (roc.ref instanceof PrimitiveParameter) {
			val primPram = roc.ref as PrimitiveParameter
			switch primPram.type {
				case PrimitiveType.DOUBLE,
				case PrimitiveType.INT: {
					return 0
				}
				case PrimitiveType.STRING,
				case PrimitiveType.CHAR: {
					return ""
				}
				case PrimitiveType.BOOLEAN: {
					return false
				}
			}
		}
		return roc.ref
	}
	
	def dispatch private internalEvaluate(UnaryMinus uMinus){
		val eval = evaluate(uMinus.expr)
		if(eval instanceof String){
			throw new MismatchingTypesException("Cannot negate string.")
		}
		if(eval instanceof Boolean){
			throw new MismatchingTypesException("Cannot use minus-operator on boolean value. For negation use '!' instead.")
		}
		return eval;
	}

	def dispatch private internalEvaluate(PatternCall pc) {
		return pc
	}

// TODO: Idea: One evaluator for actual evaluation and one evaluator only for type checking?
}
