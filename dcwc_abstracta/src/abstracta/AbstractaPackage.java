/**
 */
package abstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryAbstractaWcImpl <em>Model Factory Abstracta Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryAbstractaWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstractaWc()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACTA_WC = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA_WC__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Type Factory Wc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Abstracta Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA_WC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.NamedElemntWcImpl <em>Named Elemnt Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.NamedElemntWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getNamedElemntWc()
	 * @generated
	 */
	int NAMED_ELEMNT_WC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMNT_WC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Elemnt Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMNT_WC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.ProjectWcImpl <em>Project Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ProjectWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getProjectWc()
	 * @generated
	 */
	int PROJECT_WC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__NAME = NAMED_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__PATH = NAMED_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__PACKAGES = NAMED_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Factory Wc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__TYPE_FACTORY_WC = NAMED_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC_FEATURE_COUNT = NAMED_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link abstracta.impl.PackageWcImpl <em>Package Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.PackageWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPackageWc()
	 * @generated
	 */
	int PACKAGE_WC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__NAME = NAMED_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__PATH = NAMED_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lists Class Wc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__LISTS_CLASS_WC = NAMED_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__RELATIONSHIP = NAMED_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children Packages Wc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__CHILDREN_PACKAGES_WC = NAMED_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC_FEATURE_COUNT = NAMED_ELEMNT_WC_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.PackageElementWcImpl <em>Package Element Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.PackageElementWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPackageElementWc()
	 * @generated
	 */
	int PACKAGE_ELEMENT_WC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_WC__NAME = NAMED_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_WC__PATH = NAMED_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_WC__NAME_SPACE = NAMED_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Element Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_WC_FEATURE_COUNT = NAMED_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.ClassifierWcImpl <em>Classifier Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ClassifierWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getClassifierWc()
	 * @generated
	 */
	int CLASSIFIER_WC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WC__NAME = NAMED_ELEMNT_WC__NAME;

	/**
	 * The number of structural features of the '<em>Classifier Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WC_FEATURE_COUNT = NAMED_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.DataTypeFactoryWcImpl <em>Data Type Factory Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.DataTypeFactoryWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getDataTypeFactoryWc()
	 * @generated
	 */
	int DATA_TYPE_FACTORY_WC = 6;

	/**
	 * The feature id for the '<em><b>List Types Wc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FACTORY_WC__LIST_TYPES_WC = 0;

	/**
	 * The number of structural features of the '<em>Data Type Factory Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FACTORY_WC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.TypeWcImpl <em>Type Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TypeWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTypeWc()
	 * @generated
	 */
	int TYPE_WC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WC__NAME = CLASSIFIER_WC__NAME;

	/**
	 * The number of structural features of the '<em>Type Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WC_FEATURE_COUNT = CLASSIFIER_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.ClassWcImpl <em>Class Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ClassWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getClassWc()
	 * @generated
	 */
	int CLASS_WC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__NAME = CLASSIFIER_WC__NAME;

	/**
	 * The feature id for the '<em><b>Path Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__PATH_PACKAGE = CLASSIFIER_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__IS_ABSTRACT = CLASSIFIER_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__FEATURES = CLASSIFIER_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Relationship Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__LIST_RELATIONSHIP_OUT = CLASSIFIER_WC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC_FEATURE_COUNT = CLASSIFIER_WC_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.RelationWcImpl <em>Relation Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.RelationWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getRelationWc()
	 * @generated
	 */
	int RELATION_WC = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__MULT_A = 1;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__MULT_B = 2;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__ROLE_A = 3;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__ROLE_B = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC__TARGET = 6;

	/**
	 * The number of structural features of the '<em>Relation Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_WC_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracta.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.CompositionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TYPE = RELATION_WC__TYPE;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MULT_A = RELATION_WC__MULT_A;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MULT_B = RELATION_WC__MULT_B;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ROLE_A = RELATION_WC__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ROLE_B = RELATION_WC__ROLE_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATION_WC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATION_WC__TARGET;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.GeneralizationImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TYPE = RELATION_WC__TYPE;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MULT_A = RELATION_WC__MULT_A;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MULT_B = RELATION_WC__MULT_B;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ROLE_A = RELATION_WC__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ROLE_B = RELATION_WC__ROLE_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATION_WC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATION_WC__TARGET;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.AggregationImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TYPE = RELATION_WC__TYPE;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MULT_A = RELATION_WC__MULT_A;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MULT_B = RELATION_WC__MULT_B;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__ROLE_A = RELATION_WC__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__ROLE_B = RELATION_WC__ROLE_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = RELATION_WC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = RELATION_WC__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.AssociationImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = RELATION_WC__TYPE;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_A = RELATION_WC__MULT_A;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_B = RELATION_WC__MULT_B;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROLE_A = RELATION_WC__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROLE_B = RELATION_WC__ROLE_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATION_WC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATION_WC__TARGET;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.RelationBinaryImpl <em>Relation Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.RelationBinaryImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getRelationBinary()
	 * @generated
	 */
	int RELATION_BINARY = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__TYPE = RELATION_WC__TYPE;

	/**
	 * The feature id for the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__MULT_A = RELATION_WC__MULT_A;

	/**
	 * The feature id for the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__MULT_B = RELATION_WC__MULT_B;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__ROLE_A = RELATION_WC__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__ROLE_B = RELATION_WC__ROLE_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__SOURCE = RELATION_WC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY__TARGET = RELATION_WC__TARGET;

	/**
	 * The number of structural features of the '<em>Relation Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_BINARY_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.FeatureWcImpl <em>Feature Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.FeatureWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getFeatureWc()
	 * @generated
	 */
	int FEATURE_WC = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__NAME = NAMED_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__IS_STATIC = NAMED_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acces Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__ACCES_MODIFY = NAMED_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__OWNER = NAMED_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC_FEATURE_COUNT = NAMED_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link abstracta.impl.AttributeWcImpl <em>Attribute Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.AttributeWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getAttributeWc()
	 * @generated
	 */
	int ATTRIBUTE_WC = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__NAME = FEATURE_WC__NAME;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__IS_STATIC = FEATURE_WC__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Acces Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__ACCES_MODIFY = FEATURE_WC__ACCES_MODIFY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__OWNER = FEATURE_WC__OWNER;

	/**
	 * The feature id for the '<em><b>Type Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__TYPE_CLASSIFIER = FEATURE_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__VALUE = FEATURE_WC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC_FEATURE_COUNT = FEATURE_WC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.MethodWcImpl <em>Method Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MethodWcImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMethodWc()
	 * @generated
	 */
	int METHOD_WC = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__NAME = FEATURE_WC__NAME;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__IS_STATIC = FEATURE_WC__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Acces Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__ACCES_MODIFY = FEATURE_WC__ACCES_MODIFY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__OWNER = FEATURE_WC__OWNER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__BODY = FEATURE_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__TYPE = FEATURE_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__IS_QUERY = FEATURE_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__PARAMETERS = FEATURE_WC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC_FEATURE_COUNT = FEATURE_WC_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link abstracta.AccesModifyWc <em>Acces Modify Wc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.AccesModifyWc
	 * @see abstracta.impl.AbstractaPackageImpl#getAccesModifyWc()
	 * @generated
	 */
	int ACCES_MODIFY_WC = 18;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactoryAbstractaWc <em>Model Factory Abstracta Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstracta Wc</em>'.
	 * @see abstracta.ModelFactoryAbstractaWc
	 * @generated
	 */
	EClass getModelFactoryAbstractaWc();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactoryAbstractaWc#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see abstracta.ModelFactoryAbstractaWc#getProjects()
	 * @see #getModelFactoryAbstractaWc()
	 * @generated
	 */
	EReference getModelFactoryAbstractaWc_Projects();

	/**
	 * Returns the meta object for the containment reference '{@link abstracta.ModelFactoryAbstractaWc#getTypeFactoryWc <em>Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Factory Wc</em>'.
	 * @see abstracta.ModelFactoryAbstractaWc#getTypeFactoryWc()
	 * @see #getModelFactoryAbstractaWc()
	 * @generated
	 */
	EReference getModelFactoryAbstractaWc_TypeFactoryWc();

	/**
	 * Returns the meta object for class '{@link abstracta.NamedElemntWc <em>Named Elemnt Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Elemnt Wc</em>'.
	 * @see abstracta.NamedElemntWc
	 * @generated
	 */
	EClass getNamedElemntWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.NamedElemntWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.NamedElemntWc#getName()
	 * @see #getNamedElemntWc()
	 * @generated
	 */
	EAttribute getNamedElemntWc_Name();

	/**
	 * Returns the meta object for class '{@link abstracta.ProjectWc <em>Project Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Wc</em>'.
	 * @see abstracta.ProjectWc
	 * @generated
	 */
	EClass getProjectWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ProjectWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.ProjectWc#getPath()
	 * @see #getProjectWc()
	 * @generated
	 */
	EAttribute getProjectWc_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ProjectWc#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see abstracta.ProjectWc#getPackages()
	 * @see #getProjectWc()
	 * @generated
	 */
	EReference getProjectWc_Packages();

	/**
	 * Returns the meta object for the containment reference '{@link abstracta.ProjectWc#getTypeFactoryWc <em>Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Factory Wc</em>'.
	 * @see abstracta.ProjectWc#getTypeFactoryWc()
	 * @see #getProjectWc()
	 * @generated
	 */
	EReference getProjectWc_TypeFactoryWc();

	/**
	 * Returns the meta object for class '{@link abstracta.PackageWc <em>Package Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Wc</em>'.
	 * @see abstracta.PackageWc
	 * @generated
	 */
	EClass getPackageWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.PackageWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.PackageWc#getPath()
	 * @see #getPackageWc()
	 * @generated
	 */
	EAttribute getPackageWc_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.PackageWc#getListsClassWc <em>Lists Class Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lists Class Wc</em>'.
	 * @see abstracta.PackageWc#getListsClassWc()
	 * @see #getPackageWc()
	 * @generated
	 */
	EReference getPackageWc_ListsClassWc();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.PackageWc#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see abstracta.PackageWc#getRelationship()
	 * @see #getPackageWc()
	 * @generated
	 */
	EReference getPackageWc_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.PackageWc#getChildrenPackagesWc <em>Children Packages Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Packages Wc</em>'.
	 * @see abstracta.PackageWc#getChildrenPackagesWc()
	 * @see #getPackageWc()
	 * @generated
	 */
	EReference getPackageWc_ChildrenPackagesWc();

	/**
	 * Returns the meta object for class '{@link abstracta.PackageElementWc <em>Package Element Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element Wc</em>'.
	 * @see abstracta.PackageElementWc
	 * @generated
	 */
	EClass getPackageElementWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.PackageElementWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.PackageElementWc#getPath()
	 * @see #getPackageElementWc()
	 * @generated
	 */
	EAttribute getPackageElementWc_Path();

	/**
	 * Returns the meta object for the reference '{@link abstracta.PackageElementWc#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see abstracta.PackageElementWc#getNameSpace()
	 * @see #getPackageElementWc()
	 * @generated
	 */
	EReference getPackageElementWc_NameSpace();

	/**
	 * Returns the meta object for class '{@link abstracta.ClassifierWc <em>Classifier Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Wc</em>'.
	 * @see abstracta.ClassifierWc
	 * @generated
	 */
	EClass getClassifierWc();

	/**
	 * Returns the meta object for class '{@link abstracta.DataTypeFactoryWc <em>Data Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Factory Wc</em>'.
	 * @see abstracta.DataTypeFactoryWc
	 * @generated
	 */
	EClass getDataTypeFactoryWc();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.DataTypeFactoryWc#getListTypesWc <em>List Types Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Types Wc</em>'.
	 * @see abstracta.DataTypeFactoryWc#getListTypesWc()
	 * @see #getDataTypeFactoryWc()
	 * @generated
	 */
	EReference getDataTypeFactoryWc_ListTypesWc();

	/**
	 * Returns the meta object for class '{@link abstracta.TypeWc <em>Type Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Wc</em>'.
	 * @see abstracta.TypeWc
	 * @generated
	 */
	EClass getTypeWc();

	/**
	 * Returns the meta object for class '{@link abstracta.ClassWc <em>Class Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Wc</em>'.
	 * @see abstracta.ClassWc
	 * @generated
	 */
	EClass getClassWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ClassWc#getPathPackage <em>Path Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Package</em>'.
	 * @see abstracta.ClassWc#getPathPackage()
	 * @see #getClassWc()
	 * @generated
	 */
	EAttribute getClassWc_PathPackage();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ClassWc#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see abstracta.ClassWc#isIsAbstract()
	 * @see #getClassWc()
	 * @generated
	 */
	EAttribute getClassWc_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClassWc#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see abstracta.ClassWc#getFeatures()
	 * @see #getClassWc()
	 * @generated
	 */
	EReference getClassWc_Features();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ClassWc#getListRelationshipOut <em>List Relationship Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Relationship Out</em>'.
	 * @see abstracta.ClassWc#getListRelationshipOut()
	 * @see #getClassWc()
	 * @generated
	 */
	EReference getClassWc_ListRelationshipOut();

	/**
	 * Returns the meta object for class '{@link abstracta.RelationWc <em>Relation Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Wc</em>'.
	 * @see abstracta.RelationWc
	 * @generated
	 */
	EClass getRelationWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelationWc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstracta.RelationWc#getType()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelationWc#getMultA <em>Mult A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult A</em>'.
	 * @see abstracta.RelationWc#getMultA()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_MultA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelationWc#getMultB <em>Mult B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult B</em>'.
	 * @see abstracta.RelationWc#getMultB()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_MultB();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelationWc#getRoleA <em>Role A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role A</em>'.
	 * @see abstracta.RelationWc#getRoleA()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_RoleA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelationWc#getRoleB <em>Role B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role B</em>'.
	 * @see abstracta.RelationWc#getRoleB()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_RoleB();

	/**
	 * Returns the meta object for the reference '{@link abstracta.RelationWc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.RelationWc#getSource()
	 * @see #getRelationWc()
	 * @generated
	 */
	EReference getRelationWc_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.RelationWc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.RelationWc#getTarget()
	 * @see #getRelationWc()
	 * @generated
	 */
	EReference getRelationWc_Target();

	/**
	 * Returns the meta object for class '{@link abstracta.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see abstracta.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link abstracta.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see abstracta.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link abstracta.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see abstracta.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link abstracta.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see abstracta.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link abstracta.RelationBinary <em>Relation Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Binary</em>'.
	 * @see abstracta.RelationBinary
	 * @generated
	 */
	EClass getRelationBinary();

	/**
	 * Returns the meta object for class '{@link abstracta.FeatureWc <em>Feature Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Wc</em>'.
	 * @see abstracta.FeatureWc
	 * @generated
	 */
	EClass getFeatureWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.FeatureWc#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see abstracta.FeatureWc#isIsStatic()
	 * @see #getFeatureWc()
	 * @generated
	 */
	EAttribute getFeatureWc_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.FeatureWc#getAccesModify <em>Acces Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acces Modify</em>'.
	 * @see abstracta.FeatureWc#getAccesModify()
	 * @see #getFeatureWc()
	 * @generated
	 */
	EAttribute getFeatureWc_AccesModify();

	/**
	 * Returns the meta object for the reference '{@link abstracta.FeatureWc#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see abstracta.FeatureWc#getOwner()
	 * @see #getFeatureWc()
	 * @generated
	 */
	EReference getFeatureWc_Owner();

	/**
	 * Returns the meta object for class '{@link abstracta.AttributeWc <em>Attribute Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Wc</em>'.
	 * @see abstracta.AttributeWc
	 * @generated
	 */
	EClass getAttributeWc();

	/**
	 * Returns the meta object for the reference '{@link abstracta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Classifier</em>'.
	 * @see abstracta.AttributeWc#getTypeClassifier()
	 * @see #getAttributeWc()
	 * @generated
	 */
	EReference getAttributeWc_TypeClassifier();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.AttributeWc#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abstracta.AttributeWc#getValue()
	 * @see #getAttributeWc()
	 * @generated
	 */
	EAttribute getAttributeWc_Value();

	/**
	 * Returns the meta object for class '{@link abstracta.MethodWc <em>Method Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Wc</em>'.
	 * @see abstracta.MethodWc
	 * @generated
	 */
	EClass getMethodWc();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MethodWc#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see abstracta.MethodWc#getBody()
	 * @see #getMethodWc()
	 * @generated
	 */
	EAttribute getMethodWc_Body();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MethodWc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see abstracta.MethodWc#getType()
	 * @see #getMethodWc()
	 * @generated
	 */
	EReference getMethodWc_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MethodWc#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see abstracta.MethodWc#isIsQuery()
	 * @see #getMethodWc()
	 * @generated
	 */
	EAttribute getMethodWc_IsQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MethodWc#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see abstracta.MethodWc#getParameters()
	 * @see #getMethodWc()
	 * @generated
	 */
	EReference getMethodWc_Parameters();

	/**
	 * Returns the meta object for enum '{@link abstracta.AccesModifyWc <em>Acces Modify Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acces Modify Wc</em>'.
	 * @see abstracta.AccesModifyWc
	 * @generated
	 */
	EEnum getAccesModifyWc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryAbstractaWcImpl <em>Model Factory Abstracta Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryAbstractaWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstractaWc()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACTA_WC = eINSTANCE.getModelFactoryAbstractaWc();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACTA_WC__PROJECTS = eINSTANCE.getModelFactoryAbstractaWc_Projects();

		/**
		 * The meta object literal for the '<em><b>Type Factory Wc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC = eINSTANCE.getModelFactoryAbstractaWc_TypeFactoryWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.NamedElemntWcImpl <em>Named Elemnt Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.NamedElemntWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getNamedElemntWc()
		 * @generated
		 */
		EClass NAMED_ELEMNT_WC = eINSTANCE.getNamedElemntWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMNT_WC__NAME = eINSTANCE.getNamedElemntWc_Name();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ProjectWcImpl <em>Project Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ProjectWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getProjectWc()
		 * @generated
		 */
		EClass PROJECT_WC = eINSTANCE.getProjectWc();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_WC__PATH = eINSTANCE.getProjectWc_Path();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_WC__PACKAGES = eINSTANCE.getProjectWc_Packages();

		/**
		 * The meta object literal for the '<em><b>Type Factory Wc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_WC__TYPE_FACTORY_WC = eINSTANCE.getProjectWc_TypeFactoryWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.PackageWcImpl <em>Package Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.PackageWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPackageWc()
		 * @generated
		 */
		EClass PACKAGE_WC = eINSTANCE.getPackageWc();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_WC__PATH = eINSTANCE.getPackageWc_Path();

		/**
		 * The meta object literal for the '<em><b>Lists Class Wc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_WC__LISTS_CLASS_WC = eINSTANCE.getPackageWc_ListsClassWc();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_WC__RELATIONSHIP = eINSTANCE.getPackageWc_Relationship();

		/**
		 * The meta object literal for the '<em><b>Children Packages Wc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_WC__CHILDREN_PACKAGES_WC = eINSTANCE.getPackageWc_ChildrenPackagesWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.PackageElementWcImpl <em>Package Element Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.PackageElementWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPackageElementWc()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT_WC = eINSTANCE.getPackageElementWc();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_ELEMENT_WC__PATH = eINSTANCE.getPackageElementWc_Path();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT_WC__NAME_SPACE = eINSTANCE.getPackageElementWc_NameSpace();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ClassifierWcImpl <em>Classifier Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ClassifierWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getClassifierWc()
		 * @generated
		 */
		EClass CLASSIFIER_WC = eINSTANCE.getClassifierWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.DataTypeFactoryWcImpl <em>Data Type Factory Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.DataTypeFactoryWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getDataTypeFactoryWc()
		 * @generated
		 */
		EClass DATA_TYPE_FACTORY_WC = eINSTANCE.getDataTypeFactoryWc();

		/**
		 * The meta object literal for the '<em><b>List Types Wc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FACTORY_WC__LIST_TYPES_WC = eINSTANCE.getDataTypeFactoryWc_ListTypesWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TypeWcImpl <em>Type Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TypeWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTypeWc()
		 * @generated
		 */
		EClass TYPE_WC = eINSTANCE.getTypeWc();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ClassWcImpl <em>Class Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ClassWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getClassWc()
		 * @generated
		 */
		EClass CLASS_WC = eINSTANCE.getClassWc();

		/**
		 * The meta object literal for the '<em><b>Path Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_WC__PATH_PACKAGE = eINSTANCE.getClassWc_PathPackage();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_WC__IS_ABSTRACT = eINSTANCE.getClassWc_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WC__FEATURES = eINSTANCE.getClassWc_Features();

		/**
		 * The meta object literal for the '<em><b>List Relationship Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WC__LIST_RELATIONSHIP_OUT = eINSTANCE.getClassWc_ListRelationshipOut();

		/**
		 * The meta object literal for the '{@link abstracta.impl.RelationWcImpl <em>Relation Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.RelationWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getRelationWc()
		 * @generated
		 */
		EClass RELATION_WC = eINSTANCE.getRelationWc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_WC__TYPE = eINSTANCE.getRelationWc_Type();

		/**
		 * The meta object literal for the '<em><b>Mult A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_WC__MULT_A = eINSTANCE.getRelationWc_MultA();

		/**
		 * The meta object literal for the '<em><b>Mult B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_WC__MULT_B = eINSTANCE.getRelationWc_MultB();

		/**
		 * The meta object literal for the '<em><b>Role A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_WC__ROLE_A = eINSTANCE.getRelationWc_RoleA();

		/**
		 * The meta object literal for the '<em><b>Role B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_WC__ROLE_B = eINSTANCE.getRelationWc_RoleB();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_WC__SOURCE = eINSTANCE.getRelationWc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_WC__TARGET = eINSTANCE.getRelationWc_Target();

		/**
		 * The meta object literal for the '{@link abstracta.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.CompositionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link abstracta.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.GeneralizationImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link abstracta.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.AggregationImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link abstracta.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.AssociationImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link abstracta.impl.RelationBinaryImpl <em>Relation Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.RelationBinaryImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getRelationBinary()
		 * @generated
		 */
		EClass RELATION_BINARY = eINSTANCE.getRelationBinary();

		/**
		 * The meta object literal for the '{@link abstracta.impl.FeatureWcImpl <em>Feature Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.FeatureWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getFeatureWc()
		 * @generated
		 */
		EClass FEATURE_WC = eINSTANCE.getFeatureWc();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_WC__IS_STATIC = eINSTANCE.getFeatureWc_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Acces Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_WC__ACCES_MODIFY = eINSTANCE.getFeatureWc_AccesModify();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_WC__OWNER = eINSTANCE.getFeatureWc_Owner();

		/**
		 * The meta object literal for the '{@link abstracta.impl.AttributeWcImpl <em>Attribute Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.AttributeWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getAttributeWc()
		 * @generated
		 */
		EClass ATTRIBUTE_WC = eINSTANCE.getAttributeWc();

		/**
		 * The meta object literal for the '<em><b>Type Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_WC__TYPE_CLASSIFIER = eINSTANCE.getAttributeWc_TypeClassifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_WC__VALUE = eINSTANCE.getAttributeWc_Value();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MethodWcImpl <em>Method Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MethodWcImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMethodWc()
		 * @generated
		 */
		EClass METHOD_WC = eINSTANCE.getMethodWc();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_WC__BODY = eINSTANCE.getMethodWc_Body();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_WC__TYPE = eINSTANCE.getMethodWc_Type();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_WC__IS_QUERY = eINSTANCE.getMethodWc_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_WC__PARAMETERS = eINSTANCE.getMethodWc_Parameters();

		/**
		 * The meta object literal for the '{@link abstracta.AccesModifyWc <em>Acces Modify Wc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.AccesModifyWc
		 * @see abstracta.impl.AbstractaPackageImpl#getAccesModifyWc()
		 * @generated
		 */
		EEnum ACCES_MODIFY_WC = eINSTANCE.getAccesModifyWc();

	}

} //AbstractaPackage
