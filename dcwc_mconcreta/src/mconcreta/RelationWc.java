/**
 */
package mconcreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.RelationWc#getType <em>Type</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getMultA <em>Mult A</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getMultB <em>Mult B</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getRoleA <em>Role A</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getRoleB <em>Role B</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getSource <em>Source</em>}</li>
 *   <li>{@link mconcreta.RelationWc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getRelationWc()
 * @model abstract="true"
 * @generated
 */
public interface RelationWc extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mconcreta.MconcretaPackage#getRelationWc_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Mult A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult A</em>' attribute.
	 * @see #setMultA(String)
	 * @see mconcreta.MconcretaPackage#getRelationWc_MultA()
	 * @model
	 * @generated
	 */
	String getMultA();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getMultA <em>Mult A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult A</em>' attribute.
	 * @see #getMultA()
	 * @generated
	 */
	void setMultA(String value);

	/**
	 * Returns the value of the '<em><b>Mult B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult B</em>' attribute.
	 * @see #setMultB(String)
	 * @see mconcreta.MconcretaPackage#getRelationWc_MultB()
	 * @model
	 * @generated
	 */
	String getMultB();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getMultB <em>Mult B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult B</em>' attribute.
	 * @see #getMultB()
	 * @generated
	 */
	void setMultB(String value);

	/**
	 * Returns the value of the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role A</em>' attribute.
	 * @see #setRoleA(String)
	 * @see mconcreta.MconcretaPackage#getRelationWc_RoleA()
	 * @model
	 * @generated
	 */
	String getRoleA();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getRoleA <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role A</em>' attribute.
	 * @see #getRoleA()
	 * @generated
	 */
	void setRoleA(String value);

	/**
	 * Returns the value of the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role B</em>' attribute.
	 * @see #setRoleB(String)
	 * @see mconcreta.MconcretaPackage#getRelationWc_RoleB()
	 * @model
	 * @generated
	 */
	String getRoleB();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getRoleB <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role B</em>' attribute.
	 * @see #getRoleB()
	 * @generated
	 */
	void setRoleB(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClassWc)
	 * @see mconcreta.MconcretaPackage#getRelationWc_Source()
	 * @model
	 * @generated
	 */
	ClassWc getSource();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClassWc value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ClassWc)
	 * @see mconcreta.MconcretaPackage#getRelationWc_Target()
	 * @model
	 * @generated
	 */
	ClassWc getTarget();

	/**
	 * Sets the value of the '{@link mconcreta.RelationWc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ClassWc value);

} // RelationWc
