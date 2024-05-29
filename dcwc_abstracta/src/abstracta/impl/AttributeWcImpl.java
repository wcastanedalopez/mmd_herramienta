/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AttributeWc;
import abstracta.ClassifierWc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.AttributeWcImpl#getTypeClassifier <em>Type Classifier</em>}</li>
 *   <li>{@link abstracta.impl.AttributeWcImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeWcImpl extends FeatureWcImpl implements AttributeWc {
	/**
	 * The cached value of the '{@link #getTypeClassifier() <em>Type Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClassifier()
	 * @generated
	 * @ordered
	 */
	protected ClassifierWc typeClassifier;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.ATTRIBUTE_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierWc getTypeClassifier() {
		if (typeClassifier != null && typeClassifier.eIsProxy()) {
			InternalEObject oldTypeClassifier = (InternalEObject)typeClassifier;
			typeClassifier = (ClassifierWc)eResolveProxy(oldTypeClassifier);
			if (typeClassifier != oldTypeClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER, oldTypeClassifier, typeClassifier));
			}
		}
		return typeClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierWc basicGetTypeClassifier() {
		return typeClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeClassifier(ClassifierWc newTypeClassifier) {
		ClassifierWc oldTypeClassifier = typeClassifier;
		typeClassifier = newTypeClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER, oldTypeClassifier, typeClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTE_WC__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER:
				if (resolve) return getTypeClassifier();
				return basicGetTypeClassifier();
			case AbstractaPackage.ATTRIBUTE_WC__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER:
				setTypeClassifier((ClassifierWc)newValue);
				return;
			case AbstractaPackage.ATTRIBUTE_WC__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER:
				setTypeClassifier((ClassifierWc)null);
				return;
			case AbstractaPackage.ATTRIBUTE_WC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.ATTRIBUTE_WC__TYPE_CLASSIFIER:
				return typeClassifier != null;
			case AbstractaPackage.ATTRIBUTE_WC__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeWcImpl
