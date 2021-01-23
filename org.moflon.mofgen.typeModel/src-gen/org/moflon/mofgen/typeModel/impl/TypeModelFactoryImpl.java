/**
 */
package org.moflon.mofgen.typeModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.mofgen.typeModel.EnumLiteral;
import org.moflon.mofgen.typeModel.List;
import org.moflon.mofgen.typeModel.Map;
import org.moflon.mofgen.typeModel.NullObject;
import org.moflon.mofgen.typeModel.TypeModelFactory;
import org.moflon.mofgen.typeModel.TypeModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeModelFactoryImpl extends EFactoryImpl implements TypeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeModelFactory init() {
		try {
			TypeModelFactory theTypeModelFactory = (TypeModelFactory) EPackage.Registry.INSTANCE.getEFactory(TypeModelPackage.eNS_URI);
			if (theTypeModelFactory != null) {
				return theTypeModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TypeModelPackage.BOOLEAN:
			return createBoolean();
		case TypeModelPackage.STRING:
			return createString();
		case TypeModelPackage.ENUM:
			return createEnum();
		case TypeModelPackage.MAP:
			return createMap();
		case TypeModelPackage.LIST:
			return createList();
		case TypeModelPackage.ENUM_LITERAL:
			return createEnumLiteral();
		case TypeModelPackage.DOUBLE:
			return createDouble();
		case TypeModelPackage.INTEGER:
			return createInteger();
		case TypeModelPackage.NULL_OBJECT:
			return createNullObject();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.moflon.mofgen.typeModel.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.moflon.mofgen.typeModel.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.moflon.mofgen.typeModel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.moflon.mofgen.typeModel.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.moflon.mofgen.typeModel.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullObject createNullObject() {
		NullObjectImpl nullObject = new NullObjectImpl();
		return nullObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModelPackage getTypeModelPackage() {
		return (TypeModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypeModelPackage getPackage() {
		return TypeModelPackage.eINSTANCE;
	}

} //TypeModelFactoryImpl
