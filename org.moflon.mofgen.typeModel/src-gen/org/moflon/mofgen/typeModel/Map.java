/**
 */
package org.moflon.mofgen.typeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.moflon.mofgen.typeModel.Map#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.moflon.mofgen.typeModel.Map#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.moflon.mofgen.typeModel.TypeModelPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Collection {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference.
	 * @see #setKeys(EObject)
	 * @see org.moflon.mofgen.typeModel.TypeModelPackage#getMap_Keys()
	 * @model
	 * @generated
	 */
	EObject getKeys();

	/**
	 * Sets the value of the '{@link org.moflon.mofgen.typeModel.Map#getKeys <em>Keys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys</em>' reference.
	 * @see #getKeys()
	 * @generated
	 */
	void setKeys(EObject value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference.
	 * @see #setEntries(EObject)
	 * @see org.moflon.mofgen.typeModel.TypeModelPackage#getMap_Entries()
	 * @model
	 * @generated
	 */
	EObject getEntries();

	/**
	 * Sets the value of the '{@link org.moflon.mofgen.typeModel.Map#getEntries <em>Entries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entries</em>' reference.
	 * @see #getEntries()
	 * @generated
	 */
	void setEntries(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject get(EObject key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean put(EObject key, EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean containsKey(EObject key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean containsValue(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int size();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject remove(EObject key);

} // Map
