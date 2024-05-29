/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.Column#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.Column#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends ModelElemntWc {
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
	 * @see dslrelacional.DslrelacionalPackage#getColumn_Owner()
	 * @model
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link dslrelacional.Column#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference list.
	 * The list contents are of type {@link dslrelacional.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference list.
	 * @see dslrelacional.DslrelacionalPackage#getColumn_PrimaryKey()
	 * @model
	 * @generated
	 */
	EList<PrimaryKey> getPrimaryKey();

} // Column
