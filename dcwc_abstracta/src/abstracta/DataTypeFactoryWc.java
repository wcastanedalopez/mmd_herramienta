/**
 */
package abstracta;

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
 *   <li>{@link abstracta.DataTypeFactoryWc#getListTypesWc <em>List Types Wc</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getDataTypeFactoryWc()
 * @model
 * @generated
 */
public interface DataTypeFactoryWc extends EObject {
	/**
	 * Returns the value of the '<em><b>List Types Wc</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TypeWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Types Wc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Types Wc</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getDataTypeFactoryWc_ListTypesWc()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeWc> getListTypesWc();

} // DataTypeFactoryWc
