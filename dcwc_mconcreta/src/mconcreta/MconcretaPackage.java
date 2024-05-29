/**
 */
package mconcreta;

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
 * @see mconcreta.MconcretaFactory
 * @model kind="package"
 * @generated
 */
public interface MconcretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mconcreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mconcreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mconcreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MconcretaPackage eINSTANCE = mconcreta.impl.MconcretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link mconcreta.impl.ModelFactoryConcretaWcImpl <em>Model Factory Concreta Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.ModelFactoryConcretaWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getModelFactoryConcretaWc()
	 * @generated
	 */
	int MODEL_FACTORY_CONCRETA_WC = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA_WC__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Type Factory Wc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA_WC__TYPE_FACTORY_WC = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Concreta Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA_WC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mconcreta.impl.ProjectWcImpl <em>Project Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.ProjectWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getProjectWc()
	 * @generated
	 */
	int PROJECT_WC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__PATH = 1;

	/**
	 * The feature id for the '<em><b>Class Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC__CLASS_DIAGRAMS = 2;

	/**
	 * The number of structural features of the '<em>Project Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mconcreta.impl.ClassDiagramWcImpl <em>Class Diagram Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.ClassDiagramWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getClassDiagramWc()
	 * @generated
	 */
	int CLASS_DIAGRAM_WC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC__PATH = 1;

	/**
	 * The feature id for the '<em><b>List Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC__LIST_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC__RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC__PACKAGES = 4;

	/**
	 * The number of structural features of the '<em>Class Diagram Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_WC_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mconcreta.impl.PackageWcImpl <em>Package Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.PackageWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getPackageWc()
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
	int PACKAGE_WC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__PATH = 1;

	/**
	 * The feature id for the '<em><b>Children Packages Wc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC__CHILDREN_PACKAGES_WC = 2;

	/**
	 * The number of structural features of the '<em>Package Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_WC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mconcreta.impl.ClassifierWcImpl <em>Classifier Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.ClassifierWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getClassifierWc()
	 * @generated
	 */
	int CLASSIFIER_WC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Classifier Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mconcreta.impl.DataTypeFactoryWcImpl <em>Data Type Factory Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.DataTypeFactoryWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getDataTypeFactoryWc()
	 * @generated
	 */
	int DATA_TYPE_FACTORY_WC = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FACTORY_WC__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type Factory Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FACTORY_WC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mconcreta.impl.TypeWcImpl <em>Type Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.TypeWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getTypeWc()
	 * @generated
	 */
	int TYPE_WC = 6;

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
	 * The meta object id for the '{@link mconcreta.impl.ClassWcImpl <em>Class Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.ClassWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getClassWc()
	 * @generated
	 */
	int CLASS_WC = 7;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__ATTRIBUTES = CLASSIFIER_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC__METHODS = CLASSIFIER_WC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WC_FEATURE_COUNT = CLASSIFIER_WC_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mconcreta.impl.RelationWcImpl <em>Relation Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.RelationWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getRelationWc()
	 * @generated
	 */
	int RELATION_WC = 8;

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
	 * The meta object id for the '{@link mconcreta.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.CompositionImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 9;

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
	 * The meta object id for the '{@link mconcreta.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.GeneralizationImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 10;

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
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CHILD = RELATION_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__PARENT = RELATION_WC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATION_WC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mconcreta.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.AggregationImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 11;

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
	 * The meta object id for the '{@link mconcreta.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.AssociationImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 12;

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
	 * The meta object id for the '{@link mconcreta.impl.RelationBinaryImpl <em>Relation Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.RelationBinaryImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getRelationBinary()
	 * @generated
	 */
	int RELATION_BINARY = 13;

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
	 * The meta object id for the '{@link mconcreta.impl.FeatureWcImpl <em>Feature Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.FeatureWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getFeatureWc()
	 * @generated
	 */
	int FEATURE_WC = 14;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__IS_STATIC = 0;

	/**
	 * The feature id for the '<em><b>Acces Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC__ACCES_MODIFY = 1;

	/**
	 * The number of structural features of the '<em>Feature Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_WC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mconcreta.impl.AttributeWcImpl <em>Attribute Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.AttributeWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getAttributeWc()
	 * @generated
	 */
	int ATTRIBUTE_WC = 15;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__NAME = FEATURE_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__TYPE_CLASSIFIER = FEATURE_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC__VALUE = FEATURE_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WC_FEATURE_COUNT = FEATURE_WC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mconcreta.impl.MethodWcImpl <em>Method Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.impl.MethodWcImpl
	 * @see mconcreta.impl.MconcretaPackageImpl#getMethodWc()
	 * @generated
	 */
	int METHOD_WC = 16;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__NAME = FEATURE_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__BODY = FEATURE_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__TYPE = FEATURE_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__IS_QUERY = FEATURE_WC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC__PARAMETERS = FEATURE_WC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_WC_FEATURE_COUNT = FEATURE_WC_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mconcreta.AccesModifyWc <em>Acces Modify Wc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mconcreta.AccesModifyWc
	 * @see mconcreta.impl.MconcretaPackageImpl#getAccesModifyWc()
	 * @generated
	 */
	int ACCES_MODIFY_WC = 17;


	/**
	 * Returns the meta object for class '{@link mconcreta.ModelFactoryConcretaWc <em>Model Factory Concreta Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Concreta Wc</em>'.
	 * @see mconcreta.ModelFactoryConcretaWc
	 * @generated
	 */
	EClass getModelFactoryConcretaWc();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ModelFactoryConcretaWc#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see mconcreta.ModelFactoryConcretaWc#getProjects()
	 * @see #getModelFactoryConcretaWc()
	 * @generated
	 */
	EReference getModelFactoryConcretaWc_Projects();

	/**
	 * Returns the meta object for the containment reference '{@link mconcreta.ModelFactoryConcretaWc#getTypeFactoryWc <em>Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Factory Wc</em>'.
	 * @see mconcreta.ModelFactoryConcretaWc#getTypeFactoryWc()
	 * @see #getModelFactoryConcretaWc()
	 * @generated
	 */
	EReference getModelFactoryConcretaWc_TypeFactoryWc();

	/**
	 * Returns the meta object for class '{@link mconcreta.ProjectWc <em>Project Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Wc</em>'.
	 * @see mconcreta.ProjectWc
	 * @generated
	 */
	EClass getProjectWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ProjectWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.ProjectWc#getName()
	 * @see #getProjectWc()
	 * @generated
	 */
	EAttribute getProjectWc_Name();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ProjectWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see mconcreta.ProjectWc#getPath()
	 * @see #getProjectWc()
	 * @generated
	 */
	EAttribute getProjectWc_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ProjectWc#getClassDiagrams <em>Class Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Diagrams</em>'.
	 * @see mconcreta.ProjectWc#getClassDiagrams()
	 * @see #getProjectWc()
	 * @generated
	 */
	EReference getProjectWc_ClassDiagrams();

	/**
	 * Returns the meta object for class '{@link mconcreta.ClassDiagramWc <em>Class Diagram Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram Wc</em>'.
	 * @see mconcreta.ClassDiagramWc
	 * @generated
	 */
	EClass getClassDiagramWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ClassDiagramWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.ClassDiagramWc#getName()
	 * @see #getClassDiagramWc()
	 * @generated
	 */
	EAttribute getClassDiagramWc_Name();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ClassDiagramWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see mconcreta.ClassDiagramWc#getPath()
	 * @see #getClassDiagramWc()
	 * @generated
	 */
	EAttribute getClassDiagramWc_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ClassDiagramWc#getListClass <em>List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Class</em>'.
	 * @see mconcreta.ClassDiagramWc#getListClass()
	 * @see #getClassDiagramWc()
	 * @generated
	 */
	EReference getClassDiagramWc_ListClass();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ClassDiagramWc#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see mconcreta.ClassDiagramWc#getRelationship()
	 * @see #getClassDiagramWc()
	 * @generated
	 */
	EReference getClassDiagramWc_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ClassDiagramWc#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see mconcreta.ClassDiagramWc#getPackages()
	 * @see #getClassDiagramWc()
	 * @generated
	 */
	EReference getClassDiagramWc_Packages();

	/**
	 * Returns the meta object for class '{@link mconcreta.PackageWc <em>Package Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Wc</em>'.
	 * @see mconcreta.PackageWc
	 * @generated
	 */
	EClass getPackageWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.PackageWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.PackageWc#getName()
	 * @see #getPackageWc()
	 * @generated
	 */
	EAttribute getPackageWc_Name();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.PackageWc#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see mconcreta.PackageWc#getPath()
	 * @see #getPackageWc()
	 * @generated
	 */
	EAttribute getPackageWc_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.PackageWc#getChildrenPackagesWc <em>Children Packages Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Packages Wc</em>'.
	 * @see mconcreta.PackageWc#getChildrenPackagesWc()
	 * @see #getPackageWc()
	 * @generated
	 */
	EReference getPackageWc_ChildrenPackagesWc();

	/**
	 * Returns the meta object for class '{@link mconcreta.ClassifierWc <em>Classifier Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Wc</em>'.
	 * @see mconcreta.ClassifierWc
	 * @generated
	 */
	EClass getClassifierWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ClassifierWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.ClassifierWc#getName()
	 * @see #getClassifierWc()
	 * @generated
	 */
	EAttribute getClassifierWc_Name();

	/**
	 * Returns the meta object for class '{@link mconcreta.DataTypeFactoryWc <em>Data Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Factory Wc</em>'.
	 * @see mconcreta.DataTypeFactoryWc
	 * @generated
	 */
	EClass getDataTypeFactoryWc();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.DataTypeFactoryWc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see mconcreta.DataTypeFactoryWc#getType()
	 * @see #getDataTypeFactoryWc()
	 * @generated
	 */
	EReference getDataTypeFactoryWc_Type();

	/**
	 * Returns the meta object for class '{@link mconcreta.TypeWc <em>Type Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Wc</em>'.
	 * @see mconcreta.TypeWc
	 * @generated
	 */
	EClass getTypeWc();

	/**
	 * Returns the meta object for class '{@link mconcreta.ClassWc <em>Class Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Wc</em>'.
	 * @see mconcreta.ClassWc
	 * @generated
	 */
	EClass getClassWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ClassWc#getPathPackage <em>Path Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Package</em>'.
	 * @see mconcreta.ClassWc#getPathPackage()
	 * @see #getClassWc()
	 * @generated
	 */
	EAttribute getClassWc_PathPackage();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.ClassWc#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mconcreta.ClassWc#isIsAbstract()
	 * @see #getClassWc()
	 * @generated
	 */
	EAttribute getClassWc_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ClassWc#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see mconcreta.ClassWc#getAttributes()
	 * @see #getClassWc()
	 * @generated
	 */
	EReference getClassWc_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.ClassWc#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see mconcreta.ClassWc#getMethods()
	 * @see #getClassWc()
	 * @generated
	 */
	EReference getClassWc_Methods();

	/**
	 * Returns the meta object for class '{@link mconcreta.RelationWc <em>Relation Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Wc</em>'.
	 * @see mconcreta.RelationWc
	 * @generated
	 */
	EClass getRelationWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.RelationWc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mconcreta.RelationWc#getType()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_Type();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.RelationWc#getMultA <em>Mult A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult A</em>'.
	 * @see mconcreta.RelationWc#getMultA()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_MultA();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.RelationWc#getMultB <em>Mult B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult B</em>'.
	 * @see mconcreta.RelationWc#getMultB()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_MultB();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.RelationWc#getRoleA <em>Role A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role A</em>'.
	 * @see mconcreta.RelationWc#getRoleA()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_RoleA();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.RelationWc#getRoleB <em>Role B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role B</em>'.
	 * @see mconcreta.RelationWc#getRoleB()
	 * @see #getRelationWc()
	 * @generated
	 */
	EAttribute getRelationWc_RoleB();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.RelationWc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mconcreta.RelationWc#getSource()
	 * @see #getRelationWc()
	 * @generated
	 */
	EReference getRelationWc_Source();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.RelationWc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mconcreta.RelationWc#getTarget()
	 * @see #getRelationWc()
	 * @generated
	 */
	EReference getRelationWc_Target();

	/**
	 * Returns the meta object for class '{@link mconcreta.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see mconcreta.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link mconcreta.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see mconcreta.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.Generalization#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see mconcreta.Generalization#getChild()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Child();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.Generalization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see mconcreta.Generalization#getParent()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Parent();

	/**
	 * Returns the meta object for class '{@link mconcreta.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see mconcreta.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link mconcreta.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see mconcreta.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link mconcreta.RelationBinary <em>Relation Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Binary</em>'.
	 * @see mconcreta.RelationBinary
	 * @generated
	 */
	EClass getRelationBinary();

	/**
	 * Returns the meta object for class '{@link mconcreta.FeatureWc <em>Feature Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Wc</em>'.
	 * @see mconcreta.FeatureWc
	 * @generated
	 */
	EClass getFeatureWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.FeatureWc#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see mconcreta.FeatureWc#isIsStatic()
	 * @see #getFeatureWc()
	 * @generated
	 */
	EAttribute getFeatureWc_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.FeatureWc#getAccesModify <em>Acces Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acces Modify</em>'.
	 * @see mconcreta.FeatureWc#getAccesModify()
	 * @see #getFeatureWc()
	 * @generated
	 */
	EAttribute getFeatureWc_AccesModify();

	/**
	 * Returns the meta object for class '{@link mconcreta.AttributeWc <em>Attribute Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Wc</em>'.
	 * @see mconcreta.AttributeWc
	 * @generated
	 */
	EClass getAttributeWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.AttributeWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.AttributeWc#getName()
	 * @see #getAttributeWc()
	 * @generated
	 */
	EAttribute getAttributeWc_Name();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Classifier</em>'.
	 * @see mconcreta.AttributeWc#getTypeClassifier()
	 * @see #getAttributeWc()
	 * @generated
	 */
	EReference getAttributeWc_TypeClassifier();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.AttributeWc#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mconcreta.AttributeWc#getValue()
	 * @see #getAttributeWc()
	 * @generated
	 */
	EAttribute getAttributeWc_Value();

	/**
	 * Returns the meta object for class '{@link mconcreta.MethodWc <em>Method Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Wc</em>'.
	 * @see mconcreta.MethodWc
	 * @generated
	 */
	EClass getMethodWc();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.MethodWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mconcreta.MethodWc#getName()
	 * @see #getMethodWc()
	 * @generated
	 */
	EAttribute getMethodWc_Name();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.MethodWc#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see mconcreta.MethodWc#getBody()
	 * @see #getMethodWc()
	 * @generated
	 */
	EAttribute getMethodWc_Body();

	/**
	 * Returns the meta object for the reference '{@link mconcreta.MethodWc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mconcreta.MethodWc#getType()
	 * @see #getMethodWc()
	 * @generated
	 */
	EReference getMethodWc_Type();

	/**
	 * Returns the meta object for the attribute '{@link mconcreta.MethodWc#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see mconcreta.MethodWc#isIsQuery()
	 * @see #getMethodWc()
	 * @generated
	 */
	EAttribute getMethodWc_IsQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link mconcreta.MethodWc#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see mconcreta.MethodWc#getParameters()
	 * @see #getMethodWc()
	 * @generated
	 */
	EReference getMethodWc_Parameters();

	/**
	 * Returns the meta object for enum '{@link mconcreta.AccesModifyWc <em>Acces Modify Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acces Modify Wc</em>'.
	 * @see mconcreta.AccesModifyWc
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
	MconcretaFactory getMconcretaFactory();

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
		 * The meta object literal for the '{@link mconcreta.impl.ModelFactoryConcretaWcImpl <em>Model Factory Concreta Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.ModelFactoryConcretaWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getModelFactoryConcretaWc()
		 * @generated
		 */
		EClass MODEL_FACTORY_CONCRETA_WC = eINSTANCE.getModelFactoryConcretaWc();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_CONCRETA_WC__PROJECTS = eINSTANCE.getModelFactoryConcretaWc_Projects();

		/**
		 * The meta object literal for the '<em><b>Type Factory Wc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_CONCRETA_WC__TYPE_FACTORY_WC = eINSTANCE.getModelFactoryConcretaWc_TypeFactoryWc();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.ProjectWcImpl <em>Project Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.ProjectWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getProjectWc()
		 * @generated
		 */
		EClass PROJECT_WC = eINSTANCE.getProjectWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_WC__NAME = eINSTANCE.getProjectWc_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_WC__PATH = eINSTANCE.getProjectWc_Path();

		/**
		 * The meta object literal for the '<em><b>Class Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_WC__CLASS_DIAGRAMS = eINSTANCE.getProjectWc_ClassDiagrams();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.ClassDiagramWcImpl <em>Class Diagram Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.ClassDiagramWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getClassDiagramWc()
		 * @generated
		 */
		EClass CLASS_DIAGRAM_WC = eINSTANCE.getClassDiagramWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_WC__NAME = eINSTANCE.getClassDiagramWc_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_WC__PATH = eINSTANCE.getClassDiagramWc_Path();

		/**
		 * The meta object literal for the '<em><b>List Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_WC__LIST_CLASS = eINSTANCE.getClassDiagramWc_ListClass();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_WC__RELATIONSHIP = eINSTANCE.getClassDiagramWc_Relationship();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_WC__PACKAGES = eINSTANCE.getClassDiagramWc_Packages();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.PackageWcImpl <em>Package Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.PackageWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getPackageWc()
		 * @generated
		 */
		EClass PACKAGE_WC = eINSTANCE.getPackageWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_WC__NAME = eINSTANCE.getPackageWc_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_WC__PATH = eINSTANCE.getPackageWc_Path();

		/**
		 * The meta object literal for the '<em><b>Children Packages Wc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_WC__CHILDREN_PACKAGES_WC = eINSTANCE.getPackageWc_ChildrenPackagesWc();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.ClassifierWcImpl <em>Classifier Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.ClassifierWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getClassifierWc()
		 * @generated
		 */
		EClass CLASSIFIER_WC = eINSTANCE.getClassifierWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_WC__NAME = eINSTANCE.getClassifierWc_Name();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.DataTypeFactoryWcImpl <em>Data Type Factory Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.DataTypeFactoryWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getDataTypeFactoryWc()
		 * @generated
		 */
		EClass DATA_TYPE_FACTORY_WC = eINSTANCE.getDataTypeFactoryWc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FACTORY_WC__TYPE = eINSTANCE.getDataTypeFactoryWc_Type();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.TypeWcImpl <em>Type Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.TypeWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getTypeWc()
		 * @generated
		 */
		EClass TYPE_WC = eINSTANCE.getTypeWc();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.ClassWcImpl <em>Class Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.ClassWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getClassWc()
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
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WC__ATTRIBUTES = eINSTANCE.getClassWc_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WC__METHODS = eINSTANCE.getClassWc_Methods();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.RelationWcImpl <em>Relation Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.RelationWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getRelationWc()
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
		 * The meta object literal for the '{@link mconcreta.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.CompositionImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.GeneralizationImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__CHILD = eINSTANCE.getGeneralization_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__PARENT = eINSTANCE.getGeneralization_Parent();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.AggregationImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.AssociationImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.RelationBinaryImpl <em>Relation Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.RelationBinaryImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getRelationBinary()
		 * @generated
		 */
		EClass RELATION_BINARY = eINSTANCE.getRelationBinary();

		/**
		 * The meta object literal for the '{@link mconcreta.impl.FeatureWcImpl <em>Feature Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.FeatureWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getFeatureWc()
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
		 * The meta object literal for the '{@link mconcreta.impl.AttributeWcImpl <em>Attribute Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.AttributeWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getAttributeWc()
		 * @generated
		 */
		EClass ATTRIBUTE_WC = eINSTANCE.getAttributeWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_WC__NAME = eINSTANCE.getAttributeWc_Name();

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
		 * The meta object literal for the '{@link mconcreta.impl.MethodWcImpl <em>Method Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.impl.MethodWcImpl
		 * @see mconcreta.impl.MconcretaPackageImpl#getMethodWc()
		 * @generated
		 */
		EClass METHOD_WC = eINSTANCE.getMethodWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_WC__NAME = eINSTANCE.getMethodWc_Name();

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
		 * The meta object literal for the '{@link mconcreta.AccesModifyWc <em>Acces Modify Wc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mconcreta.AccesModifyWc
		 * @see mconcreta.impl.MconcretaPackageImpl#getAccesModifyWc()
		 * @generated
		 */
		EEnum ACCES_MODIFY_WC = eINSTANCE.getAccesModifyWc();

	}

} //MconcretaPackage
