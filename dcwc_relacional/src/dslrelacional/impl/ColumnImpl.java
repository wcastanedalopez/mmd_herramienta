/**
 */
package dslrelacional.impl;

import dslrelacional.Column;
import dslrelacional.DslrelacionalPackage;
import dslrelacional.PrimaryKey;
import dslrelacional.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.ColumnImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.impl.ColumnImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends ModelElemntWcImpl implements Column {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Table owner;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> primaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Table)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelacionalPackage.COLUMN__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Table newOwner) {
		Table oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.COLUMN__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getPrimaryKey() {
		if (primaryKey == null) {
			primaryKey = new EObjectResolvingEList<PrimaryKey>(PrimaryKey.class, this, DslrelacionalPackage.COLUMN__PRIMARY_KEY);
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelacionalPackage.COLUMN__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case DslrelacionalPackage.COLUMN__PRIMARY_KEY:
				return getPrimaryKey();
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
			case DslrelacionalPackage.COLUMN__OWNER:
				setOwner((Table)newValue);
				return;
			case DslrelacionalPackage.COLUMN__PRIMARY_KEY:
				getPrimaryKey().clear();
				getPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
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
			case DslrelacionalPackage.COLUMN__OWNER:
				setOwner((Table)null);
				return;
			case DslrelacionalPackage.COLUMN__PRIMARY_KEY:
				getPrimaryKey().clear();
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
			case DslrelacionalPackage.COLUMN__OWNER:
				return owner != null;
			case DslrelacionalPackage.COLUMN__PRIMARY_KEY:
				return primaryKey != null && !primaryKey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColumnImpl
