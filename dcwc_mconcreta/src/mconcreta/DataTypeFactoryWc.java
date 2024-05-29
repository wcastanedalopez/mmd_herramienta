/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Factory Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.DataTypeFactoryWc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getDataTypeFactoryWc()
 * @model
 * @generated
 */
public interface DataTypeFactoryWc extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.TypeWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getDataTypeFactoryWc_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeWc> getType();

} // DataTypeFactoryWc
