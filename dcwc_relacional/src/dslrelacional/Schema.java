/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.Schema#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends ModelElemntWc {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelacional.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see dslrelacional.DslrelacionalPackage#getSchema_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // Schema
