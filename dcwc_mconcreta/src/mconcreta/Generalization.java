/**
 */
package mconcreta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.Generalization#getChild <em>Child</em>}</li>
 *   <li>{@link mconcreta.Generalization#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getGeneralization()
 * @model annotation="gmf.link source='source' target='parent' target.decoration='closedarrow' style='solid' width='3'"
 * @generated
 */
public interface Generalization extends RelationWc {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(ClassWc)
	 * @see mconcreta.MconcretaPackage#getGeneralization_Child()
	 * @model
	 * @generated
	 */
	ClassWc getChild();

	/**
	 * Sets the value of the '{@link mconcreta.Generalization#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ClassWc value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ClassWc)
	 * @see mconcreta.MconcretaPackage#getGeneralization_Parent()
	 * @model
	 * @generated
	 */
	ClassWc getParent();

	/**
	 * Sets the value of the '{@link mconcreta.Generalization#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ClassWc value);

} // Generalization
