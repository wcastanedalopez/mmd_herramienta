/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.PrimaryKey#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.PrimaryKey#getColumn <em>Column</em>}</li>
 *   <li>{@link dslrelacional.PrimaryKey#getRefersOpposite <em>Refers Opposite</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends ModelElemntWc {
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
	 * @see dslrelacional.DslrelacionalPackage#getPrimaryKey_Owner()
	 * @model
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link dslrelacional.PrimaryKey#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

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
	 * @see dslrelacional.DslrelacionalPackage#getPrimaryKey_Column()
	 * @model
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Refers Opposite</b></em>' reference list.
	 * The list contents are of type {@link dslrelacional.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers Opposite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers Opposite</em>' reference list.
	 * @see dslrelacional.DslrelacionalPackage#getPrimaryKey_RefersOpposite()
	 * @model
	 * @generated
	 */
	EList<ForeignKey> getRefersOpposite();

} // PrimaryKey
