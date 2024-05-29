/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.PackageWc#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.PackageWc#getListsClassWc <em>Lists Class Wc</em>}</li>
 *   <li>{@link abstracta.PackageWc#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link abstracta.PackageWc#getChildrenPackagesWc <em>Children Packages Wc</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getPackageWc()
 * @model
 * @generated
 */
public interface PackageWc extends NamedElemntWc {
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
	 * @see abstracta.AbstractaPackage#getPackageWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.PackageWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lists Class Wc</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.ClassWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lists Class Wc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lists Class Wc</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getPackageWc_ListsClassWc()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassWc> getListsClassWc();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.RelationWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getPackageWc_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationWc> getRelationship();

	/**
	 * Returns the value of the '<em><b>Children Packages Wc</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.PackageWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Packages Wc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Packages Wc</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getPackageWc_ChildrenPackagesWc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageWc> getChildrenPackagesWc();

} // PackageWc
