/**
 */
package dslrelacional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dslrelacional.DslrelacionalFactory
 * @model kind="package"
 * @generated
 */
public interface DslrelacionalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslrelacional";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dslrelacional";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dslrelacional";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslrelacionalPackage eINSTANCE = dslrelacional.impl.DslrelacionalPackageImpl.init();

	/**
	 * The meta object id for the '{@link dslrelacional.impl.ModelFactoryRelacionalImpl <em>Model Factory Relacional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.ModelFactoryRelacionalImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getModelFactoryRelacional()
	 * @generated
	 */
	int MODEL_FACTORY_RELACIONAL = 0;

	/**
	 * The feature id for the '<em><b>List Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELACIONAL__LIST_PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory Relacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELACIONAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.ModelElemntWcImpl <em>Model Elemnt Wc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.ModelElemntWcImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getModelElemntWc()
	 * @generated
	 */
	int MODEL_ELEMNT_WC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMNT_WC__NAME = 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMNT_WC__ID = 1;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Model Elemnt Wc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMNT_WC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.DataProjectImpl <em>Data Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.DataProjectImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getDataProject()
	 * @generated
	 */
	int DATA_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__PUERTO = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__PATH = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT__SCHEMA = MODEL_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROJECT_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.SchemaImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLE = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.TableImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOREIGN_KEY = MODEL_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = MODEL_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.ColumnImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWNER = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRIMARY_KEY = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.PrimaryKeyImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__OWNER = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMN = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__REFERS_OPPOSITE = MODEL_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dslrelacional.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslrelacional.impl.ForeignKeyImpl
	 * @see dslrelacional.impl.DslrelacionalPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = MODEL_ELEMNT_WC__NAME;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ID = MODEL_ELEMNT_WC__ID;

	/**
	 * The feature id for the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TYPE_ELEMENT_ON_MODEL = MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OWNER = MODEL_ELEMNT_WC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERS_TO = MODEL_ELEMNT_WC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__COLUMN = MODEL_ELEMNT_WC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = MODEL_ELEMNT_WC_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link dslrelacional.ModelFactoryRelacional <em>Model Factory Relacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Relacional</em>'.
	 * @see dslrelacional.ModelFactoryRelacional
	 * @generated
	 */
	EClass getModelFactoryRelacional();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelacional.ModelFactoryRelacional#getListProjects <em>List Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Projects</em>'.
	 * @see dslrelacional.ModelFactoryRelacional#getListProjects()
	 * @see #getModelFactoryRelacional()
	 * @generated
	 */
	EReference getModelFactoryRelacional_ListProjects();

	/**
	 * Returns the meta object for class '{@link dslrelacional.ModelElemntWc <em>Model Elemnt Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Elemnt Wc</em>'.
	 * @see dslrelacional.ModelElemntWc
	 * @generated
	 */
	EClass getModelElemntWc();

	/**
	 * Returns the meta object for the attribute '{@link dslrelacional.ModelElemntWc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslrelacional.ModelElemntWc#getName()
	 * @see #getModelElemntWc()
	 * @generated
	 */
	EAttribute getModelElemntWc_Name();

	/**
	 * Returns the meta object for the attribute '{@link dslrelacional.ModelElemntWc#get_id <em>id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id</em>'.
	 * @see dslrelacional.ModelElemntWc#get_id()
	 * @see #getModelElemntWc()
	 * @generated
	 */
	EAttribute getModelElemntWc__id();

	/**
	 * Returns the meta object for the attribute '{@link dslrelacional.ModelElemntWc#getTypeElementOnModel <em>Type Element On Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element On Model</em>'.
	 * @see dslrelacional.ModelElemntWc#getTypeElementOnModel()
	 * @see #getModelElemntWc()
	 * @generated
	 */
	EAttribute getModelElemntWc_TypeElementOnModel();

	/**
	 * Returns the meta object for class '{@link dslrelacional.DataProject <em>Data Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Project</em>'.
	 * @see dslrelacional.DataProject
	 * @generated
	 */
	EClass getDataProject();

	/**
	 * Returns the meta object for the attribute '{@link dslrelacional.DataProject#getPuerto <em>Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto</em>'.
	 * @see dslrelacional.DataProject#getPuerto()
	 * @see #getDataProject()
	 * @generated
	 */
	EAttribute getDataProject_Puerto();

	/**
	 * Returns the meta object for the attribute '{@link dslrelacional.DataProject#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see dslrelacional.DataProject#getPath()
	 * @see #getDataProject()
	 * @generated
	 */
	EAttribute getDataProject_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelacional.DataProject#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see dslrelacional.DataProject#getSchema()
	 * @see #getDataProject()
	 * @generated
	 */
	EReference getDataProject_Schema();

	/**
	 * Returns the meta object for class '{@link dslrelacional.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see dslrelacional.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelacional.Schema#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see dslrelacional.Schema#getTable()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Table();

	/**
	 * Returns the meta object for class '{@link dslrelacional.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see dslrelacional.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelacional.Table#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see dslrelacional.Table#getColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Column();

	/**
	 * Returns the meta object for the containment reference '{@link dslrelacional.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see dslrelacional.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link dslrelacional.Table#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key</em>'.
	 * @see dslrelacional.Table#getForeignKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ForeignKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelacional.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see dslrelacional.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Schema();

	/**
	 * Returns the meta object for class '{@link dslrelacional.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see dslrelacional.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference '{@link dslrelacional.Column#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see dslrelacional.Column#getOwner()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Owner();

	/**
	 * Returns the meta object for the reference list '{@link dslrelacional.Column#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Key</em>'.
	 * @see dslrelacional.Column#getPrimaryKey()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link dslrelacional.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see dslrelacional.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelacional.PrimaryKey#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see dslrelacional.PrimaryKey#getOwner()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Owner();

	/**
	 * Returns the meta object for the reference list '{@link dslrelacional.PrimaryKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see dslrelacional.PrimaryKey#getColumn()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Column();

	/**
	 * Returns the meta object for the reference list '{@link dslrelacional.PrimaryKey#getRefersOpposite <em>Refers Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers Opposite</em>'.
	 * @see dslrelacional.PrimaryKey#getRefersOpposite()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_RefersOpposite();

	/**
	 * Returns the meta object for class '{@link dslrelacional.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see dslrelacional.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link dslrelacional.ForeignKey#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see dslrelacional.ForeignKey#getOwner()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Owner();

	/**
	 * Returns the meta object for the reference '{@link dslrelacional.ForeignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see dslrelacional.ForeignKey#getRefersTo()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RefersTo();

	/**
	 * Returns the meta object for the reference list '{@link dslrelacional.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see dslrelacional.ForeignKey#getColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Column();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslrelacionalFactory getDslrelacionalFactory();

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
		 * The meta object literal for the '{@link dslrelacional.impl.ModelFactoryRelacionalImpl <em>Model Factory Relacional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.ModelFactoryRelacionalImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getModelFactoryRelacional()
		 * @generated
		 */
		EClass MODEL_FACTORY_RELACIONAL = eINSTANCE.getModelFactoryRelacional();

		/**
		 * The meta object literal for the '<em><b>List Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_RELACIONAL__LIST_PROJECTS = eINSTANCE.getModelFactoryRelacional_ListProjects();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.ModelElemntWcImpl <em>Model Elemnt Wc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.ModelElemntWcImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getModelElemntWc()
		 * @generated
		 */
		EClass MODEL_ELEMNT_WC = eINSTANCE.getModelElemntWc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMNT_WC__NAME = eINSTANCE.getModelElemntWc_Name();

		/**
		 * The meta object literal for the '<em><b>id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMNT_WC__ID = eINSTANCE.getModelElemntWc__id();

		/**
		 * The meta object literal for the '<em><b>Type Element On Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL = eINSTANCE.getModelElemntWc_TypeElementOnModel();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.DataProjectImpl <em>Data Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.DataProjectImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getDataProject()
		 * @generated
		 */
		EClass DATA_PROJECT = eINSTANCE.getDataProject();

		/**
		 * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROJECT__PUERTO = eINSTANCE.getDataProject_Puerto();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROJECT__PATH = eINSTANCE.getDataProject_Path();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROJECT__SCHEMA = eINSTANCE.getDataProject_Schema();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.SchemaImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLE = eINSTANCE.getSchema_Table();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.TableImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN = eINSTANCE.getTable_Column();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOREIGN_KEY = eINSTANCE.getTable_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__SCHEMA = eINSTANCE.getTable_Schema();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.ColumnImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__OWNER = eINSTANCE.getColumn_Owner();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__PRIMARY_KEY = eINSTANCE.getColumn_PrimaryKey();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.PrimaryKeyImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__OWNER = eINSTANCE.getPrimaryKey_Owner();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COLUMN = eINSTANCE.getPrimaryKey_Column();

		/**
		 * The meta object literal for the '<em><b>Refers Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__REFERS_OPPOSITE = eINSTANCE.getPrimaryKey_RefersOpposite();

		/**
		 * The meta object literal for the '{@link dslrelacional.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslrelacional.impl.ForeignKeyImpl
		 * @see dslrelacional.impl.DslrelacionalPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__OWNER = eINSTANCE.getForeignKey_Owner();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERS_TO = eINSTANCE.getForeignKey_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

	}

} //DslrelacionalPackage
