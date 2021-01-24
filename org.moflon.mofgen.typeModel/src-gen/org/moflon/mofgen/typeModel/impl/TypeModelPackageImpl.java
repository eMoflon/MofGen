/**
 */
package org.moflon.mofgen.typeModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.mofgen.typeModel.Collection;
import org.moflon.mofgen.typeModel.EnumLiteral;
import org.moflon.mofgen.typeModel.List;
import org.moflon.mofgen.typeModel.Map;
import org.moflon.mofgen.typeModel.NullObject;
import org.moflon.mofgen.typeModel.Primitive;
import org.moflon.mofgen.typeModel.TypeModelFactory;
import org.moflon.mofgen.typeModel.TypeModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeModelPackageImpl extends EPackageImpl implements TypeModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

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
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullObjectEClass = null;

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
	 * @see org.moflon.mofgen.typeModel.TypeModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypeModelPackageImpl() {
		super(eNS_URI, TypeModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypeModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypeModelPackage init() {
		if (isInited)
			return (TypeModelPackage) EPackage.Registry.INSTANCE.getEPackage(TypeModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypeModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypeModelPackageImpl theTypeModelPackage = registeredTypeModelPackage instanceof TypeModelPackageImpl
				? (TypeModelPackageImpl) registeredTypeModelPackage
				: new TypeModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTypeModelPackage.createPackageContents();

		// Initialize created meta-data
		theTypeModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypeModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypeModelPackage.eNS_URI, theTypeModelPackage);
		return theTypeModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitive() {
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
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
	public EReference getMap_Keys() {
		return (EReference) mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_Entries() {
		return (EReference) mapEClass.getEStructuralFeatures().get(1);
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
	public EOperation getMap__Remove__EObject() {
		return mapEClass.getEOperations().get(6);
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
	public EReference getList_Elements() {
		return (EReference) listEClass.getEStructuralFeatures().get(0);
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
	public EOperation getList__AddAll__List() {
		return listEClass.getEOperations().get(8);
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
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDouble() {
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullObject() {
		return nullObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModelFactory getTypeModelFactory() {
		return (TypeModelFactory) getEFactoryInstance();
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
		numberEClass = createEClass(NUMBER);

		booleanEClass = createEClass(BOOLEAN);

		stringEClass = createEClass(STRING);

		primitiveEClass = createEClass(PRIMITIVE);

		enumEClass = createEClass(ENUM);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__KEYS);
		createEReference(mapEClass, MAP__ENTRIES);
		createEOperation(mapEClass, MAP___GET__EOBJECT);
		createEOperation(mapEClass, MAP___PUT__EOBJECT_EOBJECT);
		createEOperation(mapEClass, MAP___CONTAINS_KEY__EOBJECT);
		createEOperation(mapEClass, MAP___CONTAINS_VALUE__EOBJECT);
		createEOperation(mapEClass, MAP___IS_EMPTY);
		createEOperation(mapEClass, MAP___SIZE);
		createEOperation(mapEClass, MAP___REMOVE__EOBJECT);

		listEClass = createEClass(LIST);
		createEReference(listEClass, LIST__ELEMENTS);
		createEOperation(listEClass, LIST___GET__INT);
		createEOperation(listEClass, LIST___ADD__EOBJECT);
		createEOperation(listEClass, LIST___CONTAINS__EOBJECT);
		createEOperation(listEClass, LIST___INDEX_OF__EOBJECT);
		createEOperation(listEClass, LIST___IS_EMPTY);
		createEOperation(listEClass, LIST___REMOVE_AT__INT);
		createEOperation(listEClass, LIST___SIZE);
		createEOperation(listEClass, LIST___REMOVE__EOBJECT);
		createEOperation(listEClass, LIST___ADD_ALL__LIST);

		collectionEClass = createEClass(COLLECTION);

		enumLiteralEClass = createEClass(ENUM_LITERAL);

		doubleEClass = createEClass(DOUBLE);

		integerEClass = createEClass(INTEGER);

		nullObjectEClass = createEClass(NULL_OBJECT);
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
		numberEClass.getESuperTypes().add(this.getPrimitive());
		booleanEClass.getESuperTypes().add(this.getPrimitive());
		mapEClass.getESuperTypes().add(this.getCollection());
		listEClass.getESuperTypes().add(this.getCollection());
		doubleEClass.getESuperTypes().add(this.getNumber());
		integerEClass.getESuperTypes().add(this.getNumber());

		// Initialize classes, features, and operations; add parameters
		initEClass(numberEClass, org.moflon.mofgen.typeModel.Number.class, "Number", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, org.moflon.mofgen.typeModel.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, org.moflon.mofgen.typeModel.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveEClass, Primitive.class, "Primitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, org.moflon.mofgen.typeModel.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Keys(), ecorePackage.getEObject(), null, "keys", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Entries(), ecorePackage.getEObject(), null, "entries", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMap__Get__EObject(), ecorePackage.getEObject(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__Put__EObject_EObject(), ecorePackage.getEBoolean(), "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__ContainsKey__EObject(), ecorePackage.getEBoolean(), "containsKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__ContainsValue__EObject(), ecorePackage.getEBoolean(), "containsValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMap__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMap__Size(), ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__Remove__EObject(), ecorePackage.getEObject(), "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getList_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getList__Get__int(), ecorePackage.getEObject(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Add__EObject(), ecorePackage.getEBoolean(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Contains__EObject(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__IndexOf__EObject(), ecorePackage.getEInt(), "indexOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getList__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__RemoveAt__int(), ecorePackage.getEObject(), "removeAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getList__Size(), ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__Remove__EObject(), ecorePackage.getEBoolean(), "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__AddAll__List(), ecorePackage.getEBoolean(), "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getList(), "coll", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleEClass, org.moflon.mofgen.typeModel.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, org.moflon.mofgen.typeModel.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullObjectEClass, NullObject.class, "NullObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TypeModelPackageImpl
