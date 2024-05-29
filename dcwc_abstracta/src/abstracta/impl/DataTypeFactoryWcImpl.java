/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.DataTypeFactoryWc;
import abstracta.TypeWc;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Factory Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.DataTypeFactoryWcImpl#getListTypesWc <em>List Types Wc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeFactoryWcImpl extends EObjectImpl implements DataTypeFactoryWc {
	/**
	 * The cached value of the '{@link #getListTypesWc() <em>List Types Wc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTypesWc()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeWc> listTypesWc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeFactoryWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.DATA_TYPE_FACTORY_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeWc> getListTypesWc() {
		if (listTypesWc == null) {
			listTypesWc = new EObjectContainmentEList<TypeWc>(TypeWc.class, this, AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC);
		}
		return listTypesWc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC:
				return ((InternalEList<?>)getListTypesWc()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC:
				return getListTypesWc();
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
			case AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC:
				getListTypesWc().clear();
				getListTypesWc().addAll((Collection<? extends TypeWc>)newValue);
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
			case AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC:
				getListTypesWc().clear();
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
			case AbstractaPackage.DATA_TYPE_FACTORY_WC__LIST_TYPES_WC:
				return listTypesWc != null && !listTypesWc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeFactoryWcImpl
