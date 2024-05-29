/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.Table#getColumn <em>Column</em>}</li>
 *   <li>{@link dslrelacional.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link dslrelacional.Table#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link dslrelacional.Table#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends ModelElemntWc {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelacional.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see dslrelacional.DslrelacionalPackage#getTable_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see dslrelacional.DslrelacionalPackage#getTable_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link dslrelacional.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelacional.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see dslrelacional.DslrelacionalPackage#getTable_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKey();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see dslrelacional.DslrelacionalPackage#getTable_Schema()
	 * @model
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link dslrelacional.Table#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Table
