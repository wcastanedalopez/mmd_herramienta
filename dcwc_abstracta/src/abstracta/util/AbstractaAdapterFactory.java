/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
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
	protected AbstractaSwitch<Adapter> modelSwitch =
		new AbstractaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryAbstractaWc(ModelFactoryAbstractaWc object) {
				return createModelFactoryAbstractaWcAdapter();
			}
			@Override
			public Adapter caseNamedElemntWc(NamedElemntWc object) {
				return createNamedElemntWcAdapter();
			}
			@Override
			public Adapter caseProjectWc(ProjectWc object) {
				return createProjectWcAdapter();
			}
			@Override
			public Adapter casePackageWc(PackageWc object) {
				return createPackageWcAdapter();
			}
			@Override
			public Adapter casePackageElementWc(PackageElementWc object) {
				return createPackageElementWcAdapter();
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
	 * Creates a new adapter for an object of class '{@link abstracta.ModelFactoryAbstractaWc <em>Model Factory Abstracta Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ModelFactoryAbstractaWc
	 * @generated
	 */
	public Adapter createModelFactoryAbstractaWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.NamedElemntWc <em>Named Elemnt Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.NamedElemntWc
	 * @generated
	 */
	public Adapter createNamedElemntWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.ProjectWc <em>Project Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ProjectWc
	 * @generated
	 */
	public Adapter createProjectWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.PackageWc <em>Package Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.PackageWc
	 * @generated
	 */
	public Adapter createPackageWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.PackageElementWc <em>Package Element Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.PackageElementWc
	 * @generated
	 */
	public Adapter createPackageElementWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.ClassifierWc <em>Classifier Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ClassifierWc
	 * @generated
	 */
	public Adapter createClassifierWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.DataTypeFactoryWc <em>Data Type Factory Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.DataTypeFactoryWc
	 * @generated
	 */
	public Adapter createDataTypeFactoryWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TypeWc <em>Type Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TypeWc
	 * @generated
	 */
	public Adapter createTypeWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.ClassWc <em>Class Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ClassWc
	 * @generated
	 */
	public Adapter createClassWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.RelationWc <em>Relation Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.RelationWc
	 * @generated
	 */
	public Adapter createRelationWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.RelationBinary <em>Relation Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.RelationBinary
	 * @generated
	 */
	public Adapter createRelationBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.FeatureWc <em>Feature Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.FeatureWc
	 * @generated
	 */
	public Adapter createFeatureWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.AttributeWc <em>Attribute Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.AttributeWc
	 * @generated
	 */
	public Adapter createAttributeWcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MethodWc <em>Method Wc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MethodWc
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

} //AbstractaAdapterFactory
