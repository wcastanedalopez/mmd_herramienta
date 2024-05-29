/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ClassWc;
import abstracta.FeatureWc;
import abstracta.RelationWc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ClassWcImpl#getPathPackage <em>Path Package</em>}</li>
 *   <li>{@link abstracta.impl.ClassWcImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.impl.ClassWcImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link abstracta.impl.ClassWcImpl#getListRelationshipOut <em>List Relationship Out</em>}</li>
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureWc> features;

	/**
	 * The cached value of the '{@link #getListRelationshipOut() <em>List Relationship Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelationshipOut()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationWc> listRelationshipOut;

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
		return AbstractaPackage.Literals.CLASS_WC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASS_WC__PATH_PACKAGE, oldPathPackage, pathPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASS_WC__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureWc> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<FeatureWc>(FeatureWc.class, this, AbstractaPackage.CLASS_WC__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationWc> getListRelationshipOut() {
		if (listRelationshipOut == null) {
			listRelationshipOut = new EObjectResolvingEList<RelationWc>(RelationWc.class, this, AbstractaPackage.CLASS_WC__LIST_RELATIONSHIP_OUT);
		}
		return listRelationshipOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.CLASS_WC__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.CLASS_WC__PATH_PACKAGE:
				return getPathPackage();
			case AbstractaPackage.CLASS_WC__IS_ABSTRACT:
				return isIsAbstract();
			case AbstractaPackage.CLASS_WC__FEATURES:
				return getFeatures();
			case AbstractaPackage.CLASS_WC__LIST_RELATIONSHIP_OUT:
				return getListRelationshipOut();
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
			case AbstractaPackage.CLASS_WC__PATH_PACKAGE:
				setPathPackage((String)newValue);
				return;
			case AbstractaPackage.CLASS_WC__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case AbstractaPackage.CLASS_WC__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends FeatureWc>)newValue);
				return;
			case AbstractaPackage.CLASS_WC__LIST_RELATIONSHIP_OUT:
				getListRelationshipOut().clear();
				getListRelationshipOut().addAll((Collection<? extends RelationWc>)newValue);
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
			case AbstractaPackage.CLASS_WC__PATH_PACKAGE:
				setPathPackage(PATH_PACKAGE_EDEFAULT);
				return;
			case AbstractaPackage.CLASS_WC__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case AbstractaPackage.CLASS_WC__FEATURES:
				getFeatures().clear();
				return;
			case AbstractaPackage.CLASS_WC__LIST_RELATIONSHIP_OUT:
				getListRelationshipOut().clear();
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
			case AbstractaPackage.CLASS_WC__PATH_PACKAGE:
				return PATH_PACKAGE_EDEFAULT == null ? pathPackage != null : !PATH_PACKAGE_EDEFAULT.equals(pathPackage);
			case AbstractaPackage.CLASS_WC__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case AbstractaPackage.CLASS_WC__FEATURES:
				return features != null && !features.isEmpty();
			case AbstractaPackage.CLASS_WC__LIST_RELATIONSHIP_OUT:
				return listRelationshipOut != null && !listRelationshipOut.isEmpty();
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
