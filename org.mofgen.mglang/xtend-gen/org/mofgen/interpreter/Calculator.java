package org.mofgen.interpreter;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.mofgen.interpreter.CalculatorException;
import org.mofgen.interpreter.MismatchingTypesException;
import org.mofgen.mGLang.ArithmeticExpression;
import org.mofgen.mGLang.BooleanLiteral;
import org.mofgen.mGLang.FunctionCall;
import org.mofgen.mGLang.MathFunc;
import org.mofgen.mGLang.NegationExpression;
import org.mofgen.mGLang.NumberLiteral;
import org.mofgen.mGLang.PatternCall;
import org.mofgen.mGLang.Primary;
import org.mofgen.mGLang.PrimaryOp;
import org.mofgen.mGLang.PrimitiveParameter;
import org.mofgen.mGLang.PrimitiveType;
import org.mofgen.mGLang.RefOrCall;
import org.mofgen.mGLang.Rel;
import org.mofgen.mGLang.RelationalOp;
import org.mofgen.mGLang.Secondary;
import org.mofgen.mGLang.SecondaryOp;
import org.mofgen.mGLang.StringLiteral;
import org.mofgen.mGLang.Tertiary;
import org.mofgen.mGLang.TertiaryOp;
import org.mofgen.mGLang.Variable;

@SuppressWarnings("all")
public class Calculator {
  public Object evaluate(final ArithmeticExpression expr) {
    final Object result = this.internalEvaluate(expr);
    Class<?> _class = result.getClass();
    boolean _matched = false;
    if (Objects.equal(_class, Double.class)) {
      _matched=true;
      return ((Double) result);
    }
    if (!_matched) {
      if (Objects.equal(_class, Integer.class)) {
        _matched=true;
        return ((Integer) result);
      }
    }
    if (!_matched) {
      if (Objects.equal(_class, String.class)) {
        _matched=true;
        return ((String) result);
      }
    }
    if (!_matched) {
      if (Objects.equal(_class, Boolean.class)) {
        _matched=true;
        return ((Boolean) result);
      }
    }
    if (!_matched) {
      if (Objects.equal(_class, EOperation.class)) {
        _matched=true;
        return ((EOperation) result);
      }
    }
    return result;
  }
  
