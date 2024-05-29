/**
 */
package dslrelacional.impl;

import dslrelacional.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslrelacionalFactoryImpl extends EFactoryImpl implements DslrelacionalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslrelacionalFactory init() {
		try {
			DslrelacionalFactory theDslrelacionalFactory = (DslrelacionalFactory)EPackage.Registry.INSTANCE.getEFactory(DslrelacionalPackage.eNS_URI);
			if (theDslrelacionalFactory != null) {
				return theDslrelacionalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslrelacionalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslrelacionalFactoryImpl() {
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
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL: return createModelFactoryRelacional();
			case DslrelacionalPackage.DATA_PROJECT: return createDataProject();
			case DslrelacionalPackage.SCHEMA: return createSchema();
			case DslrelacionalPackage.TABLE: return createTable();
			case DslrelacionalPackage.COLUMN: return createColumn();
			case DslrelacionalPackage.PRIMARY_KEY: return createPrimaryKey();
			case DslrelacionalPackage.FOREIGN_KEY: return createForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryRelacional createModelFactoryRelacional() {
		ModelFactoryRelacionalImpl modelFactoryRelacional = new ModelFactoryRelacionalImpl();
		return modelFactoryRelacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProject createDataProject() {
		DataProjectImpl dataProject = new DataProjectImpl();
		return dataProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslrelacionalPackage getDslrelacionalPackage() {
		return (DslrelacionalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslrelacionalPackage getPackage() {
		return DslrelacionalPackage.eINSTANCE;
	}

} //DslrelacionalFactoryImpl
