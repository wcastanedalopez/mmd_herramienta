/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.DataTypeFactoryWc;
import abstracta.ModelFactoryAbstractaWc;
import abstracta.ProjectWc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory Abstracta Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ModelFactoryAbstractaWcImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryAbstractaWcImpl#getTypeFactoryWc <em>Type Factory Wc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryAbstractaWcImpl extends EObjectImpl implements ModelFactoryAbstractaWc {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectWc> projects;

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
	protected ModelFactoryAbstractaWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MODEL_FACTORY_ABSTRACTA_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectWc> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<ProjectWc>(ProjectWc.class, this, AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS);
		}
		return projects;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC, oldTypeFactoryWc, newTypeFactoryWc);
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
				msgs = ((InternalEObject)typeFactoryWc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC, null, msgs);
			if (newTypeFactoryWc != null)
				msgs = ((InternalEObject)newTypeFactoryWc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC, null, msgs);
			msgs = basicSetTypeFactoryWc(newTypeFactoryWc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC, newTypeFactoryWc, newTypeFactoryWc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC:
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS:
				return getProjects();
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC:
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends ProjectWc>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC:
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS:
				getProjects().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC:
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__PROJECTS:
				return projects != null && !projects.isEmpty();
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA_WC__TYPE_FACTORY_WC:
				return typeFactoryWc != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryAbstractaWcImpl
