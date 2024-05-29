/**
 */
package dslrelacional.impl;

import dslrelacional.DslrelacionalPackage;
import dslrelacional.ModelElemntWc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Elemnt Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.ModelElemntWcImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslrelacional.impl.ModelElemntWcImpl#get_id <em>id</em>}</li>
 *   <li>{@link dslrelacional.impl.ModelElemntWcImpl#getTypeElementOnModel <em>Type Element On Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElemntWcImpl extends EObjectImpl implements ModelElemntWc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElementOnModel() <em>Type Element On Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElementOnModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ELEMENT_ON_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeElementOnModel() <em>Type Element On Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElementOnModel()
	 * @generated
	 * @ordered
	 */
	protected String typeElementOnModel = TYPE_ELEMENT_ON_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElemntWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.MODEL_ELEMNT_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.MODEL_ELEMNT_WC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id) {
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.MODEL_ELEMNT_WC__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeElementOnModel() {
		return typeElementOnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElementOnModel(String newTypeElementOnModel) {
		String oldTypeElementOnModel = typeElementOnModel;
		typeElementOnModel = newTypeElementOnModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL, oldTypeElementOnModel, typeElementOnModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelacionalPackage.MODEL_ELEMNT_WC__NAME:
				return getName();
			case DslrelacionalPackage.MODEL_ELEMNT_WC__ID:
				return get_id();
			case DslrelacionalPackage.MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL:
				return getTypeElementOnModel();
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
			case DslrelacionalPackage.MODEL_ELEMNT_WC__NAME:
				setName((String)newValue);
				return;
			case DslrelacionalPackage.MODEL_ELEMNT_WC__ID:
				set_id((String)newValue);
				return;
			case DslrelacionalPackage.MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL:
				setTypeElementOnModel((String)newValue);
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
			case DslrelacionalPackage.MODEL_ELEMNT_WC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslrelacionalPackage.MODEL_ELEMNT_WC__ID:
				set_id(_ID_EDEFAULT);
				return;
			case DslrelacionalPackage.MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL:
				setTypeElementOnModel(TYPE_ELEMENT_ON_MODEL_EDEFAULT);
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
			case DslrelacionalPackage.MODEL_ELEMNT_WC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslrelacionalPackage.MODEL_ELEMNT_WC__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case DslrelacionalPackage.MODEL_ELEMNT_WC__TYPE_ELEMENT_ON_MODEL:
				return TYPE_ELEMENT_ON_MODEL_EDEFAULT == null ? typeElementOnModel != null : !TYPE_ELEMENT_ON_MODEL_EDEFAULT.equals(typeElementOnModel);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", _id: ");
		result.append(_id);
		result.append(", typeElementOnModel: ");
		result.append(typeElementOnModel);
		result.append(')');
		return result.toString();
	}

} //ModelElemntWcImpl