  private Object _internalEvaluate(final Tertiary tertiary) {
    try {
      double _xblockexpression = (double) 0;
      {
        final Object evalLeft = this.evaluate(tertiary.getLeft());
        final Object evalRight = this.evaluate(tertiary.getRight());
        double _xifexpression = (double) 0;
        if (((evalLeft instanceof String) && (evalRight instanceof String))) {
          final String castLeft = ((String) evalLeft);
          final String castRight = ((String) evalRight);
          TertiaryOp _op = tertiary.getOp();
          if (_op != null) {
            switch (_op) {
              case PLUS:
                return (castLeft + castRight);
              case MINUS:
                throw new MismatchingTypesException("Cannot subtract Strings");
              case OR:
                throw new MismatchingTypesException("Cannot use logical OR on Strings");
              default:
                break;
            }
          }
        } else {
          double _xifexpression_1 = (double) 0;
          if (((evalLeft instanceof String) && (evalRight instanceof Number))) {
            final String castLeft_1 = ((String) evalLeft);
            final Number castRight_1 = ((Number) evalRight);
            TertiaryOp _op_1 = tertiary.getOp();
            if (_op_1 != null) {
              switch (_op_1) {
                case PLUS:
                  String _string = castRight_1.toString();
                  return (castLeft_1 + _string);
                case MINUS:
                  throw new MismatchingTypesException("Cannot subtract from Strings");
                case OR:
                  throw new MismatchingTypesException("Cannot use logical OR on Strings");
                default:
                  break;
              }
            }
          } else {
            double _xifexpression_2 = (double) 0;
            if (((evalLeft instanceof Number) && (evalRight instanceof String))) {
              final Number castLeft_2 = ((Number) evalLeft);
              final String castRight_2 = ((String) evalRight);
              TertiaryOp _op_2 = tertiary.getOp();
              if (_op_2 != null) {
                switch (_op_2) {
                  case PLUS:
                    String _string_1 = castLeft_2.toString();
                    return (_string_1 + castRight_2);
                  case MINUS:
                    throw new MismatchingTypesException("Cannot subtract Strings");
                  case OR:
                    throw new MismatchingTypesException("Cannot use logical OR on Strings");
                  default:
                    break;
                }
              }
            } else {
              double _xifexpression_3 = (double) 0;
              if (((evalLeft instanceof Boolean) && (evalRight instanceof Boolean))) {
                final Boolean castLeft_3 = ((Boolean) evalLeft);
                final Boolean castRight_3 = ((Boolean) evalRight);
                TertiaryOp _op_3 = tertiary.getOp();
                if (_op_3 != null) {
                  switch (_op_3) {
                    case PLUS:
                      throw new MismatchingTypesException("Cannot add boolean values");
                    case MINUS:
                      throw new MismatchingTypesException("Cannot subtract boolean values");
                    case OR:
                      return Boolean.valueOf(((castLeft_3).booleanValue() || (castRight_3).booleanValue()));
                    default:
                      break;
                  }
                }
              } else {
                double _xifexpression_4 = (double) 0;
                if (((evalLeft instanceof Double) && (evalRight instanceof Double))) {
                  double _xblockexpression_1 = (double) 0;
                  {
                    final Double castLeft_4 = ((Double) evalLeft);
                    final Double castRight_4 = ((Double) evalRight);
                    double _switchResult_4 = (double) 0;
                    TertiaryOp _op_4 = tertiary.getOp();
                    if (_op_4 != null) {
                      switch (_op_4) {
                        case PLUS:
                          _switchResult_4 = DoubleExtensions.operator_plus(castLeft_4, castRight_4);
                          break;
                        case MINUS:
                          _switchResult_4 = DoubleExtensions.operator_minus(castLeft_4, castRight_4);
                          break;
                        case OR:
                          throw new MismatchingTypesException("Cannot use logical OR on numerical values");
                        default:
                          break;
                      }
                    }
                    _xblockexpression_1 = _switchResult_4;
                  }
                  _xifexpression_4 = _xblockexpression_1;
                } else {
                  throw new MismatchingTypesException("Invalid Expression.");
                }
                _xifexpression_3 = _xifexpression_4;
              }
              _xifexpression_2 = _xifexpression_3;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return Double.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final Secondary secondary) {
    try {
      final Object evalLeft = this.evaluate(secondary.getLeft());
      final Object evalRight = this.evaluate(secondary.getRight());
      if (((evalLeft instanceof String) && (evalRight instanceof String))) {
        SecondaryOp _op = secondary.getOp();
        if (_op != null) {
          switch (_op) {
            case MOD:
              throw new MismatchingTypesException("Cannot use modulo on Strings");
            case XOR:
              throw new MismatchingTypesException("Cannot use logical XOR on Strings");
            default:
              break;
          }
        }
      } else {
        if (((evalLeft instanceof Boolean) && (evalRight instanceof Boolean))) {
          final Boolean castLeft = ((Boolean) evalLeft);
          final Boolean castRight = ((Boolean) evalRight);
          SecondaryOp _op_1 = secondary.getOp();
          if (_op_1 != null) {
            switch (_op_1) {
              case MOD:
                throw new MismatchingTypesException("Cannot use modulo on boolean values");
              case XOR:
                boolean _equals = Objects.equal(castLeft, castRight);
                return Boolean.valueOf((!_equals));
              default:
                break;
            }
          }
        } else {
          if (((evalLeft instanceof Double) && (evalRight instanceof Double))) {
            final Integer castLeft_1 = ((Integer) evalLeft);
            final Integer castRight_1 = ((Integer) evalRight);
            SecondaryOp _op_2 = secondary.getOp();
            if (_op_2 != null) {
              switch (_op_2) {
                case MOD:
                  return Integer.valueOf(((castLeft_1).intValue() % (castRight_1).intValue()));
                case XOR:
                  throw new MismatchingTypesException("Cannot use modulo on numerical values");
                default:
                  break;
              }
            }
          } else {
            throw new MismatchingTypesException("Invalid Expression.");
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final Primary primary) {
    try {
      final Object evalLeft = this.evaluate(primary.getLeft());
      final Object evalRight = this.evaluate(primary.getRight());
      if (((evalLeft instanceof String) && (evalRight instanceof String))) {
        PrimaryOp _op = primary.getOp();
        if (_op != null) {
          switch (_op) {
            case MUL:
              throw new MismatchingTypesException("Cannot multiply Strings");
            case DIV:
              throw new MismatchingTypesException("Cannot divide Strings");
            case AND:
              throw new MismatchingTypesException("Cannot use logical AND on Strings");
            default:
              break;
          }
        }
      } else {
        if (((evalLeft instanceof Boolean) && (evalRight instanceof Boolean))) {
          final Boolean castLeft = ((Boolean) evalLeft);
          final Boolean castRight = ((Boolean) evalRight);
          PrimaryOp _op_1 = primary.getOp();
          if (_op_1 != null) {
            switch (_op_1) {
              case MUL:
                throw new MismatchingTypesException("Cannot multiply boolean values");
              case DIV:
                throw new MismatchingTypesException("Cannot divide boolean values");
              case AND:
                return Boolean.valueOf(((castLeft).booleanValue() && (castRight).booleanValue()));
              default:
                break;
            }
          }
        } else {
          if (((evalLeft instanceof Double) && (evalRight instanceof Double))) {
            final Double castLeft_1 = ((Double) evalLeft);
            final Double castRight_1 = ((Double) evalRight);
            PrimaryOp _op_2 = primary.getOp();
            if (_op_2 != null) {
              switch (_op_2) {
                case MUL:
                  double _multiply = DoubleExtensions.operator_multiply(castLeft_1, castRight_1);
                  return ((Double) Double.valueOf(_multiply));
                case DIV:
                  double _divide = DoubleExtensions.operator_divide(castLeft_1, castRight_1);
                  return ((Double) Double.valueOf(_divide));
                case AND:
                  throw new MismatchingTypesException("Cannot use logical AND on numerical values");
                default:
                  break;
              }
            }
          } else {
            throw new MismatchingTypesException("Invalid Expression.");
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final Rel rel) {
    try {
      final Object evalLeft = this.evaluate(rel.getLeft());
      final Object evalRight = this.evaluate(rel.getRight());
      Class<?> _class = evalLeft.getClass();
      Class<?> _class_1 = evalRight.getClass();
      boolean _tripleNotEquals = (_class != _class_1);
      if (_tripleNotEquals) {
        throw new MismatchingTypesException("Cannot compare objects of different types for equality");
      }
      if (((evalLeft instanceof String) && (evalRight instanceof String))) {
        final String castLeft = ((String) evalLeft);
        final String castRight = ((String) evalRight);
        RelationalOp _relation = rel.getRelation();
        if (_relation != null) {
          switch (_relation) {
            case GREATER:
              throw new MismatchingTypesException("Can only compare Strings for (un)equality.");
            case GREATER_OR_EQUAL:
              throw new MismatchingTypesException("Can only compare Strings for (un)equality.");
            case EQUAL:
              return Boolean.valueOf(castLeft.equals(castRight));
            case UNEQUAL:
              boolean _equals = castLeft.equals(castRight);
              return Boolean.valueOf((!_equals));
            case LESS_OR_EQUAL:
              throw new MismatchingTypesException("Can only compare Strings for (un)equality.");
            case LESS:
              throw new MismatchingTypesException("Can only compare Strings for (un)equality.");
            default:
              break;
          }
        }
      } else {
        if (((evalLeft instanceof Boolean) && (evalRight instanceof Boolean))) {
          final Boolean castLeft_1 = ((Boolean) evalLeft);
          final Boolean castRight_1 = ((Boolean) evalRight);
          RelationalOp _relation_1 = rel.getRelation();
          if (_relation_1 != null) {
            switch (_relation_1) {
              case GREATER:
                throw new MismatchingTypesException("Can only compare boolean values for (un)equality.");
              case GREATER_OR_EQUAL:
                throw new MismatchingTypesException("Can only compare boolean values for (un)equality.");
              case EQUAL:
                return Boolean.valueOf(Objects.equal(castLeft_1, castRight_1));
              case UNEQUAL:
                return Boolean.valueOf((!Objects.equal(castLeft_1, castRight_1)));
              case LESS_OR_EQUAL:
                throw new MismatchingTypesException("Can only compare boolean values for (un)equality.");
              case LESS:
                throw new MismatchingTypesException("Can only compare boolean values for (un)equality.");
              default:
                break;
            }
          }
        } else {
          if (((evalLeft instanceof Double) && (evalRight instanceof Double))) {
            final Double castLeft_2 = ((Double) evalLeft);
            final Double castRight_2 = ((Double) evalRight);
            RelationalOp _relation_2 = rel.getRelation();
            if (_relation_2 != null) {
              switch (_relation_2) {
                case GREATER:
                  return Boolean.valueOf((castLeft_2.compareTo(castRight_2) > 0));
                case GREATER_OR_EQUAL:
                  return Boolean.valueOf((castLeft_2.compareTo(castRight_2) >= 0));
                case EQUAL:
                  return Boolean.valueOf(Objects.equal(castLeft_2, castRight_2));
                case UNEQUAL:
                  return Boolean.valueOf((!Objects.equal(castLeft_2, castRight_2)));
                case LESS_OR_EQUAL:
                  return Boolean.valueOf((castLeft_2.compareTo(castRight_2) <= 0));
                case LESS:
                  return Boolean.valueOf((castLeft_2.compareTo(castRight_2) < 0));
                default:
                  break;
              }
            }
          } else {
            throw new MismatchingTypesException("Invalid Expression.");
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final BooleanLiteral lit) {
    return Boolean.valueOf(lit.isVal());
  }
  
  private Object _internalEvaluate(final NumberLiteral lit) {
    return Double.valueOf(lit.getVal());
  }
  
  private Object _internalEvaluate(final StringLiteral lit) {
    return lit.getVal();
  }
  
  private Object _internalEvaluate(final NegationExpression negExpr) {
    try {
      final ArithmeticExpression toNeg = negExpr.getExpr();
      final Object eval = this.evaluate(toNeg);
      if ((eval instanceof String)) {
        throw new MismatchingTypesException("Cannot negate String");
      }
      if ((eval instanceof Number)) {
        throw new MismatchingTypesException("Cannot negate numerical value");
      }
      if ((eval instanceof Boolean)) {
        return Boolean.valueOf((!((Boolean) eval).booleanValue()));
      }
      throw new CalculatorException("Unhandled type in negating expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final FunctionCall fc) {
    try {
      final MathFunc func = fc.getFunc();
      final Object eval = this.evaluate(fc.getExpr());
      if (func != null) {
        switch (func) {
          case SQRT:
            if ((eval instanceof String)) {
              throw new MismatchingTypesException("Cannot take root of String");
            }
            if ((eval instanceof Double)) {
              return Double.valueOf(Math.sqrt(((Double) eval).doubleValue()));
            }
            if ((eval instanceof Integer)) {
              double _floor = Math.floor(Math.sqrt(((Integer) eval).intValue()));
              return Integer.valueOf(((int) _floor));
            }
            if ((eval instanceof Boolean)) {
              throw new MismatchingTypesException("Cannot take root of boolean value");
            }
            break;
          case ABS:
            if ((eval instanceof String)) {
              throw new MismatchingTypesException("Cannot take absolute value of String");
            }
            if ((eval instanceof Double)) {
              double _abs = Math.abs(((Double) eval).doubleValue());
              return Double.valueOf(((double) _abs));
            }
            if ((eval instanceof Integer)) {
              return Integer.valueOf(Math.abs(((Integer) eval).intValue()));
            }
            if ((eval instanceof Boolean)) {
              throw new MismatchingTypesException("Cannot take absolute value of boolean value");
            }
            break;
          default:
            break;
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _internalEvaluate(final RefOrCall roc) {
    EObject _ref = roc.getRef();
    if ((_ref instanceof Variable)) {
      EObject _ref_1 = roc.getRef();
      return this.internalEvaluate(((Variable) _ref_1).getValue());
    }
    EObject _ref_2 = roc.getRef();
    if ((_ref_2 instanceof PrimitiveParameter)) {
      EObject _ref_3 = roc.getRef();
      final PrimitiveParameter primPram = ((PrimitiveParameter) _ref_3);
      PrimitiveType _type = primPram.getType();
      if (_type != null) {
        switch (_type) {
          case DOUBLE:
          case INT:
            return Integer.valueOf(0);
          case STRING:
          case CHAR:
            return "";
          case BOOLEAN:
            return Boolean.valueOf(false);
          default:
            break;
        }
      }
    }
    return roc.getRef();
  }
  
  private Object _internalEvaluate(final PatternCall pc) {
    return pc;
  }
  
  private Object internalEvaluate(final ArithmeticExpression lit) {
    if (lit instanceof BooleanLiteral) {
      return _internalEvaluate((BooleanLiteral)lit);
    } else if (lit instanceof NumberLiteral) {
      return _internalEvaluate((NumberLiteral)lit);
    } else if (lit instanceof StringLiteral) {
      return _internalEvaluate((StringLiteral)lit);
    } else if (lit instanceof FunctionCall) {
      return _internalEvaluate((FunctionCall)lit);
    } else if (lit instanceof NegationExpression) {
      return _internalEvaluate((NegationExpression)lit);
    } else if (lit instanceof PatternCall) {
      return _internalEvaluate((PatternCall)lit);
    } else if (lit instanceof Primary) {
      return _internalEvaluate((Primary)lit);
    } else if (lit instanceof RefOrCall) {
      return _internalEvaluate((RefOrCall)lit);
    } else if (lit instanceof Rel) {
      return _internalEvaluate((Rel)lit);
    } else if (lit instanceof Secondary) {
      return _internalEvaluate((Secondary)lit);
    } else if (lit instanceof Tertiary) {
      return _internalEvaluate((Tertiary)lit);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(lit).toString());
    }
  }
}
