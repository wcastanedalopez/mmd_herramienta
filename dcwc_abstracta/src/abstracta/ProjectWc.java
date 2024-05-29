/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ProjectWc#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.ProjectWc#getPackages <em>Packages</em>}</li>
 *   <li>{@link abstracta.ProjectWc#getTypeFactoryWc <em>Type Factory Wc</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getProjectWc()
 * @model
 * @generated
 */
public interface ProjectWc extends NamedElemntWc {
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
	 * @see abstracta.AbstractaPackage#getProjectWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.ProjectWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.PackageWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getProjectWc_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageWc> getPackages();

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
	 * @see abstracta.AbstractaPackage#getProjectWc_TypeFactoryWc()
	 * @model containment="true"
	 * @generated
	 */
	DataTypeFactoryWc getTypeFactoryWc();

	/**
	 * Sets the value of the '{@link abstracta.ProjectWc#getTypeFactoryWc <em>Type Factory Wc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Factory Wc</em>' containment reference.
	 * @see #getTypeFactoryWc()
	 * @generated
	 */
	void setTypeFactoryWc(DataTypeFactoryWc value);

} // ProjectWc
