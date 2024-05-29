/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Relacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.ModelFactoryRelacional#getListProjects <em>List Projects</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getModelFactoryRelacional()
 * @model
 * @generated
 */
public interface ModelFactoryRelacional extends EObject {
	/**
	 * Returns the value of the '<em><b>List Projects</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelacional.DataProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Projects</em>' containment reference list.
	 * @see dslrelacional.DslrelacionalPackage#getModelFactoryRelacional_ListProjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProject> getListProjects();

} // ModelFactoryRelacional
