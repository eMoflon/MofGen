/**
 */
package org.moflon.mofgen.typeModel;

import java.lang.String;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.mofgen.typeModel.TypeModelFactory
 * @model kind="package"
 * @generated
 */
public interface TypeModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typeModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/typeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeModelPackage eINSTANCE = org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.PrimitiveImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 3;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.NumberImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.BooleanImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 1;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.StringImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getString()
	 * @generated
	 */
	int STRING = 2;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.EnumImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 4;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.CollectionImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 7;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.MapImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 5;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__KEYS = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ENTRIES = COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___GET__EOBJECT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___PUT__EOBJECT_EOBJECT = COLLECTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___CONTAINS_KEY__EOBJECT = COLLECTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___CONTAINS_VALUE__EOBJECT = COLLECTION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___IS_EMPTY = COLLECTION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___SIZE = COLLECTION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___REMOVE__EOBJECT = COLLECTION_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.ListImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENTS = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET__INT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ADD__EOBJECT = COLLECTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CONTAINS__EOBJECT = COLLECTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Index Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___INDEX_OF__EOBJECT = COLLECTION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___IS_EMPTY = COLLECTION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___REMOVE_AT__INT = COLLECTION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___SIZE = COLLECTION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___REMOVE__EOBJECT = COLLECTION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ADD_ALL__LIST = COLLECTION_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.EnumLiteralImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 8;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.DoubleImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 9;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.IntegerImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 10;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.mofgen.typeModel.impl.NullObjectImpl <em>Null Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.mofgen.typeModel.impl.NullObjectImpl
	 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getNullObject()
	 * @generated
	 */
	int NULL_OBJECT = 11;

	/**
	 * The number of structural features of the '<em>Null Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Null Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see org.moflon.mofgen.typeModel.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.moflon.mofgen.typeModel.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.moflon.mofgen.typeModel.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see org.moflon.mofgen.typeModel.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.moflon.mofgen.typeModel.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.moflon.mofgen.typeModel.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.mofgen.typeModel.Map#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keys</em>'.
	 * @see org.moflon.mofgen.typeModel.Map#getKeys()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Keys();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.mofgen.typeModel.Map#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entries</em>'.
	 * @see org.moflon.mofgen.typeModel.Map#getEntries()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Entries();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#get(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__Get__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#put(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#put(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__Put__EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#containsKey(org.eclipse.emf.ecore.EObject) <em>Contains Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Key</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#containsKey(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__ContainsKey__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#containsValue(org.eclipse.emf.ecore.EObject) <em>Contains Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Value</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#containsValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__ContainsValue__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#isEmpty()
	 * @generated
	 */
	EOperation getMap__IsEmpty();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#size() <em>Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#size()
	 * @generated
	 */
	EOperation getMap__Size();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.Map#remove(org.eclipse.emf.ecore.EObject) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.moflon.mofgen.typeModel.Map#remove(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__Remove__EObject();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.moflon.mofgen.typeModel.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.mofgen.typeModel.List#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.moflon.mofgen.typeModel.List#getElements()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Elements();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#get(int) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#get(int)
	 * @generated
	 */
	EOperation getList__Get__int();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#add(org.eclipse.emf.ecore.EObject) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#add(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Add__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#contains(org.eclipse.emf.ecore.EObject) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#contains(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Contains__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#indexOf(org.eclipse.emf.ecore.EObject) <em>Index Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Index Of</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#indexOf(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__IndexOf__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#isEmpty()
	 * @generated
	 */
	EOperation getList__IsEmpty();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#removeAt(int) <em>Remove At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove At</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#removeAt(int)
	 * @generated
	 */
	EOperation getList__RemoveAt__int();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#size() <em>Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#size()
	 * @generated
	 */
	EOperation getList__Size();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#remove(org.eclipse.emf.ecore.EObject) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#remove(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Remove__EObject();

	/**
	 * Returns the meta object for the '{@link org.moflon.mofgen.typeModel.List#addAll(org.moflon.mofgen.typeModel.List) <em>Add All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All</em>' operation.
	 * @see org.moflon.mofgen.typeModel.List#addAll(org.moflon.mofgen.typeModel.List)
	 * @generated
	 */
	EOperation getList__AddAll__List();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.moflon.mofgen.typeModel.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see org.moflon.mofgen.typeModel.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see org.moflon.mofgen.typeModel.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.moflon.mofgen.typeModel.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link org.moflon.mofgen.typeModel.NullObject <em>Null Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Object</em>'.
	 * @see org.moflon.mofgen.typeModel.NullObject
	 * @generated
	 */
	EClass getNullObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeModelFactory getTypeModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.NumberImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.BooleanImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.StringImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.PrimitiveImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.EnumImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.MapImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__KEYS = eINSTANCE.getMap_Keys();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ENTRIES = eINSTANCE.getMap_Entries();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___GET__EOBJECT = eINSTANCE.getMap__Get__EObject();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___PUT__EOBJECT_EOBJECT = eINSTANCE.getMap__Put__EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Contains Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___CONTAINS_KEY__EOBJECT = eINSTANCE.getMap__ContainsKey__EObject();

		/**
		 * The meta object literal for the '<em><b>Contains Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___CONTAINS_VALUE__EOBJECT = eINSTANCE.getMap__ContainsValue__EObject();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___IS_EMPTY = eINSTANCE.getMap__IsEmpty();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___SIZE = eINSTANCE.getMap__Size();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___REMOVE__EOBJECT = eINSTANCE.getMap__Remove__EObject();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.ListImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ELEMENTS = eINSTANCE.getList_Elements();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___GET__INT = eINSTANCE.getList__Get__int();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___ADD__EOBJECT = eINSTANCE.getList__Add__EObject();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___CONTAINS__EOBJECT = eINSTANCE.getList__Contains__EObject();

		/**
		 * The meta object literal for the '<em><b>Index Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___INDEX_OF__EOBJECT = eINSTANCE.getList__IndexOf__EObject();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___IS_EMPTY = eINSTANCE.getList__IsEmpty();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___REMOVE_AT__INT = eINSTANCE.getList__RemoveAt__int();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___SIZE = eINSTANCE.getList__Size();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___REMOVE__EOBJECT = eINSTANCE.getList__Remove__EObject();

		/**
		 * The meta object literal for the '<em><b>Add All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___ADD_ALL__LIST = eINSTANCE.getList__AddAll__List();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.CollectionImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.EnumLiteralImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.DoubleImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.IntegerImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link org.moflon.mofgen.typeModel.impl.NullObjectImpl <em>Null Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.mofgen.typeModel.impl.NullObjectImpl
		 * @see org.moflon.mofgen.typeModel.impl.TypeModelPackageImpl#getNullObject()
		 * @generated
		 */
		EClass NULL_OBJECT = eINSTANCE.getNullObject();

	}

} //TypeModelPackage
