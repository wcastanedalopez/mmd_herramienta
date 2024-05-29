/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AccesModifyWc;
import abstracta.ClassWc;
import abstracta.FeatureWc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.FeatureWcImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link abstracta.impl.FeatureWcImpl#getAccesModify <em>Acces Modify</em>}</li>
 *   <li>{@link abstracta.impl.FeatureWcImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureWcImpl extends NamedElemntWcImpl implements FeatureWc {
	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesModify() <em>Acces Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModify()
	 * @generated
	 * @ordered
	 */
	protected static final AccesModifyWc ACCES_MODIFY_EDEFAULT = AccesModifyWc.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccesModify() <em>Acces Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesModify()
	 * @generated
	 * @ordered
	 */
	protected AccesModifyWc accesModify = ACCES_MODIFY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected ClassWc owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.FEATURE_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.FEATURE_WC__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesModifyWc getAccesModify() {
		return accesModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesModify(AccesModifyWc newAccesModify) {
		AccesModifyWc oldAccesModify = accesModify;
		accesModify = newAccesModify == null ? ACCES_MODIFY_EDEFAULT : newAccesModify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.FEATURE_WC__ACCES_MODIFY, oldAccesModify, accesModify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (ClassWc)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.FEATURE_WC__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWc basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(ClassWc newOwner) {
		ClassWc oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.FEATURE_WC__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.FEATURE_WC__IS_STATIC:
				return isIsStatic();
			case AbstractaPackage.FEATURE_WC__ACCES_MODIFY:
				return getAccesModify();
			case AbstractaPackage.FEATURE_WC__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case AbstractaPackage.FEATURE_WC__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case AbstractaPackage.FEATURE_WC__ACCES_MODIFY:
				setAccesModify((AccesModifyWc)newValue);
				return;
			case AbstractaPackage.FEATURE_WC__OWNER:
				setOwner((ClassWc)newValue);
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
			case AbstractaPackage.FEATURE_WC__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case AbstractaPackage.FEATURE_WC__ACCES_MODIFY:
				setAccesModify(ACCES_MODIFY_EDEFAULT);
				return;
			case AbstractaPackage.FEATURE_WC__OWNER:
				setOwner((ClassWc)null);
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
			case AbstractaPackage.FEATURE_WC__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case AbstractaPackage.FEATURE_WC__ACCES_MODIFY:
				return accesModify != ACCES_MODIFY_EDEFAULT;
			case AbstractaPackage.FEATURE_WC__OWNER:
				return owner != null;
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
		result.append(" (isStatic: ");
		result.append(isStatic);
		result.append(", accesModify: ");
		result.append(accesModify);
		result.append(')');
		return result.toString();
	}

} //FeatureWcImpl
