/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.ClassDiagramWc#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.ClassDiagramWc#getPath <em>Path</em>}</li>
 *   <li>{@link mconcreta.ClassDiagramWc#getListClass <em>List Class</em>}</li>
 *   <li>{@link mconcreta.ClassDiagramWc#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link mconcreta.ClassDiagramWc#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getClassDiagramWc()
 * @model
 * @generated
 */
public interface ClassDiagramWc extends EObject {
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
	 * @see mconcreta.MconcretaPackage#getClassDiagramWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mconcreta.ClassDiagramWc#getName <em>Name</em>}' attribute.
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
	 * @see mconcreta.MconcretaPackage#getClassDiagramWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link mconcreta.ClassDiagramWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>List Class</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.ClassWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Class</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getClassDiagramWc_ListClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassWc> getListClass();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.RelationWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getClassDiagramWc_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationWc> getRelationship();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.PackageWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getClassDiagramWc_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageWc> getPackages();

} // ClassDiagramWc
