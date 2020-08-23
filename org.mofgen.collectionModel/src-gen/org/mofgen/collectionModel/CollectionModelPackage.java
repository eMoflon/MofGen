/**
 */
package org.mofgen.collectionModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.mofgen.collectionModel.CollectionModelFactory
 * @model kind="package"
 * @generated
 */
public interface CollectionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collectionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mofgen.org/collectionModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collectionModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectionModelPackage eINSTANCE = org.mofgen.collectionModel.impl.CollectionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mofgen.collectionModel.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mofgen.collectionModel.impl.CollectionImpl
	 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 0;

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
	 * The meta object id for the '{@link org.mofgen.collectionModel.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mofgen.collectionModel.impl.MapImpl
	 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mofgen.collectionModel.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mofgen.collectionModel.impl.ListImpl
	 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getList()
	 * @generated
	 */
	int LIST = 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 8;

	/**
	 * Returns the meta object for class '{@link org.mofgen.collectionModel.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.mofgen.collectionModel.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for class '{@link org.mofgen.collectionModel.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.mofgen.collectionModel.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.mofgen.collectionModel.Map#get(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__Get__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#put(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see org.mofgen.collectionModel.Map#put(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__Put__EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#containsKey(org.eclipse.emf.ecore.EObject) <em>Contains Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Key</em>' operation.
	 * @see org.mofgen.collectionModel.Map#containsKey(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__ContainsKey__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#containsValue(org.eclipse.emf.ecore.EObject) <em>Contains Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Value</em>' operation.
	 * @see org.mofgen.collectionModel.Map#containsValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMap__ContainsValue__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.mofgen.collectionModel.Map#isEmpty()
	 * @generated
	 */
	EOperation getMap__IsEmpty();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.Map#size() <em>Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size</em>' operation.
	 * @see org.mofgen.collectionModel.Map#size()
	 * @generated
	 */
	EOperation getMap__Size();

	/**
	 * Returns the meta object for class '{@link org.mofgen.collectionModel.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.mofgen.collectionModel.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#get(int) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see org.mofgen.collectionModel.List#get(int)
	 * @generated
	 */
	EOperation getList__Get__int();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#add(org.eclipse.emf.ecore.EObject) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.mofgen.collectionModel.List#add(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Add__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#contains(org.eclipse.emf.ecore.EObject) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.mofgen.collectionModel.List#contains(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Contains__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#indexOf(org.eclipse.emf.ecore.EObject) <em>Index Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Index Of</em>' operation.
	 * @see org.mofgen.collectionModel.List#indexOf(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__IndexOf__EObject();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see org.mofgen.collectionModel.List#isEmpty()
	 * @generated
	 */
	EOperation getList__IsEmpty();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#removeAt(int) <em>Remove At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove At</em>' operation.
	 * @see org.mofgen.collectionModel.List#removeAt(int)
	 * @generated
	 */
	EOperation getList__RemoveAt__int();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#size() <em>Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size</em>' operation.
	 * @see org.mofgen.collectionModel.List#size()
	 * @generated
	 */
	EOperation getList__Size();

	/**
	 * Returns the meta object for the '{@link org.mofgen.collectionModel.List#remove(org.eclipse.emf.ecore.EObject) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.mofgen.collectionModel.List#remove(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getList__Remove__EObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectionModelFactory getCollectionModelFactory();

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
		 * The meta object literal for the '{@link org.mofgen.collectionModel.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mofgen.collectionModel.impl.CollectionImpl
		 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '{@link org.mofgen.collectionModel.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mofgen.collectionModel.impl.MapImpl
		 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

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
		 * The meta object literal for the '{@link org.mofgen.collectionModel.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mofgen.collectionModel.impl.ListImpl
		 * @see org.mofgen.collectionModel.impl.CollectionModelPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

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

	}

} //CollectionModelPackage
