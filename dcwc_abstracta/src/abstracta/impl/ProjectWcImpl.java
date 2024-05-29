/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.DataTypeFactoryWc;
import abstracta.PackageWc;
import abstracta.ProjectWc;

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
 * An implementation of the model object '<em><b>Project Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ProjectWcImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.impl.ProjectWcImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link abstracta.impl.ProjectWcImpl#getTypeFactoryWc <em>Type Factory Wc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectWcImpl extends NamedElemntWcImpl implements ProjectWc {
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageWc> packages;

	/**
	 * The cached value of the '{@link #getTypeFactoryWc() <em>Type Factory Wc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFactoryWc()
	 * @generated
	 * @ordered
	 */
	protected DataTypeFactoryWc typeFactoryWc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.PROJECT_WC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECT_WC__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageWc> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<PackageWc>(PackageWc.class, this, AbstractaPackage.PROJECT_WC__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeFactoryWc getTypeFactoryWc() {
		return typeFactoryWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeFactoryWc(DataTypeFactoryWc newTypeFactoryWc, NotificationChain msgs) {
		DataTypeFactoryWc oldTypeFactoryWc = typeFactoryWc;
		typeFactoryWc = newTypeFactoryWc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC, oldTypeFactoryWc, newTypeFactoryWc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFactoryWc(DataTypeFactoryWc newTypeFactoryWc) {
		if (newTypeFactoryWc != typeFactoryWc) {
			NotificationChain msgs = null;
			if (typeFactoryWc != null)
				msgs = ((InternalEObject)typeFactoryWc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC, null, msgs);
			if (newTypeFactoryWc != null)
				msgs = ((InternalEObject)newTypeFactoryWc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC, null, msgs);
			msgs = basicSetTypeFactoryWc(newTypeFactoryWc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC, newTypeFactoryWc, newTypeFactoryWc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.PROJECT_WC__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC:
				return basicSetTypeFactoryWc(null, msgs);
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
			case AbstractaPackage.PROJECT_WC__PATH:
				return getPath();
			case AbstractaPackage.PROJECT_WC__PACKAGES:
				return getPackages();
			case AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC:
				return getTypeFactoryWc();
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
			case AbstractaPackage.PROJECT_WC__PATH:
				setPath((String)newValue);
				return;
			case AbstractaPackage.PROJECT_WC__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends PackageWc>)newValue);
				return;
			case AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC:
				setTypeFactoryWc((DataTypeFactoryWc)newValue);
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
			case AbstractaPackage.PROJECT_WC__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractaPackage.PROJECT_WC__PACKAGES:
				getPackages().clear();
				return;
			case AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC:
				setTypeFactoryWc((DataTypeFactoryWc)null);
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
			case AbstractaPackage.PROJECT_WC__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractaPackage.PROJECT_WC__PACKAGES:
				return packages != null && !packages.isEmpty();
			case AbstractaPackage.PROJECT_WC__TYPE_FACTORY_WC:
				return typeFactoryWc != null;
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

} //ProjectWcImpl
