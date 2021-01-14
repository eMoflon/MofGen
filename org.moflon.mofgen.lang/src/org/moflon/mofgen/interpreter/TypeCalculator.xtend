package org.mofgen.interpreter

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.EcoreUtil2
import org.mofgen.mGLang.ArithmeticExpression
import org.mofgen.mGLang.BooleanLiteral
import org.mofgen.mGLang.BracketExpression
import org.mofgen.mGLang.DoubleLiteral
import org.mofgen.mGLang.FunctionCall
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.IntegerLiteral
import org.mofgen.mGLang.IteratorVariable
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListAdHoc
import org.mofgen.mGLang.ListDeclaration
import org.mofgen.mGLang.ListDefinition
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.MapAdHoc
import org.mofgen.mGLang.MapDeclaration
import org.mofgen.mGLang.MapDefinition
import org.mofgen.mGLang.MathFunc
import org.mofgen.mGLang.NegationExpression
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NullLiteral
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
import org.mofgen.mGLang.VariableDeclaration
import org.mofgen.mGLang.VariableDefinition
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.utils.MofgenModelUtils
import org.mofgen.mGLang.RefOrCallOrPatternCall

class TypeCalculator {

	def static dispatch EObject evaluate(ArithmeticExpression expr) throws MismatchingTypesException {
		if (expr === null) {
			throw new IllegalArgumentException("Received null expression")
		}
		val eval = internalEvaluate(expr)
		if (eval instanceof EClass) {
			return MofgenModelUtils.getEClassifierForInternalModel(eval)
		} else {
			return eval
		}
	}

	def static dispatch EObject evaluate(RefOrCallOrPatternCall obj) {
		if (obj instanceof RefOrCall) {
			return evaluate(obj)
		} else {
			return evaluate(obj as PatternCall)
		}
	}

	def static EObject getVarType(Variable v) {
		if (v instanceof VariableDefinition) {
			val value = v.getValue()
			if (value !== null) {
				val valueEval = TypeCalculator.evaluate(value);
				if (valueEval !== null) {
					if (valueEval instanceof Pattern) {
						return valueEval as Pattern
					} else if (valueEval instanceof EClass) {
						return valueEval as EClass
					} else {
						throw new IllegalStateException(
							"Type evaluation of variable expression resulted in " + valueEval +
								" but should not result in a type different than Pattern or an EClass");
					}
				}
			}
		} else {
			val type = (v as VariableDeclaration).getType()
			return MofgenModelUtils.getEClassifierForInternalModel(type)
		}
	}

	def static EClassifier getListType(List list) {
		val defOrDecl = list.getDefOrDecl()
		if (defOrDecl instanceof ListDefinition) {
			if (defOrDecl instanceof ListAdHoc) {
				val elements = defOrDecl.getElements()
				if (elements.isEmpty()) {
					return EcorePackage.Literals.EOBJECT
				}

				var listTypeClass = TypeCalculator.evaluate(elements.get(0)) as EClass
				for (var i = 1; i < elements.size(); i++) {
					val clazz = TypeCalculator.evaluate(elements.get(i));
					if (clazz instanceof EClass) {
						if (clazz != listTypeClass) {
							if (clazz.isSuperTypeOf(listTypeClass)) {
								listTypeClass = clazz;
							} else {
								if (!listTypeClass.isSuperTypeOf(clazz)) {
									return EcorePackage.Literals.EOBJECT;
								}
							}
						}
					} else {
						throw new UnsupportedOperationException("list of type Pattern should not occur");
					}
				}
				return listTypeClass
			}
		} else {
			// ListDeclaration
			val decl = defOrDecl as ListDeclaration
			var declType = EcorePackage.Literals.EOBJECT as EClassifier
			if (decl !== null) {
				declType = decl.getType() as EClassifier;
			}
			return declType
		}
	}

	def static EClassifier getMapType(Map map, boolean getKeyType) {
		val defOrDecl = map.getDefOrDecl();
		if (defOrDecl instanceof MapDefinition) {
			if (defOrDecl instanceof MapAdHoc) {

				val elements = defOrDecl.entries
				if (elements.isEmpty()) {
					return EcorePackage.Literals.EOBJECT
				}

				var keyTypeClass = evaluate(elements.get(0).key) as EClass
				var valueTypeClass = evaluate(elements.get(0).value) as EClass

				for (var i = 1; i < elements.size(); i++) {
					val keyEval = TypeCalculator.evaluate(elements.get(i).getKey());
					val valueEval = TypeCalculator.evaluate(elements.get(i).getValue());
					if (keyEval instanceof EClass) {
						val clazz = keyEval as EClass;
						if (clazz != keyTypeClass) {
							if (clazz.isSuperTypeOf(keyTypeClass)) {
								keyTypeClass = clazz;
							} else {
								if (!keyTypeClass.isSuperTypeOf(clazz)) {
									if(getKeyType) return EcorePackage.Literals.EOBJECT;
								}
							}
						}
					} else {
						throw new UnsupportedOperationException("keys of type Pattern should not occur");
					}

					if (valueEval instanceof EClass) {
						val clazz = valueEval as EClass
						if (clazz != valueTypeClass) {
							if (clazz.isSuperTypeOf(valueTypeClass)) {
								valueTypeClass = clazz;
							} else {
								if (!valueTypeClass.isSuperTypeOf(clazz)) {
									if(!getKeyType) return EcorePackage.Literals.EOBJECT;
								}
							}
						}
					} else {
						throw new UnsupportedOperationException("map values of type Pattern should not occur");
					}
				}
				return getKeyType ? keyTypeClass : valueTypeClass
			}
		} else {
			// MapDeclaration
			val decl = defOrDecl as MapDeclaration;
			val keyType = decl.getKeyType();
			val entryType = decl.getEntryType();
			return getKeyType ? keyType : entryType
		}
	}

