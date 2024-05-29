/**
 */
package abstracta.impl;

import abstracta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AbstractaFactoryImpl extends EFactoryImpl implements AbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractaFactory init() {
		try {
			AbstractaFactory theAbstractaFactory = (AbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractaPackage.eNS_URI);
			if (theAbstractaFactory != null) {
				return theAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactoryImpl() {
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC: return createModelFactoryAbstractaWc();
			case AbstractaPackage.PROJECT_WC: return createProjectWc();
			case AbstractaPackage.PACKAGE_WC: return createPackageWc();
			case AbstractaPackage.DATA_TYPE_FACTORY_WC: return createDataTypeFactoryWc();
			case AbstractaPackage.TYPE_WC: return createTypeWc();
			case AbstractaPackage.CLASS_WC: return createClassWc();
			case AbstractaPackage.COMPOSITION: return createComposition();
			case AbstractaPackage.GENERALIZATION: return createGeneralization();
			case AbstractaPackage.AGGREGATION: return createAggregation();
			case AbstractaPackage.ASSOCIATION: return createAssociation();
			case AbstractaPackage.RELATION_BINARY: return createRelationBinary();
			case AbstractaPackage.ATTRIBUTE_WC: return createAttributeWc();
			case AbstractaPackage.METHOD_WC: return createMethodWc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AbstractaPackage.ACCES_MODIFY_WC:
				return createAccesModifyWcFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AbstractaPackage.ACCES_MODIFY_WC:
				return convertAccesModifyWcToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryAbstractaWc createModelFactoryAbstractaWc() {
		ModelFactoryAbstractaWcImpl modelFactoryAbstractaWc = new ModelFactoryAbstractaWcImpl();
		return modelFactoryAbstractaWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectWc createProjectWc() {
		ProjectWcImpl projectWc = new ProjectWcImpl();
		return projectWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageWc createPackageWc() {
		PackageWcImpl packageWc = new PackageWcImpl();
		return packageWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeFactoryWc createDataTypeFactoryWc() {
		DataTypeFactoryWcImpl dataTypeFactoryWc = new DataTypeFactoryWcImpl();
		return dataTypeFactoryWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeWc createTypeWc() {
		TypeWcImpl typeWc = new TypeWcImpl();
		return typeWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc createClassWc() {
		ClassWcImpl classWc = new ClassWcImpl();
		return classWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationBinary createRelationBinary() {
		RelationBinaryImpl relationBinary = new RelationBinaryImpl();
		return relationBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeWc createAttributeWc() {
		AttributeWcImpl attributeWc = new AttributeWcImpl();
		return attributeWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodWc createMethodWc() {
		MethodWcImpl methodWc = new MethodWcImpl();
		return methodWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesModifyWc createAccesModifyWcFromString(EDataType eDataType, String initialValue) {
		AccesModifyWc result = AccesModifyWc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccesModifyWcToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaPackage getAbstractaPackage() {
		return (AbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractaPackage getPackage() {
		return AbstractaPackage.eINSTANCE;
	}

} //AbstractaFactoryImpl
