/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.mofgen.interpreter.Calculator;
import org.mofgen.mGLang.ArithmeticExpression;
import org.mofgen.mGLang.GeneralForHead;
import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.Parameter;
import org.mofgen.mGLang.PatternCall;
import org.mofgen.mGLang.PrimitiveParameter;
import org.mofgen.mGLang.PrimitiveType;
import org.mofgen.validation.AbstractMGLangValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MGLangValidator extends AbstractMGLangValidator {
  @Inject
  private Calculator calc;
  
  @Check
  public void validForRange(final GeneralForHead head) {
    final Object start = this.calc.evaluate(head.getRange().getStart());
    final Object end = this.calc.evaluate(head.getRange().getEnd());
    if ((!(start instanceof Number))) {
      this.error(("For-Range needs numerical bounds but was given " + start), MGLangPackage.Literals.FOR_RANGE__START);
    }
    if ((!(end instanceof Number))) {
      this.error(("For-Range needs numerical bounds but was given " + end), MGLangPackage.Literals.FOR_RANGE__END);
    }
    final Double castStart = ((Double) start);
    final Double castEnd = ((Double) end);
    boolean _greaterThan = (castStart.compareTo(castEnd) > 0);
    if (_greaterThan) {
      this.error("Limiting bound is less than starting value", MGLangPackage.Literals.GENERAL_FOR_HEAD__RANGE);
    }
  }
  
  @Check
  public void matchingParameterArguments(final PatternCall pc) {
    int neededParams = 0;
    int actualParams = 0;
    EList<Parameter> _parameters = pc.getCalled().getParameters();
    boolean _tripleNotEquals = (_parameters != null);
    if (_tripleNotEquals) {
      neededParams = ((Object[])Conversions.unwrapArray(pc.getCalled().getParameters(), Object.class)).length;
    }
    EList<ArithmeticExpression> _params = pc.getParams();
    boolean _tripleNotEquals_1 = (_params != null);
    if (_tripleNotEquals_1) {
      actualParams = ((Object[])Conversions.unwrapArray(pc.getParams(), Object.class)).length;
    }
    if ((neededParams != actualParams)) {
      String _name = pc.getCalled().getName();
      String _plus = ("Pattern " + _name);
      String _plus_1 = (_plus + " expects ");
      String _plus_2 = (_plus_1 + Integer.valueOf(neededParams));
      String _plus_3 = (_plus_2 + " parameters but was given ");
      String _plus_4 = (_plus_3 + Integer.valueOf(actualParams));
      this.error(_plus_4, MGLangPackage.Literals.PATTERN_CALL__PARAMS);
    }
  }
  
  @Check
  public void matchingParameterTypes(final PatternCall pc) {
    int _length = ((Object[])Conversions.unwrapArray(pc.getParams(), Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ArithmeticExpression given = pc.getParams().get((i).intValue());
        final Parameter needed = pc.getCalled().getParameters().get((i).intValue());
        boolean _areTypesMatching = this.areTypesMatching(given, needed);
        boolean _equals = (_areTypesMatching == false);
        if (_equals) {
          this.error(((("Given object " + given) + " does not match needed type ") + needed), MGLangPackage.Literals.PATTERN_CALL__PARAMS);
        }
      }
    }
  }
  
  private boolean areTypesMatching(final ArithmeticExpression givenExpression, final Parameter neededObj) {
    final Object eval = this.calc.evaluate(givenExpression);
    if ((eval instanceof EOperation)) {
      final EOperation op = ((EOperation) eval);
      return true;
    }
    if ((neededObj instanceof PrimitiveParameter)) {
      PrimitiveType _type = ((PrimitiveParameter)neededObj).getType();
      if (_type != null) {
        switch (_type) {
          case INT:
            return ((eval instanceof Double) && Objects.equal(Double.valueOf(Math.floor((((Double) eval)).doubleValue())), eval));
          case CHAR:
            return false;
          case DOUBLE:
            return (eval instanceof Double);
          case STRING:
            return (eval instanceof String);
          default:
            break;
        }
      }
    } else {
    }
    return false;
  }
}
