/**
 */
package mconcreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.FeatureWc#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link mconcreta.FeatureWc#getAccesModify <em>Acces Modify</em>}</li>
 * </ul>
 *
 * @see mconcreta.MconcretaPackage#getFeatureWc()
 * @model abstract="true"
 * @generated
 */
public interface FeatureWc extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see mconcreta.MconcretaPackage#getFeatureWc_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link mconcreta.FeatureWc#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Acces Modify</b></em>' attribute.
	 * The literals are from the enumeration {@link mconcreta.AccesModifyWc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acces Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces Modify</em>' attribute.
	 * @see mconcreta.AccesModifyWc
	 * @see #setAccesModify(AccesModifyWc)
	 * @see mconcreta.MconcretaPackage#getFeatureWc_AccesModify()
	 * @model
	 * @generated
	 */
	AccesModifyWc getAccesModify();

	/**
	 * Sets the value of the '{@link mconcreta.FeatureWc#getAccesModify <em>Acces Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces Modify</em>' attribute.
	 * @see mconcreta.AccesModifyWc
	 * @see #getAccesModify()
	 * @generated
	 */
	void setAccesModify(AccesModifyWc value);

} // FeatureWc