	def static dispatch private EObject internalEvaluate(Node node) {
		return node.type
	}

	def static dispatch private EObject internalEvaluate(Variable variable) {
		return TypeCalculator.getVarType(variable)
	}

	def static dispatch private EObject internalEvaluate(Tertiary tertiary) throws MismatchingTypesException {
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

	def static dispatch private EObject internalEvaluate(Secondary secondary) throws MismatchingTypesException {
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

	def static dispatch private EObject internalEvaluate(Primary primary) throws MismatchingTypesException {
		val evalLeft = evaluate(primary.left) as EClass
		val evalRight = evaluate(primary.right) as EClass

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
				case AND: return TypeModelPackage.Literals.BOOLEAN
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

	def static dispatch private EObject internalEvaluate(Rel rel) throws MismatchingTypesException {
		val evalLeft = evaluate(rel.left) as EClass
		val evalRight = evaluate(rel.right) as EClass

		if (evalLeft === TypeModelPackage.Literals.STRING && evalRight === TypeModelPackage.Literals.STRING) {
			// -------------------- Strings -----------------------	
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case LESS: throw new MismatchingTypesException("Can compare Strings only for (in)equality.")
				case EQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
			}
		} else if (evalLeft === TypeModelPackage.Literals.NULL_OBJECT ||
			evalRight === TypeModelPackage.Literals.NULL_OBJECT) {
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case LESS: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case EQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
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
				case EQUAL_IDENTITY:
					throw new MismatchingTypesException("Can only compare objects for (in)identity")
				case UNEQUAL_IDENTITY:
					throw new MismatchingTypesException("Can only compare objects for (in)identity")
			}
		} else if (TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalLeft) &&
			TypeModelPackage.Literals.NUMBER.isSuperTypeOf(evalRight)) {
			// -------------------- Numerical Values -----------------------	
			return TypeModelPackage.Literals.BOOLEAN
		} else if (evalLeft == evalRight) {
			switch (rel.relation) {
				case GREATER: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case GREATER_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case EQUAL: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL: return TypeModelPackage.Literals.BOOLEAN
				case LESS_OR_EQUAL: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case LESS: throw new MismatchingTypesException("Can compare none only for (in)equality")
				case EQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
				case UNEQUAL_IDENTITY: return TypeModelPackage.Literals.BOOLEAN
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
				"Cannot use operator " + rel.relation.toString + " with given values " + evalLeftString + " and " +
					evalRightString)
		}
	}

	def static dispatch private EObject internalEvaluate(BracketExpression bracketExpr) {
		return evaluate(bracketExpr.expr)
	}

	def static dispatch private EObject internalEvaluate(BooleanLiteral lit) {
		return TypeModelPackage.Literals.BOOLEAN
	}

	def static dispatch private EObject internalEvaluate(NullLiteral lit) {
		return TypeModelPackage.Literals.NULL_OBJECT
	}

	def static dispatch private EObject internalEvaluate(DoubleLiteral lit) {
		return TypeModelPackage.Literals.DOUBLE
	}

	def static dispatch private EObject internalEvaluate(IntegerLiteral lit) {
		return TypeModelPackage.Literals.INTEGER
	}

	def static dispatch private EObject internalEvaluate(StringLiteral lit) {
		return TypeModelPackage.Literals.STRING
	}

	def static dispatch private EObject internalEvaluate(NegationExpression negExpr) throws MismatchingTypesException {
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

	def static dispatch private EObject internalEvaluate(FunctionCall fc) throws MismatchingTypesException {
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
				return TypeCalculator.getVarType(ref)
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
					return MofgenModelUtils.getEClassifierForInternalModel(ref.type as EClassifier)
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
				return MofgenModelUtils.getEClassifierForInternalModel(ref.EType)
			}
			EReference: {
				return MofgenModelUtils.getEClassifierForInternalModel(ref.EType)
			}
			EOperation: {
				val op = ref
				val trg = roc.target
				if (trg !== null && trg.ref !== null && trg.ref instanceof List) {
					if (op == TypeModelPackage.Literals.LIST___GET__INT) {
						return TypeCalculator.getListType(trg.ref as List)
					}
				}
				if (trg !== null && trg.ref !== null && trg.ref instanceof Map) {
					if (op == TypeModelPackage.Literals.MAP___GET__EOBJECT) {
						return TypeCalculator.getMapType(trg.ref as Map, false)
					}
					if (op == TypeModelPackage.Literals.MAP___REMOVE__EOBJECT) {
						return TypeCalculator.getMapType(trg.ref as Map, false)
					}
				}
				return MofgenModelUtils.getEClassifierForInternalModel(op.EType)
			}
			IteratorVariable: {
				val container = ref.eContainer
				switch container {
					RangeForHead: {
						return TypeModelPackage.Literals.INTEGER
					}
					GeneralForEachHead: {
						if (container.eref == TypeModelPackage.Literals.MAP__ENTRIES) {
							return TypeCalculator.getMapType(container.src.ref as Map, false)
						} else if (container.eref == TypeModelPackage.Literals.MAP__KEYS) {
							return TypeCalculator.getMapType(container.src.ref as Map, true)
						} else {
							return container.eref.EType
						}
					}
					ListForEachHead: {
						return TypeCalculator.getListType(container.list)
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

	def static dispatch private internalEvaluate(UnaryMinus uMinus) throws MismatchingTypesException {
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
