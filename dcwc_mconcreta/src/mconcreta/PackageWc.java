/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.PackageWc#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.PackageWc#getPath <em>Path</em>}</li>
 *   <li>{@link mconcreta.PackageWc#getChildrenPackagesWc <em>Children Packages Wc</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getPackageWc()
 * @model annotation="gmf.node label='name' rectangle='rounded'"
 * @generated
 */
public interface PackageWc extends EObject {
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
	 * @see mconcreta.MconcretaPackage#getPackageWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mconcreta.PackageWc#getName <em>Name</em>}' attribute.
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
	 * @see mconcreta.MconcretaPackage#getPackageWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link mconcreta.PackageWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Children Packages Wc</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.PackageWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Packages Wc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Packages Wc</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getPackageWc_ChildrenPackagesWc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageWc> getChildrenPackagesWc();

} // PackageWc
