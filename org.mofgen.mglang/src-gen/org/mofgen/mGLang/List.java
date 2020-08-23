/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.List#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getList()
 * @model
 * @generated
 */
public interface List extends Collection
{
  /**
   * Returns the value of the '<em><b>Created By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created By</em>' containment reference.
   * @see #setCreatedBy(ListAssignment)
   * @see org.mofgen.mGLang.MGLangPackage#getList_CreatedBy()
   * @model containment="true"
   * @generated
   */
  ListAssignment getCreatedBy();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.List#getCreatedBy <em>Created By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' containment reference.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(ListAssignment value);

} // List
