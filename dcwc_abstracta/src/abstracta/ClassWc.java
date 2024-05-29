/**
 */
package abstracta;

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
 *   <li>{@link abstracta.ClassWc#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link abstracta.ClassWc#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.ClassWc#getFeatures <em>Features</em>}</li>
 *   <li>{@link abstracta.ClassWc#getListRelationshipOut <em>List Relationship Out</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getClassWc()
 * @model
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
	 * @see abstracta.AbstractaPackage#getClassWc_PathPackage()
	 * @model
	 * @generated
	 */
	String getPathPackage();

	/**
	 * Sets the value of the '{@link abstracta.ClassWc#getPathPackage <em>Path Package</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getClassWc_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link abstracta.ClassWc#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.FeatureWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClassWc_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureWc> getFeatures();

	/**
	 * Returns the value of the '<em><b>List Relationship Out</b></em>' reference list.
	 * The list contents are of type {@link abstracta.RelationWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Relationship Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relationship Out</em>' reference list.
	 * @see abstracta.AbstractaPackage#getClassWc_ListRelationshipOut()
	 * @model
	 * @generated
	 */
	EList<RelationWc> getListRelationshipOut();

} // ClassWc
