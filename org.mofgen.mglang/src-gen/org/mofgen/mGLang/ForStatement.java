/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.ForStatement#getHead <em>Head</em>}</li>
 *   <li>{@link org.mofgen.mGLang.ForStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends GeneratorExpression
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(ForHead)
   * @see org.mofgen.mGLang.MGLangPackage#getForStatement_Head()
   * @model containment="true"
   * @generated
   */
  ForHead getHead();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ForStatement#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(ForHead value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ForBody)
   * @see org.mofgen.mGLang.MGLangPackage#getForStatement_Body()
   * @model containment="true"
   * @generated
   */
  ForBody getBody();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ForStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ForBody value);

} // ForStatement
