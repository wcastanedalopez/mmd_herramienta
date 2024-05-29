/**
 */
package mconcreta.impl;

import mconcreta.AccesModifyWc;
import mconcreta.Aggregation;
import mconcreta.Association;
import mconcreta.AttributeWc;
import mconcreta.ClassDiagramWc;
import mconcreta.ClassWc;
import mconcreta.ClassifierWc;
import mconcreta.Composition;
import mconcreta.DataTypeFactoryWc;
import mconcreta.FeatureWc;
import mconcreta.Generalization;
import mconcreta.MconcretaFactory;
import mconcreta.MconcretaPackage;
import mconcreta.MethodWc;
import mconcreta.ModelFactoryConcretaWc;
import mconcreta.PackageWc;
import mconcreta.ProjectWc;
import mconcreta.RelationBinary;
import mconcreta.RelationWc;
import mconcreta.TypeWc;

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
public class MconcretaPackageImpl extends EPackageImpl implements MconcretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryConcretaWcEClass = null;

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
	private EClass classDiagramWcEClass = null;

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
	 * @see mconcreta.MconcretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MconcretaPackageImpl() {
		super(eNS_URI, MconcretaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MconcretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MconcretaPackage init() {
		if (isInited) return (MconcretaPackage)EPackage.Registry.INSTANCE.getEPackage(MconcretaPackage.eNS_URI);

		// Obtain or create and register package
		MconcretaPackageImpl theMconcretaPackage = (MconcretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MconcretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MconcretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMconcretaPackage.createPackageContents();

		// Initialize created meta-data
		theMconcretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMconcretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MconcretaPackage.eNS_URI, theMconcretaPackage);
		return theMconcretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryConcretaWc() {
		return modelFactoryConcretaWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryConcretaWc_Projects() {
		return (EReference)modelFactoryConcretaWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryConcretaWc_TypeFactoryWc() {
		return (EReference)modelFactoryConcretaWcEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getProjectWc_Name() {
		return (EAttribute)projectWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectWc_Path() {
		return (EAttribute)projectWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectWc_ClassDiagrams() {
		return (EReference)projectWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDiagramWc() {
		return classDiagramWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramWc_Name() {
		return (EAttribute)classDiagramWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramWc_Path() {
		return (EAttribute)classDiagramWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramWc_ListClass() {
		return (EReference)classDiagramWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramWc_Relationship() {
		return (EReference)classDiagramWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramWc_Packages() {
		return (EReference)classDiagramWcEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getPackageWc_Name() {
		return (EAttribute)packageWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageWc_Path() {
		return (EAttribute)packageWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageWc_ChildrenPackagesWc() {
		return (EReference)packageWcEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getClassifierWc_Name() {
		return (EAttribute)classifierWcEClass.getEStructuralFeatures().get(0);
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
	public EReference getDataTypeFactoryWc_Type() {
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
	public EReference getClassWc_Attributes() {
		return (EReference)classWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassWc_Methods() {
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
	public EReference getGeneralization_Child() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Parent() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
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
	public EClass getAttributeWc() {
		return attributeWcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeWc_Name() {
		return (EAttribute)attributeWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeWc_TypeClassifier() {
		return (EReference)attributeWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeWc_Value() {
		return (EAttribute)attributeWcEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMethodWc_Name() {
		return (EAttribute)methodWcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodWc_Body() {
		return (EAttribute)methodWcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodWc_Type() {
		return (EReference)methodWcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodWc_IsQuery() {
		return (EAttribute)methodWcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodWc_Parameters() {
		return (EReference)methodWcEClass.getEStructuralFeatures().get(4);
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
	public MconcretaFactory getMconcretaFactory() {
		return (MconcretaFactory)getEFactoryInstance();
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
		modelFactoryConcretaWcEClass = createEClass(MODEL_FACTORY_CONCRETA_WC);
		createEReference(modelFactoryConcretaWcEClass, MODEL_FACTORY_CONCRETA_WC__PROJECTS);
		createEReference(modelFactoryConcretaWcEClass, MODEL_FACTORY_CONCRETA_WC__TYPE_FACTORY_WC);

		projectWcEClass = createEClass(PROJECT_WC);
		createEAttribute(projectWcEClass, PROJECT_WC__NAME);
		createEAttribute(projectWcEClass, PROJECT_WC__PATH);
		createEReference(projectWcEClass, PROJECT_WC__CLASS_DIAGRAMS);

		classDiagramWcEClass = createEClass(CLASS_DIAGRAM_WC);
		createEAttribute(classDiagramWcEClass, CLASS_DIAGRAM_WC__NAME);
		createEAttribute(classDiagramWcEClass, CLASS_DIAGRAM_WC__PATH);
		createEReference(classDiagramWcEClass, CLASS_DIAGRAM_WC__LIST_CLASS);
		createEReference(classDiagramWcEClass, CLASS_DIAGRAM_WC__RELATIONSHIP);
		createEReference(classDiagramWcEClass, CLASS_DIAGRAM_WC__PACKAGES);

		packageWcEClass = createEClass(PACKAGE_WC);
		createEAttribute(packageWcEClass, PACKAGE_WC__NAME);
		createEAttribute(packageWcEClass, PACKAGE_WC__PATH);
		createEReference(packageWcEClass, PACKAGE_WC__CHILDREN_PACKAGES_WC);

		classifierWcEClass = createEClass(CLASSIFIER_WC);
		createEAttribute(classifierWcEClass, CLASSIFIER_WC__NAME);

		dataTypeFactoryWcEClass = createEClass(DATA_TYPE_FACTORY_WC);
		createEReference(dataTypeFactoryWcEClass, DATA_TYPE_FACTORY_WC__TYPE);

		typeWcEClass = createEClass(TYPE_WC);

		classWcEClass = createEClass(CLASS_WC);
		createEAttribute(classWcEClass, CLASS_WC__PATH_PACKAGE);
		createEAttribute(classWcEClass, CLASS_WC__IS_ABSTRACT);
		createEReference(classWcEClass, CLASS_WC__ATTRIBUTES);
		createEReference(classWcEClass, CLASS_WC__METHODS);

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
		createEReference(generalizationEClass, GENERALIZATION__CHILD);
		createEReference(generalizationEClass, GENERALIZATION__PARENT);

		aggregationEClass = createEClass(AGGREGATION);

		associationEClass = createEClass(ASSOCIATION);

		relationBinaryEClass = createEClass(RELATION_BINARY);

		featureWcEClass = createEClass(FEATURE_WC);
		createEAttribute(featureWcEClass, FEATURE_WC__IS_STATIC);
		createEAttribute(featureWcEClass, FEATURE_WC__ACCES_MODIFY);

		attributeWcEClass = createEClass(ATTRIBUTE_WC);
		createEAttribute(attributeWcEClass, ATTRIBUTE_WC__NAME);
		createEReference(attributeWcEClass, ATTRIBUTE_WC__TYPE_CLASSIFIER);
		createEAttribute(attributeWcEClass, ATTRIBUTE_WC__VALUE);

		methodWcEClass = createEClass(METHOD_WC);
		createEAttribute(methodWcEClass, METHOD_WC__NAME);
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
		typeWcEClass.getESuperTypes().add(this.getClassifierWc());
		classWcEClass.getESuperTypes().add(this.getClassifierWc());
		compositionEClass.getESuperTypes().add(this.getRelationWc());
		generalizationEClass.getESuperTypes().add(this.getRelationWc());
		aggregationEClass.getESuperTypes().add(this.getRelationWc());
		associationEClass.getESuperTypes().add(this.getRelationWc());
		relationBinaryEClass.getESuperTypes().add(this.getRelationWc());
		attributeWcEClass.getESuperTypes().add(this.getFeatureWc());
		methodWcEClass.getESuperTypes().add(this.getFeatureWc());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryConcretaWcEClass, ModelFactoryConcretaWc.class, "ModelFactoryConcretaWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryConcretaWc_Projects(), this.getProjectWc(), null, "projects", null, 0, -1, ModelFactoryConcretaWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryConcretaWc_TypeFactoryWc(), this.getDataTypeFactoryWc(), null, "typeFactoryWc", null, 0, 1, ModelFactoryConcretaWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectWcEClass, ProjectWc.class, "ProjectWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectWc_ClassDiagrams(), this.getClassDiagramWc(), null, "classDiagrams", null, 0, -1, ProjectWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDiagramWcEClass, ClassDiagramWc.class, "ClassDiagramWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDiagramWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassDiagramWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagramWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, ClassDiagramWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramWc_ListClass(), this.getClassWc(), null, "listClass", null, 0, -1, ClassDiagramWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramWc_Relationship(), this.getRelationWc(), null, "relationship", null, 0, -1, ClassDiagramWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramWc_Packages(), this.getPackageWc(), null, "packages", null, 0, -1, ClassDiagramWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageWcEClass, PackageWc.class, "PackageWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageWc_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageWc_ChildrenPackagesWc(), this.getPackageWc(), null, "childrenPackagesWc", null, 0, -1, PackageWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierWcEClass, ClassifierWc.class, "ClassifierWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassifierWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeFactoryWcEClass, DataTypeFactoryWc.class, "DataTypeFactoryWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeFactoryWc_Type(), this.getTypeWc(), null, "type", null, 0, -1, DataTypeFactoryWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeWcEClass, TypeWc.class, "TypeWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classWcEClass, ClassWc.class, "ClassWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassWc_PathPackage(), ecorePackage.getEString(), "pathPackage", null, 0, 1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassWc_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassWc_Attributes(), this.getAttributeWc(), null, "attributes", null, 0, -1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassWc_Methods(), this.getMethodWc(), null, "methods", null, 0, -1, ClassWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getGeneralization_Child(), this.getClassWc(), null, "child", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Parent(), this.getClassWc(), null, "parent", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationBinaryEClass, RelationBinary.class, "RelationBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureWcEClass, FeatureWc.class, "FeatureWc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureWc_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, FeatureWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureWc_AccesModify(), this.getAccesModifyWc(), "accesModify", null, 0, 1, FeatureWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeWcEClass, AttributeWc.class, "AttributeWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeWc_TypeClassifier(), this.getClassifierWc(), null, "typeClassifier", null, 0, 1, AttributeWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeWc_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodWcEClass, MethodWc.class, "MethodWc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodWc_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodWc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (classDiagramWcEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (packageWcEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "rectangle", "rounded"
		   });	
		addAnnotation
		  (classWcEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "rectangle", "rounded",
			 "color", "255,224,189",
			 "border.width", "2",
			 "margin", "10"
		   });	
		addAnnotation
		  (attributeWcEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "189,236,182",
			 "color", "189,236,182",
			 "border.width", "1",
			 "margin", "5",
			 "label.pattern", "{0}  [ {1} ]",
			 "layout", "list"
		   });	
		addAnnotation
		  (methodWcEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "159,213,209",
			 "color", "159,213,209",
			 "border.width", "1",
			 "margin", "5",
			 "label.pattern", "{0}  [ {1} ]",
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getClassWc_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true",
			 "margin", "5",
			 "spacing", "10"
		   });	
		addAnnotation
		  (getClassWc_Methods(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true",
			 "margin", "5",
			 "spacing", "10"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (compositionEClass, 
		   source, 
		   new String[] {
			 "source.decoration", "filledrhomb",
			 "source", "source",
			 "style", "solid",
			 "target", "target",
			 "width", "2"
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "parent",
			 "target.decoration", "closedarrow",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (aggregationEClass, 
		   source, 
		   new String[] {
			 "source.decoration", "rhomb",
			 "source", "source",
			 "style", "solid",
			 "target", "target",
			 "width", "2"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "source.decoration", "arrow",
			 "source", "source",
			 "style", "solid",
			 "target", "target",
			 "width", "2"
		   });	
		addAnnotation
		  (relationBinaryEClass, 
		   source, 
		   new String[] {
			 "source.decoration", "none",
			 "source", "source",
			 "target", "target",
			 "width", "2"
		   });
	}

} //MconcretaPackageImpl
