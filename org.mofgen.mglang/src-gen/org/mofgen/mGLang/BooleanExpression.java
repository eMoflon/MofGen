/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.BooleanExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.mofgen.mGLang.BooleanExpression#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.mofgen.mGLang.BooleanExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(ParameterOrMethodCall)
   * @see org.mofgen.mGLang.MGLangPackage#getBooleanExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  ParameterOrMethodCall getLhs();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.BooleanExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(ParameterOrMethodCall value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * The literals are from the enumeration {@link org.mofgen.mGLang.RelationalOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see org.mofgen.mGLang.RelationalOp
   * @see #setRelation(RelationalOp)
   * @see org.mofgen.mGLang.MGLangPackage#getBooleanExpression_Relation()
   * @model
   * @generated
   */
  RelationalOp getRelation();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.BooleanExpression#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see org.mofgen.mGLang.RelationalOp
   * @see #getRelation()
   * @generated
   */
  void setRelation(RelationalOp value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(ParameterOrMethodCall)
   * @see org.mofgen.mGLang.MGLangPackage#getBooleanExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  ParameterOrMethodCall getRhs();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.BooleanExpression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(ParameterOrMethodCall value);

} // BooleanExpression
