/**
 */
package abstracta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Element Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.PackageElementWc#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.PackageElementWc#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getPackageElementWc()
 * @model abstract="true"
 * @generated
 */
public interface PackageElementWc extends NamedElemntWc {
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
	 * @see abstracta.AbstractaPackage#getPackageElementWc_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.PackageElementWc#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' reference.
	 * @see #setNameSpace(PackageWc)
	 * @see abstracta.AbstractaPackage#getPackageElementWc_NameSpace()
	 * @model
	 * @generated
	 */
	PackageWc getNameSpace();

	/**
	 * Sets the value of the '{@link abstracta.PackageElementWc#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(PackageWc value);

} // PackageElementWc
