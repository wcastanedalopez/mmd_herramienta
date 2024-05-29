/**
 */
package mconcreta.impl;

import java.util.Collection;

import mconcreta.AttributeWc;
import mconcreta.ClassifierWc;
import mconcreta.MconcretaPackage;
import mconcreta.MethodWc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.impl.MethodWcImpl#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.impl.MethodWcImpl#getBody <em>Body</em>}</li>
 *   <li>{@link mconcreta.impl.MethodWcImpl#getType <em>Type</em>}</li>
 *   <li>{@link mconcreta.impl.MethodWcImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link mconcreta.impl.MethodWcImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodWcImpl extends FeatureWcImpl implements MethodWc {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassifierWc type;

	/**
	 * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeWc> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MconcretaPackage.Literals.METHOD_WC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.METHOD_WC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.METHOD_WC__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierWc getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ClassifierWc)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MconcretaPackage.METHOD_WC__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierWc basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassifierWc newType) {
		ClassifierWc oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.METHOD_WC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.METHOD_WC__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeWc> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<AttributeWc>(AttributeWc.class, this, MconcretaPackage.METHOD_WC__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MconcretaPackage.METHOD_WC__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MconcretaPackage.METHOD_WC__NAME:
				return getName();
			case MconcretaPackage.METHOD_WC__BODY:
				return getBody();
			case MconcretaPackage.METHOD_WC__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MconcretaPackage.METHOD_WC__IS_QUERY:
				return isIsQuery();
			case MconcretaPackage.METHOD_WC__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MconcretaPackage.METHOD_WC__NAME:
				setName((String)newValue);
				return;
			case MconcretaPackage.METHOD_WC__BODY:
				setBody((String)newValue);
				return;
			case MconcretaPackage.METHOD_WC__TYPE:
				setType((ClassifierWc)newValue);
				return;
			case MconcretaPackage.METHOD_WC__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case MconcretaPackage.METHOD_WC__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends AttributeWc>)newValue);
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
			case MconcretaPackage.METHOD_WC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MconcretaPackage.METHOD_WC__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case MconcretaPackage.METHOD_WC__TYPE:
				setType((ClassifierWc)null);
				return;
			case MconcretaPackage.METHOD_WC__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case MconcretaPackage.METHOD_WC__PARAMETERS:
				getParameters().clear();
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
			case MconcretaPackage.METHOD_WC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MconcretaPackage.METHOD_WC__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case MconcretaPackage.METHOD_WC__TYPE:
				return type != null;
			case MconcretaPackage.METHOD_WC__IS_QUERY:
				return isQuery != IS_QUERY_EDEFAULT;
			case MconcretaPackage.METHOD_WC__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(", body: ");
		result.append(body);
		result.append(", isQuery: ");
		result.append(isQuery);
		result.append(')');
		return result.toString();
	}

} //MethodWcImpl
