/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.ClassWc#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link mconcreta.ClassWc#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mconcreta.ClassWc#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mconcreta.ClassWc#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getClassWc()
 * @model annotation="gmf.node label='name' rectangle='rounded' color='255,224,189' border.width='2' margin='10'"
 * @generated
 */
public interface ClassWc extends ClassifierWc {
	/**
	 * Returns the value of the '<em><b>Path Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Package</em>' attribute.
	 * @see #setPathPackage(String)
	 * @see mconcreta.MconcretaPackage#getClassWc_PathPackage()
	 * @model
	 * @generated
	 */
	String getPathPackage();

	/**
	 * Sets the value of the '{@link mconcreta.ClassWc#getPathPackage <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Package</em>' attribute.
	 * @see #getPathPackage()
	 * @generated
	 */
	void setPathPackage(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see mconcreta.MconcretaPackage#getClassWc_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mconcreta.ClassWc#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.AttributeWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getClassWc_Attributes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true' margin='5' spacing='10'"
	 * @generated
	 */
	EList<AttributeWc> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.MethodWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getClassWc_Methods()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true' margin='5' spacing='10'"
	 * @generated
	 */
	EList<MethodWc> getMethods();

} // ClassWc
