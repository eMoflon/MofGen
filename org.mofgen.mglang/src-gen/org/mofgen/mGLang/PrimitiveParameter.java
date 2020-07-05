/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.PrimitiveParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mofgen.mGLang.MGLangPackage#getPrimitiveParameter()
 * @model
 * @generated
 */
public interface PrimitiveParameter extends Parameter
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.mofgen.mGLang.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.mofgen.mGLang.PrimitiveType
   * @see #setType(PrimitiveType)
   * @see org.mofgen.mGLang.MGLangPackage#getPrimitiveParameter_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link org.mofgen.mGLang.PrimitiveParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.mofgen.mGLang.PrimitiveType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

} // PrimitiveParameter