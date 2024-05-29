/**
 */
package mconcreta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.AttributeWc#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}</li>
 *   <li>{@link mconcreta.AttributeWc#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getAttributeWc()
 * @model annotation="gmf.node label='name' border.color='189,236,182' color='189,236,182' border.width='1' margin='5' label.pattern='{0}  [ {1} ]' layout='list'"
 * @generated
 */
public interface AttributeWc extends FeatureWc {
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
	 * @see mconcreta.MconcretaPackage#getAttributeWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mconcreta.AttributeWc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mconcreta.MconcretaPackage#getAttributeWc_TypeClassifier()
	 * @model
	 * @generated
	 */
	ClassifierWc getTypeClassifier();

	/**
	 * Sets the value of the '{@link mconcreta.AttributeWc#getTypeClassifier <em>Type Classifier</em>}' reference.
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
	 * @see mconcreta.MconcretaPackage#getAttributeWc_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mconcreta.AttributeWc#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeWc
