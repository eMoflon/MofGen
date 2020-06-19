/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.ForLoop#getIteratorVar <em>Iterator Var</em>}</li>
 *   <li>{@link org.mofgen.mGLang.ForLoop#getIteratingCondition <em>Iterating Condition</em>}</li>
 *   <li>{@link org.mofgen.mGLang.ForLoop#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends GeneratorElement
{
  /**
   * Returns the value of the '<em><b>Iterator Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator Var</em>' attribute.
   * @see #setIteratorVar(String)
   * @see org.mofgen.mGLang.MGLangPackage#getForLoop_IteratorVar()
   * @model
   * @generated
   */
  String getIteratorVar();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ForLoop#getIteratorVar <em>Iterator Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator Var</em>' attribute.
   * @see #getIteratorVar()
   * @generated
   */
  void setIteratorVar(String value);

  /**
   * Returns the value of the '<em><b>Iterating Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterating Condition</em>' containment reference.
   * @see #setIteratingCondition(ForCondition)
   * @see org.mofgen.mGLang.MGLangPackage#getForLoop_IteratingCondition()
   * @model containment="true"
   * @generated
   */
  ForCondition getIteratingCondition();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.ForLoop#getIteratingCondition <em>Iterating Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterating Condition</em>' containment reference.
   * @see #getIteratingCondition()
   * @generated
   */
  void setIteratingCondition(ForCondition value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.mofgen.mGLang.GeneratorCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.mofgen.mGLang.MGLangPackage#getForLoop_Commands()
   * @model containment="true"
   * @generated
   */
  EList<GeneratorCommand> getCommands();

} // ForLoop
