/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link org.mofgen.mGLang.Pattern#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.mofgen.mGLang.Pattern#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.mofgen.mGLang.Pattern#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends FileCommand
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.mofgen.mGLang.MGLangPackage#getPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.Pattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.mofgen.mGLang.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.mofgen.mGLang.MGLangPackage#getPattern_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.mofgen.mGLang.PatternCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.mofgen.mGLang.MGLangPackage#getPattern_Commands()
   * @model containment="true"
   * @generated
   */
  EList<PatternCommand> getCommands();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(PatternReturn)
   * @see org.mofgen.mGLang.MGLangPackage#getPattern_Return()
   * @model containment="true"
   * @generated
   */
  PatternReturn getReturn();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.Pattern#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(PatternReturn value);

} // Pattern
