/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.ProjectWc#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.ProjectWc#getPath <em>Path</em>}</li>
 *   <li>{@link mconcreta.ProjectWc#getClassDiagrams <em>Class Diagrams</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getProjectWc()
 * @model
 * @generated
 */
public interface ProjectWc extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mconcreta.MconcretaPackage#getProjectWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mconcreta.ProjectWc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see mconcreta.MconcretaPackage#getProjectWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link mconcreta.ProjectWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Class Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.ClassDiagramWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Diagrams</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getProjectWc_ClassDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDiagramWc> getClassDiagrams();

} // ProjectWc
