/**
 */
package org.moflon.mofgen.typeModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.mofgen.typeModel.Map;
import org.moflon.mofgen.typeModel.TypeModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.moflon.mofgen.typeModel.impl.MapImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.moflon.mofgen.typeModel.impl.MapImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends CollectionImpl implements Map {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EObject keys;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EObject entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeModelPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getKeys() {
		if (keys != null && keys.eIsProxy()) {
			InternalEObject oldKeys = (InternalEObject) keys;
			keys = eResolveProxy(oldKeys);
			if (keys != oldKeys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeModelPackage.MAP__KEYS, oldKeys, keys));
			}
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeys(EObject newKeys) {
		EObject oldKeys = keys;
		keys = newKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeModelPackage.MAP__KEYS, oldKeys, keys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getEntries() {
		if (entries != null && entries.eIsProxy()) {
			InternalEObject oldEntries = (InternalEObject) entries;
			entries = eResolveProxy(oldEntries);
			if (entries != oldEntries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeModelPackage.MAP__ENTRIES, oldEntries, entries));
			}
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEntries() {
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntries(EObject newEntries) {
		EObject oldEntries = entries;
		entries = newEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeModelPackage.MAP__ENTRIES, oldEntries, entries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject get(EObject key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean put(EObject key, EObject value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean containsKey(EObject key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean containsValue(EObject value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmpty() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int size() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject remove(EObject key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TypeModelPackage.MAP__KEYS:
			if (resolve)
				return getKeys();
			return basicGetKeys();
		case TypeModelPackage.MAP__ENTRIES:
			if (resolve)
				return getEntries();
			return basicGetEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TypeModelPackage.MAP__KEYS:
			setKeys((EObject) newValue);
			return;
		case TypeModelPackage.MAP__ENTRIES:
			setEntries((EObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TypeModelPackage.MAP__KEYS:
			setKeys((EObject) null);
			return;
		case TypeModelPackage.MAP__ENTRIES:
			setEntries((EObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TypeModelPackage.MAP__KEYS:
			return keys != null;
		case TypeModelPackage.MAP__ENTRIES:
			return entries != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TypeModelPackage.MAP___GET__EOBJECT:
			return get((EObject) arguments.get(0));
		case TypeModelPackage.MAP___PUT__EOBJECT_EOBJECT:
			return put((EObject) arguments.get(0), (EObject) arguments.get(1));
		case TypeModelPackage.MAP___CONTAINS_KEY__EOBJECT:
			return containsKey((EObject) arguments.get(0));
		case TypeModelPackage.MAP___CONTAINS_VALUE__EOBJECT:
			return containsValue((EObject) arguments.get(0));
		case TypeModelPackage.MAP___IS_EMPTY:
			return isEmpty();
		case TypeModelPackage.MAP___SIZE:
			return size();
		case TypeModelPackage.MAP___REMOVE__EOBJECT:
			return remove((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MapImpl
