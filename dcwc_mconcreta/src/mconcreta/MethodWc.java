/**
 */
package mconcreta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.MethodWc#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.MethodWc#getBody <em>Body</em>}</li>
 *   <li>{@link mconcreta.MethodWc#getType <em>Type</em>}</li>
 *   <li>{@link mconcreta.MethodWc#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link mconcreta.MethodWc#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getMethodWc()
 * @model annotation="gmf.node label='name' border.color='159,213,209' color='159,213,209' border.width='1' margin='5' label.pattern='{0}  [ {1} ]' layout='list'"
 * @generated
 */
public interface MethodWc extends FeatureWc {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mconcreta.MconcretaPackage#getMethodWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mconcreta.MethodWc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see mconcreta.MconcretaPackage#getMethodWc_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link mconcreta.MethodWc#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ClassifierWc)
	 * @see mconcreta.MconcretaPackage#getMethodWc_Type()
	 * @model
	 * @generated
	 */
	ClassifierWc getType();

	/**
	 * Sets the value of the '{@link mconcreta.MethodWc#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassifierWc value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see mconcreta.MconcretaPackage#getMethodWc_IsQuery()
	 * @model
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link mconcreta.MethodWc#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link mconcreta.AttributeWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see mconcreta.MconcretaPackage#getMethodWc_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeWc> getParameters();

} // MethodWc
