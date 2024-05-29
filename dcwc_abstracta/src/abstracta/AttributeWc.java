/**
 */
package abstracta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}</li>
 *   <li>{@link abstracta.AttributeWc#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getAttributeWc()
 * @model
 * @generated
 */
public interface AttributeWc extends FeatureWc {
	/**
	 * Returns the value of the '<em><b>Type Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Classifier</em>' reference.
	 * @see #setTypeClassifier(ClassifierWc)
	 * @see abstracta.AbstractaPackage#getAttributeWc_TypeClassifier()
	 * @model
	 * @generated
	 */
	ClassifierWc getTypeClassifier();

	/**
	 * Sets the value of the '{@link abstracta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Classifier</em>' reference.
	 * @see #getTypeClassifier()
	 * @generated
	 */
	void setTypeClassifier(ClassifierWc value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see abstracta.AbstractaPackage#getAttributeWc_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link abstracta.AttributeWc#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeWc
