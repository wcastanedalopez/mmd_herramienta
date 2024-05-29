/**
 */
package mconcreta.impl;

import java.util.Collection;

import mconcreta.AttributeWc;
import mconcreta.ClassWc;
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
 * An implementation of the model object '<em><b>Class Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.impl.ClassWcImpl#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link mconcreta.impl.ClassWcImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mconcreta.impl.ClassWcImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mconcreta.impl.ClassWcImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassWcImpl extends ClassifierWcImpl implements ClassWc {
	/**
	 * The default value of the '{@link #getPathPackage() <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPackage() <em>Path Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPackage()
	 * @generated
	 * @ordered
	 */
	protected String pathPackage = PATH_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeWc> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodWc> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MconcretaPackage.Literals.CLASS_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathPackage() {
		return pathPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPackage(String newPathPackage) {
		String oldPathPackage = pathPackage;
		pathPackage = newPathPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.CLASS_WC__PATH_PACKAGE, oldPathPackage, pathPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.CLASS_WC__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeWc> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeWc>(AttributeWc.class, this, MconcretaPackage.CLASS_WC__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodWc> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<MethodWc>(MethodWc.class, this, MconcretaPackage.CLASS_WC__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MconcretaPackage.CLASS_WC__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MconcretaPackage.CLASS_WC__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case MconcretaPackage.CLASS_WC__PATH_PACKAGE:
				return getPathPackage();
			case MconcretaPackage.CLASS_WC__IS_ABSTRACT:
				return isIsAbstract();
			case MconcretaPackage.CLASS_WC__ATTRIBUTES:
				return getAttributes();
			case MconcretaPackage.CLASS_WC__METHODS:
				return getMethods();
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
			case MconcretaPackage.CLASS_WC__PATH_PACKAGE:
				setPathPackage((String)newValue);
				return;
			case MconcretaPackage.CLASS_WC__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case MconcretaPackage.CLASS_WC__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeWc>)newValue);
				return;
			case MconcretaPackage.CLASS_WC__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends MethodWc>)newValue);
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
			case MconcretaPackage.CLASS_WC__PATH_PACKAGE:
				setPathPackage(PATH_PACKAGE_EDEFAULT);
				return;
			case MconcretaPackage.CLASS_WC__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case MconcretaPackage.CLASS_WC__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MconcretaPackage.CLASS_WC__METHODS:
				getMethods().clear();
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
			case MconcretaPackage.CLASS_WC__PATH_PACKAGE:
				return PATH_PACKAGE_EDEFAULT == null ? pathPackage != null : !PATH_PACKAGE_EDEFAULT.equals(pathPackage);
			case MconcretaPackage.CLASS_WC__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case MconcretaPackage.CLASS_WC__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case MconcretaPackage.CLASS_WC__METHODS:
				return methods != null && !methods.isEmpty();
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
		result.append(" (pathPackage: ");
		result.append(pathPackage);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassWcImpl
