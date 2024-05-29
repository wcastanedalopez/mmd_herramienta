/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Concreta Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.ModelFactoryConcretaWc#getProjects <em>Projects</em>}</li>
 *   <li>{@link mconcreta.ModelFactoryConcretaWc#getTypeFactoryWc <em>Type Factory Wc</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getModelFactoryConcretaWc()
 * @model
 * @generated
 */
public interface ModelFactoryConcretaWc extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.ProjectWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getModelFactoryConcretaWc_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectWc> getProjects();

	/**
	 * Returns the value of the '<em><b>Type Factory Wc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Factory Wc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Factory Wc</em>' containment reference.
	 * @see #setTypeFactoryWc(DataTypeFactoryWc)
	 * @see mconcreta.MconcretaPackage#getModelFactoryConcretaWc_TypeFactoryWc()
	 * @model containment="true"
	 * @generated
	 */
	DataTypeFactoryWc getTypeFactoryWc();

	/**
	 * Sets the value of the '{@link mconcreta.ModelFactoryConcretaWc#getTypeFactoryWc <em>Type Factory Wc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Factory Wc</em>' containment reference.
	 * @see #getTypeFactoryWc()
	 * @generated
	 */
	void setTypeFactoryWc(DataTypeFactoryWc value);

} // ModelFactoryConcretaWc
