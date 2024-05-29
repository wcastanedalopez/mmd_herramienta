/**
 */
package mconcreta.impl;

import mconcreta.*;

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
public class MconcretaFactoryImpl extends EFactoryImpl implements MconcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MconcretaFactory init() {
		try {
			MconcretaFactory theMconcretaFactory = (MconcretaFactory)EPackage.Registry.INSTANCE.getEFactory(MconcretaPackage.eNS_URI);
			if (theMconcretaFactory != null) {
				return theMconcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MconcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MconcretaFactoryImpl() {
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
			case MconcretaPackage.MODEL_FACTORY_CONCRETA_WC: return createModelFactoryConcretaWc();
			case MconcretaPackage.PROJECT_WC: return createProjectWc();
			case MconcretaPackage.CLASS_DIAGRAM_WC: return createClassDiagramWc();
			case MconcretaPackage.PACKAGE_WC: return createPackageWc();
			case MconcretaPackage.DATA_TYPE_FACTORY_WC: return createDataTypeFactoryWc();
			case MconcretaPackage.TYPE_WC: return createTypeWc();
			case MconcretaPackage.CLASS_WC: return createClassWc();
			case MconcretaPackage.COMPOSITION: return createComposition();
			case MconcretaPackage.GENERALIZATION: return createGeneralization();
			case MconcretaPackage.AGGREGATION: return createAggregation();
			case MconcretaPackage.ASSOCIATION: return createAssociation();
			case MconcretaPackage.RELATION_BINARY: return createRelationBinary();
			case MconcretaPackage.ATTRIBUTE_WC: return createAttributeWc();
			case MconcretaPackage.METHOD_WC: return createMethodWc();
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
			case MconcretaPackage.ACCES_MODIFY_WC:
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
			case MconcretaPackage.ACCES_MODIFY_WC:
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
	public ModelFactoryConcretaWc createModelFactoryConcretaWc() {
		ModelFactoryConcretaWcImpl modelFactoryConcretaWc = new ModelFactoryConcretaWcImpl();
		return modelFactoryConcretaWc;
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
	public ClassDiagramWc createClassDiagramWc() {
		ClassDiagramWcImpl classDiagramWc = new ClassDiagramWcImpl();
		return classDiagramWc;
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
	public MconcretaPackage getMconcretaPackage() {
		return (MconcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MconcretaPackage getPackage() {
		return MconcretaPackage.eINSTANCE;
	}

} //MconcretaFactoryImpl
