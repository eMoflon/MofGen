/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.MethodCall#getCalledNode <em>Called Node</em>}</li>
 *   <li>{@link org.mofgen.mGLang.MethodCall#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends ParameterRefOrMethodCall
{
  /**
   * Returns the value of the '<em><b>Called Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called Node</em>' reference.
   * @see #setCalledNode(Node)
   * @see org.mofgen.mGLang.MGLangPackage#getMethodCall_CalledNode()
   * @model
   * @generated
   */
  Node getCalledNode();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.MethodCall#getCalledNode <em>Called Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called Node</em>' reference.
   * @see #getCalledNode()
   * @generated
   */
  void setCalledNode(Node value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(EOperation)
   * @see org.mofgen.mGLang.MGLangPackage#getMethodCall_Method()
   * @model
   * @generated
   */
  EOperation getMethod();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.MethodCall#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(EOperation value);

} // MethodCall