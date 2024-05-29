/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.ForeignKey#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.ForeignKey#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link dslrelacional.ForeignKey#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends ModelElemntWc {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Table)
	 * @see dslrelacional.DslrelacionalPackage#getForeignKey_Owner()
	 * @model
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link dslrelacional.ForeignKey#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(PrimaryKey)
	 * @see dslrelacional.DslrelacionalPackage#getForeignKey_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getRefersTo();

	/**
	 * Sets the value of the '{@link dslrelacional.ForeignKey#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link dslrelacional.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see dslrelacional.DslrelacionalPackage#getForeignKey_Column()
	 * @model
	 * @generated
	 */
	EList<Column> getColumn();

} // ForeignKey
