/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If Or Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.ElseIfOrElse#getCond <em>Cond</em>}</li>
 *   <li>{@link org.mofgen.mGLang.ElseIfOrElse#getThen <em>Then</em>}</li>
 *   <li>{@link org.mofgen.mGLang.ElseIfOrElse#getElseIf <em>Else If</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getElseIfOrElse()
 * @model
 * @generated
 */
public interface ElseIfOrElse extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(ArithmeticExpression)
   * @see org.mofgen.mGLang.MGLangPackage#getElseIfOrElse_Cond()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getCond();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ElseIfOrElse#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(ArithmeticExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference list.
   * The list contents are of type {@link org.mofgen.mGLang.GeneratorExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference list.
   * @see org.mofgen.mGLang.MGLangPackage#getElseIfOrElse_Then()
   * @model containment="true"
   * @generated
   */
  EList<GeneratorExpression> getThen();

  /**
   * Returns the value of the '<em><b>Else If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else If</em>' containment reference.
   * @see #setElseIf(ElseIfOrElse)
   * @see org.mofgen.mGLang.MGLangPackage#getElseIfOrElse_ElseIf()
   * @model containment="true"
   * @generated
   */
  ElseIfOrElse getElseIf();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ElseIfOrElse#getElseIf <em>Else If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else If</em>' containment reference.
   * @see #getElseIf()
   * @generated
   */
  void setElseIf(ElseIfOrElse value);

} // ElseIfOrElse
