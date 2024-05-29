/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ClassWc;
import abstracta.PackageWc;
import abstracta.RelationWc;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Package Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.PackageWcImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.impl.PackageWcImpl#getListsClassWc <em>Lists Class Wc</em>}</li>
 *   <li>{@link abstracta.impl.PackageWcImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link abstracta.impl.PackageWcImpl#getChildrenPackagesWc <em>Children Packages Wc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageWcImpl extends NamedElemntWcImpl implements PackageWc {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListsClassWc() <em>Lists Class Wc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListsClassWc()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassWc> listsClassWc;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationWc> relationship;

	/**
	 * The cached value of the '{@link #getChildrenPackagesWc() <em>Children Packages Wc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenPackagesWc()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageWc> childrenPackagesWc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.PACKAGE_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PACKAGE_WC__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassWc> getListsClassWc() {
		if (listsClassWc == null) {
			listsClassWc = new EObjectContainmentEList<ClassWc>(ClassWc.class, this, AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC);
		}
		return listsClassWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationWc> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationWc>(RelationWc.class, this, AbstractaPackage.PACKAGE_WC__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageWc> getChildrenPackagesWc() {
		if (childrenPackagesWc == null) {
			childrenPackagesWc = new EObjectContainmentEList<PackageWc>(PackageWc.class, this, AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC);
		}
		return childrenPackagesWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
				return ((InternalEList<?>)getListsClassWc()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				return ((InternalEList<?>)getChildrenPackagesWc()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.PACKAGE_WC__PATH:
				return getPath();
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
				return getListsClassWc();
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
				return getRelationship();
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				return getChildrenPackagesWc();
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
			case AbstractaPackage.PACKAGE_WC__PATH:
				setPath((String)newValue);
				return;
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
				getListsClassWc().clear();
				getListsClassWc().addAll((Collection<? extends ClassWc>)newValue);
				return;
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationWc>)newValue);
				return;
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				getChildrenPackagesWc().clear();
				getChildrenPackagesWc().addAll((Collection<? extends PackageWc>)newValue);
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
			case AbstractaPackage.PACKAGE_WC__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
				getListsClassWc().clear();
				return;
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
				getRelationship().clear();
				return;
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				getChildrenPackagesWc().clear();
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
			case AbstractaPackage.PACKAGE_WC__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
				return listsClassWc != null && !listsClassWc.isEmpty();
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				return childrenPackagesWc != null && !childrenPackagesWc.isEmpty();
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //PackageWcImpl
