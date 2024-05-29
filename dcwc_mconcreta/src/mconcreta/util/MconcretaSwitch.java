/**
 */
package mconcreta.util;

import mconcreta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mconcreta.MconcretaPackage
 * @generated
 */
public class MconcretaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MconcretaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MconcretaSwitch() {
		if (modelPackage == null) {
			modelPackage = MconcretaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MconcretaPackage.MODEL_FACTORY_CONCRETA_WC: {
				ModelFactoryConcretaWc modelFactoryConcretaWc = (ModelFactoryConcretaWc)theEObject;
				T result = caseModelFactoryConcretaWc(modelFactoryConcretaWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.PROJECT_WC: {
				ProjectWc projectWc = (ProjectWc)theEObject;
				T result = caseProjectWc(projectWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.CLASS_DIAGRAM_WC: {
				ClassDiagramWc classDiagramWc = (ClassDiagramWc)theEObject;
				T result = caseClassDiagramWc(classDiagramWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.PACKAGE_WC: {
				PackageWc packageWc = (PackageWc)theEObject;
				T result = casePackageWc(packageWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.CLASSIFIER_WC: {
				ClassifierWc classifierWc = (ClassifierWc)theEObject;
				T result = caseClassifierWc(classifierWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.DATA_TYPE_FACTORY_WC: {
				DataTypeFactoryWc dataTypeFactoryWc = (DataTypeFactoryWc)theEObject;
				T result = caseDataTypeFactoryWc(dataTypeFactoryWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.TYPE_WC: {
				TypeWc typeWc = (TypeWc)theEObject;
				T result = caseTypeWc(typeWc);
				if (result == null) result = caseClassifierWc(typeWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.CLASS_WC: {
				ClassWc classWc = (ClassWc)theEObject;
				T result = caseClassWc(classWc);
				if (result == null) result = caseClassifierWc(classWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.RELATION_WC: {
				RelationWc relationWc = (RelationWc)theEObject;
				T result = caseRelationWc(relationWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseRelationWc(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseRelationWc(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseRelationWc(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationWc(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.RELATION_BINARY: {
				RelationBinary relationBinary = (RelationBinary)theEObject;
				T result = caseRelationBinary(relationBinary);
				if (result == null) result = caseRelationWc(relationBinary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.FEATURE_WC: {
				FeatureWc featureWc = (FeatureWc)theEObject;
				T result = caseFeatureWc(featureWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.ATTRIBUTE_WC: {
				AttributeWc attributeWc = (AttributeWc)theEObject;
				T result = caseAttributeWc(attributeWc);
				if (result == null) result = caseFeatureWc(attributeWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MconcretaPackage.METHOD_WC: {
				MethodWc methodWc = (MethodWc)theEObject;
				T result = caseMethodWc(methodWc);
				if (result == null) result = caseFeatureWc(methodWc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Concreta Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Concreta Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryConcretaWc(ModelFactoryConcretaWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectWc(ProjectWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagramWc(ClassDiagramWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageWc(PackageWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierWc(ClassifierWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Factory Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Factory Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeFactoryWc(DataTypeFactoryWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeWc(TypeWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassWc(ClassWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationWc(RelationWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationBinary(RelationBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureWc(FeatureWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeWc(AttributeWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Wc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Wc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodWc(MethodWc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MconcretaSwitch
