/**
 */
package dslrelacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Elemnt Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.ModelElemntWc#getName <em>Name</em>}</li>
 *   <li>{@link dslrelacional.ModelElemntWc#get_id <em>id</em>}</li>
 *   <li>{@link dslrelacional.ModelElemntWc#getTypeElementOnModel <em>Type Element On Model</em>}</li>
 * </ul>
 *
 * @see dslrelacional.DslrelacionalPackage#getModelElemntWc()
 * @model abstract="true"
 * @generated
 */
public interface ModelElemntWc extends EObject {
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
	 * @see dslrelacional.DslrelacionalPackage#getModelElemntWc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslrelacional.ModelElemntWc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>id</em>' attribute.
	 * @see #set_id(String)
	 * @see dslrelacional.DslrelacionalPackage#getModelElemntWc__id()
	 * @model
	 * @generated
	 */
	String get_id();

	/**
	 * Sets the value of the '{@link dslrelacional.ModelElemntWc#get_id <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id</em>' attribute.
	 * @see #get_id()
	 * @generated
	 */
	void set_id(String value);

	/**
	 * Returns the value of the '<em><b>Type Element On Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element On Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element On Model</em>' attribute.
	 * @see #setTypeElementOnModel(String)
	 * @see dslrelacional.DslrelacionalPackage#getModelElemntWc_TypeElementOnModel()
	 * @model
	 * @generated
	 */
	String getTypeElementOnModel();

	/**
	 * Sets the value of the '{@link dslrelacional.ModelElemntWc#getTypeElementOnModel <em>Type Element On Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element On Model</em>' attribute.
	 * @see #getTypeElementOnModel()
	 * @generated
	 */
	void setTypeElementOnModel(String value);

} // ModelElemntWc
