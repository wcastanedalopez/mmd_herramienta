/**
 */
package abstracta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.FeatureWc#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link abstracta.FeatureWc#getAccesModify <em>Acces Modify</em>}</li>
 *   <li>{@link abstracta.FeatureWc#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getFeatureWc()
 * @model abstract="true"
 * @generated
 */
public interface FeatureWc extends NamedElemntWc {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see abstracta.AbstractaPackage#getFeatureWc_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link abstracta.FeatureWc#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Acces Modify</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.AccesModifyWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acces Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces Modify</em>' attribute.
	 * @see abstracta.AccesModifyWc
	 * @see #setAccesModify(AccesModifyWc)
	 * @see abstracta.AbstractaPackage#getFeatureWc_AccesModify()
	 * @model
	 * @generated
	 */
	AccesModifyWc getAccesModify();

	/**
	 * Sets the value of the '{@link abstracta.FeatureWc#getAccesModify <em>Acces Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces Modify</em>' attribute.
	 * @see abstracta.AccesModifyWc
	 * @see #getAccesModify()
	 * @generated
	 */
	void setAccesModify(AccesModifyWc value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ClassWc)
	 * @see abstracta.AbstractaPackage#getFeatureWc_Owner()
	 * @model
	 * @generated
	 */
	ClassWc getOwner();

	/**
	 * Sets the value of the '{@link abstracta.FeatureWc#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ClassWc value);

} // FeatureWc
