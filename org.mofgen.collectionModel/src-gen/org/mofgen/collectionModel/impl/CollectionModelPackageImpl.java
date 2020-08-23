/**
 */
package org.mofgen.collectionModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mofgen.collectionModel.Collection;
import org.mofgen.collectionModel.CollectionModelFactory;
import org.mofgen.collectionModel.CollectionModelPackage;
import org.mofgen.collectionModel.List;
import org.mofgen.collectionModel.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionModelPackageImpl extends EPackageImpl implements CollectionModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mofgen.collectionModel.CollectionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectionModelPackageImpl() {
		super(eNS_URI, CollectionModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CollectionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectionModelPackage init() {
		if (isInited)
			return (CollectionModelPackage) EPackage.Registry.INSTANCE.getEPackage(CollectionModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCollectionModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CollectionModelPackageImpl theCollectionModelPackage = registeredCollectionModelPackage instanceof CollectionModelPackageImpl
				? (CollectionModelPackageImpl) registeredCollectionModelPackage
				: new CollectionModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCollectionModelPackage.createPackageContents();

		// Initialize created meta-data
		theCollectionModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectionModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectionModelPackage.eNS_URI, theCollectionModelPackage);
		return theCollectionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__Get__EObject() {
		return mapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__Put__EObject_EObject() {
		return mapEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__ContainsKey__EObject() {
		return mapEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__ContainsValue__EObject() {
		return mapEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__IsEmpty() {
		return mapEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__Size() {
		return mapEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__Get__int() {
		return listEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__Add__EObject() {
		return listEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__Contains__EObject() {
		return listEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__IndexOf__EObject() {
		return listEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__IsEmpty() {
		return listEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__RemoveAt__int() {
		return listEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__Size() {
		return listEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getList__Remove__EObject() {
		return listEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionModelFactory getCollectionModelFactory() {
		return (CollectionModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		collectionEClass = createEClass(COLLECTION);

		mapEClass = createEClass(MAP);
		createEOperation(mapEClass, MAP___GET__EOBJECT);
		createEOperation(mapEClass, MAP___PUT__EOBJECT_EOBJECT);
		createEOperation(mapEClass, MAP___CONTAINS_KEY__EOBJECT);
		createEOperation(mapEClass, MAP___CONTAINS_VALUE__EOBJECT);
		createEOperation(mapEClass, MAP___IS_EMPTY);
		createEOperation(mapEClass, MAP___SIZE);

		listEClass = createEClass(LIST);
		createEOperation(listEClass, LIST___GET__INT);
		createEOperation(listEClass, LIST___ADD__EOBJECT);
		createEOperation(listEClass, LIST___CONTAINS__EOBJECT);
		createEOperation(listEClass, LIST___INDEX_OF__EOBJECT);
		createEOperation(listEClass, LIST___IS_EMPTY);
		createEOperation(listEClass, LIST___REMOVE_AT__INT);
		createEOperation(listEClass, LIST___SIZE);
		createEOperation(listEClass, LIST___REMOVE__EOBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mapEClass.getESuperTypes().add(this.getCollection());
		listEClass.getESuperTypes().add(this.getCollection());

		// Initialize classes, features, and operations; add parameters
		initEClass(collectionEClass, Collection.class, "Collection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getMap__Get__EObject(), ecorePackage.getEObject(), "get", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__Put__EObject_EObject(), ecorePackage.getEBoolean(), "put", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__ContainsKey__EObject(), ecorePackage.getEBoolean(), "containsKey", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__ContainsValue__EObject(), ecorePackage.getEBoolean(), "containsValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMap__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMap__Size(), ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getList__Get__int(), ecorePackage.getEObject(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Add__EObject(), ecorePackage.getEBoolean(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Contains__EObject(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__IndexOf__EObject(), ecorePackage.getEInt(), "indexOf", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getList__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__RemoveAt__int(), ecorePackage.getEObject(), "removeAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getList__Size(), ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Remove__EObject(), ecorePackage.getEBoolean(), "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CollectionModelPackageImpl
