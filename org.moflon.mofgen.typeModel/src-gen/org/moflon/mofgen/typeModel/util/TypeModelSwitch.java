/**
 */
package org.moflon.mofgen.typeModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.mofgen.typeModel.Collection;
import org.moflon.mofgen.typeModel.EnumLiteral;
import org.moflon.mofgen.typeModel.List;
import org.moflon.mofgen.typeModel.Map;
import org.moflon.mofgen.typeModel.NullObject;
import org.moflon.mofgen.typeModel.Primitive;
import org.moflon.mofgen.typeModel.TypeModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.mofgen.typeModel.TypeModelPackage
 * @generated
 */
public class TypeModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypeModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelSwitch() {
		if (modelPackage == null) {
			modelPackage = TypeModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TypeModelPackage.NUMBER: {
			org.moflon.mofgen.typeModel.Number number = (org.moflon.mofgen.typeModel.Number) theEObject;
			T result = caseNumber(number);
			if (result == null)
				result = casePrimitive(number);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.BOOLEAN: {
			org.moflon.mofgen.typeModel.Boolean boolean_ = (org.moflon.mofgen.typeModel.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = casePrimitive(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.STRING: {
			org.moflon.mofgen.typeModel.String string = (org.moflon.mofgen.typeModel.String) theEObject;
			T result = caseString(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.PRIMITIVE: {
			Primitive primitive = (Primitive) theEObject;
			T result = casePrimitive(primitive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.ENUM: {
			org.moflon.mofgen.typeModel.Enum enum_ = (org.moflon.mofgen.typeModel.Enum) theEObject;
			T result = caseEnum(enum_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.MAP: {
			Map map = (Map) theEObject;
			T result = caseMap(map);
			if (result == null)
				result = caseCollection(map);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.LIST: {
			List list = (List) theEObject;
			T result = caseList(list);
			if (result == null)
				result = caseCollection(list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.COLLECTION: {
			Collection collection = (Collection) theEObject;
			T result = caseCollection(collection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.ENUM_LITERAL: {
			EnumLiteral enumLiteral = (EnumLiteral) theEObject;
			T result = caseEnumLiteral(enumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.DOUBLE: {
			org.moflon.mofgen.typeModel.Double double_ = (org.moflon.mofgen.typeModel.Double) theEObject;
			T result = caseDouble(double_);
			if (result == null)
				result = caseNumber(double_);
			if (result == null)
				result = casePrimitive(double_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.INTEGER: {
			org.moflon.mofgen.typeModel.Integer integer = (org.moflon.mofgen.typeModel.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseNumber(integer);
			if (result == null)
				result = casePrimitive(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypeModelPackage.NULL_OBJECT: {
			NullObject nullObject = (NullObject) theEObject;
			T result = caseNullObject(nullObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(org.moflon.mofgen.typeModel.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.moflon.mofgen.typeModel.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.moflon.mofgen.typeModel.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.moflon.mofgen.typeModel.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(org.moflon.mofgen.typeModel.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.moflon.mofgen.typeModel.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullObject(NullObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypeModelSwitch
