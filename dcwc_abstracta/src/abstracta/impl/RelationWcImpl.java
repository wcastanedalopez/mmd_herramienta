/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ClassWc;
import abstracta.RelationWc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.RelationWcImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getMultA <em>Mult A</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getMultB <em>Mult B</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getRoleA <em>Role A</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getRoleB <em>Role B</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.impl.RelationWcImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationWcImpl extends EObjectImpl implements RelationWc {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultA() <em>Mult A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultA() <em>Mult A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultA()
	 * @generated
	 * @ordered
	 */
	protected String multA = MULT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultB() <em>Mult B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultB()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultB() <em>Mult B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultB()
	 * @generated
	 * @ordered
	 */
	protected String multB = MULT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected String roleA = ROLE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected String roleB = ROLE_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClassWc source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassWc target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.RELATION_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultA() {
		return multA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultA(String newMultA) {
		String oldMultA = multA;
		multA = newMultA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__MULT_A, oldMultA, multA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultB() {
		return multB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultB(String newMultB) {
		String oldMultB = multB;
		multB = newMultB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__MULT_B, oldMultB, multB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleA() {
		return roleA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleA(String newRoleA) {
		String oldRoleA = roleA;
		roleA = newRoleA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__ROLE_A, oldRoleA, roleA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleB() {
		return roleB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleB(String newRoleB) {
		String oldRoleB = roleB;
		roleB = newRoleB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__ROLE_B, oldRoleB, roleB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClassWc)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELATION_WC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ClassWc newSource) {
		ClassWc oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClassWc)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELATION_WC__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ClassWc newTarget) {
		ClassWc oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATION_WC__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.RELATION_WC__TYPE:
				return getType();
			case AbstractaPackage.RELATION_WC__MULT_A:
				return getMultA();
			case AbstractaPackage.RELATION_WC__MULT_B:
				return getMultB();
			case AbstractaPackage.RELATION_WC__ROLE_A:
				return getRoleA();
			case AbstractaPackage.RELATION_WC__ROLE_B:
				return getRoleB();
			case AbstractaPackage.RELATION_WC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AbstractaPackage.RELATION_WC__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case AbstractaPackage.RELATION_WC__TYPE:
				setType((String)newValue);
				return;
			case AbstractaPackage.RELATION_WC__MULT_A:
				setMultA((String)newValue);
				return;
			case AbstractaPackage.RELATION_WC__MULT_B:
				setMultB((String)newValue);
				return;
			case AbstractaPackage.RELATION_WC__ROLE_A:
				setRoleA((String)newValue);
				return;
			case AbstractaPackage.RELATION_WC__ROLE_B:
				setRoleB((String)newValue);
				return;
			case AbstractaPackage.RELATION_WC__SOURCE:
				setSource((ClassWc)newValue);
				return;
			case AbstractaPackage.RELATION_WC__TARGET:
				setTarget((ClassWc)newValue);
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
			case AbstractaPackage.RELATION_WC__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbstractaPackage.RELATION_WC__MULT_A:
				setMultA(MULT_A_EDEFAULT);
				return;
			case AbstractaPackage.RELATION_WC__MULT_B:
				setMultB(MULT_B_EDEFAULT);
				return;
			case AbstractaPackage.RELATION_WC__ROLE_A:
				setRoleA(ROLE_A_EDEFAULT);
				return;
			case AbstractaPackage.RELATION_WC__ROLE_B:
				setRoleB(ROLE_B_EDEFAULT);
				return;
			case AbstractaPackage.RELATION_WC__SOURCE:
				setSource((ClassWc)null);
				return;
			case AbstractaPackage.RELATION_WC__TARGET:
				setTarget((ClassWc)null);
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
			case AbstractaPackage.RELATION_WC__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbstractaPackage.RELATION_WC__MULT_A:
				return MULT_A_EDEFAULT == null ? multA != null : !MULT_A_EDEFAULT.equals(multA);
			case AbstractaPackage.RELATION_WC__MULT_B:
				return MULT_B_EDEFAULT == null ? multB != null : !MULT_B_EDEFAULT.equals(multB);
			case AbstractaPackage.RELATION_WC__ROLE_A:
				return ROLE_A_EDEFAULT == null ? roleA != null : !ROLE_A_EDEFAULT.equals(roleA);
			case AbstractaPackage.RELATION_WC__ROLE_B:
				return ROLE_B_EDEFAULT == null ? roleB != null : !ROLE_B_EDEFAULT.equals(roleB);
			case AbstractaPackage.RELATION_WC__SOURCE:
				return source != null;
			case AbstractaPackage.RELATION_WC__TARGET:
				return target != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", multA: ");
		result.append(multA);
		result.append(", multB: ");
		result.append(multB);
		result.append(", roleA: ");
		result.append(roleA);
		result.append(", roleB: ");
		result.append(roleB);
		result.append(')');
		return result.toString();
	}

} //RelationWcImpl
