/**
 */
package dslrelacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.DataProject#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link dslrelacional.DataProject#getPath <em>Path</em>}</li>
 *   <li>{@link dslrelacional.DataProject#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getDataProject()
 * @model
 * @generated
 */
public interface DataProject extends ModelElemntWc {
	/**
	 * Returns the value of the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puerto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto</em>' attribute.
	 * @see #setPuerto(String)
	 * @see dslrelacional.DslrelacionalPackage#getDataProject_Puerto()
	 * @model
	 * @generated
	 */
	String getPuerto();

	/**
	 * Sets the value of the '{@link dslrelacional.DataProject#getPuerto <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto</em>' attribute.
	 * @see #getPuerto()
	 * @generated
	 */
	void setPuerto(String value);

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
	 * @see dslrelacional.DslrelacionalPackage#getDataProject_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link dslrelacional.DataProject#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link dslrelacional.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see dslrelacional.DslrelacionalPackage#getDataProject_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

} // DataProject
