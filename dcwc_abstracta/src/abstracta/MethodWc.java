/**
 */
package abstracta;

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
 *   <li>{@link abstracta.MethodWc#getBody <em>Body</em>}</li>
 *   <li>{@link abstracta.MethodWc#getType <em>Type</em>}</li>
 *   <li>{@link abstracta.MethodWc#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link abstracta.MethodWc#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMethodWc()
 * @model
 * @generated
 */
public interface MethodWc extends FeatureWc {
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
	 * @see abstracta.AbstractaPackage#getMethodWc_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link abstracta.MethodWc#getBody <em>Body</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMethodWc_Type()
	 * @model
	 * @generated
	 */
	ClassifierWc getType();

	/**
	 * Sets the value of the '{@link abstracta.MethodWc#getType <em>Type</em>}' reference.
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
	 * @see abstracta.AbstractaPackage#getMethodWc_IsQuery()
	 * @model
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link abstracta.MethodWc#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.AttributeWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMethodWc_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeWc> getParameters();

} // MethodWc
