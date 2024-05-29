/**
 */
package abstracta.impl;

import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.AccesModifyWc;
import abstracta.Aggregation;
import abstracta.Association;
import abstracta.AttributeWc;
import abstracta.ClassWc;
import abstracta.ClassifierWc;
import abstracta.Composition;
import abstracta.DataTypeFactoryWc;
import abstracta.FeatureWc;
import abstracta.Generalization;
import abstracta.MethodWc;
import abstracta.ModelFactoryAbstractaWc;
import abstracta.NamedElemntWc;
import abstracta.PackageElementWc;
import abstracta.PackageWc;
import abstracta.ProjectWc;
import abstracta.RelationBinary;
import abstracta.RelationWc;
import abstracta.TypeWc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractaPackageImpl extends EPackageImpl implements AbstractaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryAbstractaWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElemntWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageElementWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFactoryWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationBinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodWcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accesModifyWcEEnum = null;

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
	 * @see abstracta.AbstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractaPackageImpl() {
		super(eNS_URI, AbstractaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AbstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractaPackage init() {
		if (isInited) return (AbstractaPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractaPackage.eNS_URI);

		// Obtain or create and register package
		AbstractaPackageImpl theAbstractaPackage = (AbstractaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAbstractaPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractaPackage.eNS_URI, theAbstractaPackage);
		return theAbstractaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryAbstractaWc() {
		return modelFactoryAbstractaWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstractaWc_Projects() {
		return (EReference)modelFactoryAbstractaWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstractaWc_TypeFactoryWc() {
		return (EReference)modelFactoryAbstractaWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElemntWc() {
		return namedElemntWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElemntWc_Name() {
		return (EAttribute)namedElemntWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectWc() {
		return projectWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectWc_Path() {
		return (EAttribute)projectWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectWc_Packages() {
		return (EReference)projectWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectWc_TypeFactoryWc() {
		return (EReference)projectWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageWc() {
		return packageWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageWc_Path() {
		return (EAttribute)packageWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageWc_ListsClassWc() {
		return (EReference)packageWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageWc_Relationship() {
		return (EReference)packageWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageWc_ChildrenPackagesWc() {
		return (EReference)packageWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageElementWc() {
		return packageElementWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageElementWc_Path() {
		return (EAttribute)packageElementWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageElementWc_NameSpace() {
		return (EReference)packageElementWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierWc() {
		return classifierWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeFactoryWc() {
		return dataTypeFactoryWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeFactoryWc_ListTypesWc() {
		return (EReference)dataTypeFactoryWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeWc() {
		return typeWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassWc() {
		return classWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassWc_PathPackage() {
		return (EAttribute)classWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassWc_IsAbstract() {
		return (EAttribute)classWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassWc_Features() {
		return (EReference)classWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassWc_ListRelationshipOut() {
		return (EReference)classWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationWc() {
		return relationWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationWc_Type() {
		return (EAttribute)relationWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationWc_MultA() {
		return (EAttribute)relationWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationWc_MultB() {
		return (EAttribute)relationWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationWc_RoleA() {
		return (EAttribute)relationWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationWc_RoleB() {
		return (EAttribute)relationWcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationWc_Source() {
		return (EReference)relationWcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationWc_Target() {
		return (EReference)relationWcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationBinary() {
		return relationBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureWc() {
		return featureWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureWc_IsStatic() {
		return (EAttribute)featureWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureWc_AccesModify() {
		return (EAttribute)featureWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureWc_Owner() {
		return (EReference)featureWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeWc() {
		return attributeWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeWc_TypeClassifier() {
		return (EReference)attributeWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeWc_Value() {
		return (EAttribute)attributeWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodWc() {
		return methodWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodWc_Body() {
		return (EAttribute)methodWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodWc_Type() {
		return (EReference)methodWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodWc_IsQuery() {
		return (EAttribute)methodWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodWc_Parameters() {
		return (EReference)methodWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccesModifyWc() {
		return accesModifyWcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactory getAbstractaFactory() {
		return (AbstractaFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryAbstractaWcEClass = createEClass(MODEL_FACTORY_ABSTRACTA_WC);
		createEReference(modelFactoryAbstractaWcEClass, MODEL_FACTORY_ABSTRACTA_WC__PROJECTS);
		createEReference(modelFactoryAbstractaWcEClass, MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC);

		namedElemntWcEClass = createEClass(NAMED_ELEMNT_WC);
		createEAttribute(namedElemntWcEClass, NAMED_ELEMNT_WC__NAME);

		projectWcEClass = createEClass(PROJECT_WC);
		createEAttribute(projectWcEClass, PROJECT_WC__PATH);
		createEReference(projectWcEClass, PROJECT_WC__PACKAGES);
		createEReference(projectWcEClass, PROJECT_WC__TYPE_FACTORY_WC);

		packageWcEClass = createEClass(PACKAGE_WC);
		createEAttribute(packageWcEClass, PACKAGE_WC__PATH);
		createEReference(packageWcEClass, PACKAGE_WC__LISTS_CLASS_WC);
		createEReference(packageWcEClass, PACKAGE_WC__RELATIONSHIP);
		createEReference(packageWcEClass, PACKAGE_WC__CHILDREN_PACKAGES_WC);

		packageElementWcEClass = createEClass(PACKAGE_ELEMENT_WC);
		createEAttribute(packageElementWcEClass, PACKAGE_ELEMENT_WC__PATH);
		createEReference(packageElementWcEClass, PACKAGE_ELEMENT_WC__NAME_SPACE);

		classifierWcEClass = createEClass(CLASSIFIER_WC);

		dataTypeFactoryWcEClass = createEClass(DATA_TYPE_FACTORY_WC);
		createEReference(dataTypeFactoryWcEClass, DATA_TYPE_FACTORY_WC__LIST_TYPES_WC);

		typeWcEClass = createEClass(TYPE_WC);

		classWcEClass = createEClass(CLASS_WC);
		createEAttribute(classWcEClass, CLASS_WC__PATH_PACKAGE);
		createEAttribute(classWcEClass, CLASS_WC__IS_ABSTRACT);
		createEReference(classWcEClass, CLASS_WC__FEATURES);
		createEReference(classWcEClass, CLASS_WC__LIST_RELATIONSHIP_OUT);

		relationWcEClass = createEClass(RELATION_WC);
		createEAttribute(relationWcEClass, RELATION_WC__TYPE);
		createEAttribute(relationWcEClass, RELATION_WC__MULT_A);
		createEAttribute(relationWcEClass, RELATION_WC__MULT_B);
		createEAttribute(relationWcEClass, RELATION_WC__ROLE_A);
		createEAttribute(relationWcEClass, RELATION_WC__ROLE_B);
		createEReference(relationWcEClass, RELATION_WC__SOURCE);
		createEReference(relationWcEClass, RELATION_WC__TARGET);

		compositionEClass = createEClass(COMPOSITION);

		generalizationEClass = createEClass(GENERALIZATION);

		aggregationEClass = createEClass(AGGREGATION);

		associationEClass = createEClass(ASSOCIATION);

		relationBinaryEClass = createEClass(RELATION_BINARY);

		featureWcEClass = createEClass(FEATURE_WC);
		createEAttribute(featureWcEClass, FEATURE_WC__IS_STATIC);
		createEAttribute(featureWcEClass, FEATURE_WC__ACCES_MODIFY);
		createEReference(featureWcEClass, FEATURE_WC__OWNER);

		attributeWcEClass = createEClass(ATTRIBUTE_WC);
		createEReference(attributeWcEClass, ATTRIBUTE_WC__TYPE_CLASSIFIER);
		createEAttribute(attributeWcEClass, ATTRIBUTE_WC__VALUE);

		methodWcEClass = createEClass(METHOD_WC);
		createEAttribute(methodWcEClass, METHOD_WC__BODY);
		createEReference(methodWcEClass, METHOD_WC__TYPE);
		createEAttribute(methodWcEClass, METHOD_WC__IS_QUERY);
		createEReference(methodWcEClass, METHOD_WC__PARAMETERS);

		// Create enums
		accesModifyWcEEnum = createEEnum(ACCES_MODIFY_WC);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectWcEClass.getESuperTypes().add(this.getNamedElemntWc());
		packageWcEClass.getESuperTypes().add(this.getNamedElemntWc());
		packageElementWcEClass.getESuperTypes().add(this.getNamedElemntWc());
		classifierWcEClass.getESuperTypes().add(this.getNamedElemntWc());
		typeWcEClass.getESuperTypes().add(this.getClassifierWc());
		classWcEClass.getESuperTypes().add(this.getClassifierWc());
		compositionEClass.getESuperTypes().add(this.getRelationWc());
		generalizationEClass.getESuperTypes().add(this.getRelationWc());
		aggregationEClass.getESuperTypes().add(this.getRelationWc());
		associationEClass.getESuperTypes().add(this.getRelationWc());
		relationBinaryEClass.getESuperTypes().add(this.getRelationWc());
		featureWcEClass.getESuperTypes().add(this.getNamedElemntWc());
		attributeWcEClass.getESuperTypes().add(this.getFeatureWc());
		methodWcEClass.getESuperTypes().add(this.getFeatureWc());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryAbstractaWcEClass, ModelFactoryAbstractaWc.class, "ModelFactoryAbstractaWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryAbstractaWc_Projects(), this.getProjectWc(), null, "projects", null, 0, -1, ModelFactoryAbstractaWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryAbstractaWc_TypeFactoryWc(), this.getDataTypeFactoryWc(), null, "typeFactoryWc", null, 0, 1, ModelFactoryAbstractaWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElemntWcEClass, NamedElemntWc.class, "NamedElemntWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElemntWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElemntWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectWcEClass, ProjectWc.class, "ProjectWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectWc_Packages(), this.getPackageWc(), null, "packages", null, 0, -1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectWc_TypeFactoryWc(), this.getDataTypeFactoryWc(), null, "typeFactoryWc", null, 0, 1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageWcEClass, PackageWc.class, "PackageWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageWc_ListsClassWc(), this.getClassWc(), null, "listsClassWc", null, 0, -1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageWc_Relationship(), this.getRelationWc(), null, "relationship", null, 0, -1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageWc_ChildrenPackagesWc(), this.getPackageWc(), null, "childrenPackagesWc", null, 0, -1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageElementWcEClass, PackageElementWc.class, "PackageElementWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageElementWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageElementWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageElementWc_NameSpace(), this.getPackageWc(), null, "nameSpace", null, 0, 1, PackageElementWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierWcEClass, ClassifierWc.class, "ClassifierWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeFactoryWcEClass, DataTypeFactoryWc.class, "DataTypeFactoryWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeFactoryWc_ListTypesWc(), this.getTypeWc(), null, "listTypesWc", null, 0, -1, DataTypeFactoryWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeWcEClass, TypeWc.class, "TypeWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classWcEClass, ClassWc.class, "ClassWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassWc_PathPackage(), ecorePackage.getEString(), "pathPackage", null, 0, 1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassWc_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassWc_Features(), this.getFeatureWc(), null, "features", null, 0, -1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassWc_ListRelationshipOut(), this.getRelationWc(), null, "listRelationshipOut", null, 0, -1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationWcEClass, RelationWc.class, "RelationWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationWc_Type(), ecorePackage.getEString(), "type", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationWc_MultA(), ecorePackage.getEString(), "multA", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationWc_MultB(), ecorePackage.getEString(), "multB", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationWc_RoleA(), ecorePackage.getEString(), "roleA", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationWc_RoleB(), ecorePackage.getEString(), "roleB", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationWc_Source(), this.getClassWc(), null, "source", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationWc_Target(), this.getClassWc(), null, "target", null, 0, 1, RelationWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationBinaryEClass, RelationBinary.class, "RelationBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureWcEClass, FeatureWc.class, "FeatureWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureWc_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, FeatureWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureWc_AccesModify(), this.getAccesModifyWc(), "accesModify", null, 0, 1, FeatureWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureWc_Owner(), this.getClassWc(), null, "owner", null, 0, 1, FeatureWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeWcEClass, AttributeWc.class, "AttributeWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeWc_TypeClassifier(), this.getClassifierWc(), null, "typeClassifier", null, 0, 1, AttributeWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeWc_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodWcEClass, MethodWc.class, "MethodWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodWc_Body(), ecorePackage.getEString(), "body", null, 0, 1, MethodWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodWc_Type(), this.getClassifierWc(), null, "type", null, 0, 1, MethodWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodWc_IsQuery(), ecorePackage.getEBoolean(), "isQuery", null, 0, 1, MethodWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodWc_Parameters(), this.getAttributeWc(), null, "parameters", null, 0, -1, MethodWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accesModifyWcEEnum, AccesModifyWc.class, "AccesModifyWc");
		addEEnumLiteral(accesModifyWcEEnum, AccesModifyWc.PRIVATE);
		addEEnumLiteral(accesModifyWcEEnum, AccesModifyWc.PUBLIC);
		addEEnumLiteral(accesModifyWcEEnum, AccesModifyWc.PROTECTED);

		// Create resource
		createResource(eNS_URI);
	}

} //AbstractaPackageImpl
