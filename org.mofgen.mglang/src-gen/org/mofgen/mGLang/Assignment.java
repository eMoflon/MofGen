/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link org.mofgen.mGLang.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends NodeReferenceOrAssignment
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(NodeAttributeCall)
   * @see org.mofgen.mGLang.MGLangPackage#getAssignment_Target()
   * @model containment="true"
   * @generated
   */
  NodeAttributeCall getTarget();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.Assignment#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NodeAttributeCall value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LiteralExpression)
   * @see org.mofgen.mGLang.MGLangPackage#getAssignment_Value()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getValue();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.Assignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LiteralExpression value);

} // Assignment
