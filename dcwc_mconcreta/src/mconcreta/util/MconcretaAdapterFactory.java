/**
 */
package mconcreta.util;

import mconcreta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mconcreta.MconcretaPackage
 * @generated
 */
public class MconcretaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MconcretaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MconcretaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MconcretaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MconcretaSwitch<Adapter> modelSwitch =
		new MconcretaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryConcretaWc(ModelFactoryConcretaWc object) {
				return createModelFactoryConcretaWcAdapter();
			}
			@Override
			public Adapter caseProjectWc(ProjectWc object) {
				return createProjectWcAdapter();
			}
			@Override
			public Adapter caseClassDiagramWc(ClassDiagramWc object) {
				return createClassDiagramWcAdapter();
			}
			@Override
			public Adapter casePackageWc(PackageWc object) {
				return createPackageWcAdapter();
			}
			@Override
			public Adapter caseClassifierWc(ClassifierWc object) {
				return createClassifierWcAdapter();
			}
			@Override
			public Adapter caseDataTypeFactoryWc(DataTypeFactoryWc object) {
				return createDataTypeFactoryWcAdapter();
			}
			@Override
			public Adapter caseTypeWc(TypeWc object) {
				return createTypeWcAdapter();
			}
			@Override
			public Adapter caseClassWc(ClassWc object) {
				return createClassWcAdapter();
			}
			@Override
			public Adapter caseRelationWc(RelationWc object) {
				return createRelationWcAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseRelationBinary(RelationBinary object) {
				return createRelationBinaryAdapter();
			}
			@Override
			public Adapter caseFeatureWc(FeatureWc object) {
				return createFeatureWcAdapter();
			}
			@Override
			public Adapter caseAttributeWc(AttributeWc object) {
				return createAttributeWcAdapter();
			}
			@Override
			public Adapter caseMethodWc(MethodWc object) {
				return createMethodWcAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.ModelFactoryConcretaWc <em>Model Factory Concreta Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.ModelFactoryConcretaWc
	 * @generated
	 */
	public Adapter createModelFactoryConcretaWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.ProjectWc <em>Project Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.ProjectWc
	 * @generated
	 */
	public Adapter createProjectWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.ClassDiagramWc <em>Class Diagram Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.ClassDiagramWc
	 * @generated
	 */
	public Adapter createClassDiagramWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.PackageWc <em>Package Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.PackageWc
	 * @generated
	 */
	public Adapter createPackageWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.ClassifierWc <em>Classifier Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.ClassifierWc
	 * @generated
	 */
	public Adapter createClassifierWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.DataTypeFactoryWc <em>Data Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.DataTypeFactoryWc
	 * @generated
	 */
	public Adapter createDataTypeFactoryWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.TypeWc <em>Type Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.TypeWc
	 * @generated
	 */
	public Adapter createTypeWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.ClassWc <em>Class Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.ClassWc
	 * @generated
	 */
	public Adapter createClassWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.RelationWc <em>Relation Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.RelationWc
	 * @generated
	 */
	public Adapter createRelationWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.RelationBinary <em>Relation Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.RelationBinary
	 * @generated
	 */
	public Adapter createRelationBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.FeatureWc <em>Feature Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.FeatureWc
	 * @generated
	 */
	public Adapter createFeatureWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.AttributeWc <em>Attribute Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.AttributeWc
	 * @generated
	 */
	public Adapter createAttributeWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mconcreta.MethodWc <em>Method Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mconcreta.MethodWc
	 * @generated
	 */
	public Adapter createMethodWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MconcretaAdapterFactory
