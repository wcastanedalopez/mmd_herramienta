/**
 */
package dslrelacional.impl;

import dslrelacional.Column;
import dslrelacional.DslrelacionalPackage;
import dslrelacional.ForeignKey;
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
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.ForeignKeyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.impl.ForeignKeyImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link dslrelacional.impl.ForeignKeyImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends ModelElemntWcImpl implements ForeignKey {
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
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey refersTo;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.FOREIGN_KEY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelacionalPackage.FOREIGN_KEY__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.FOREIGN_KEY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (PrimaryKey)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelacionalPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(PrimaryKey newRefersTo) {
		PrimaryKey oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectResolvingEList<Column>(Column.class, this, DslrelacionalPackage.FOREIGN_KEY__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelacionalPackage.FOREIGN_KEY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case DslrelacionalPackage.FOREIGN_KEY__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case DslrelacionalPackage.FOREIGN_KEY__COLUMN:
				return getColumn();
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
			case DslrelacionalPackage.FOREIGN_KEY__OWNER:
				setOwner((Table)newValue);
				return;
			case DslrelacionalPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((PrimaryKey)newValue);
				return;
			case DslrelacionalPackage.FOREIGN_KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
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
			case DslrelacionalPackage.FOREIGN_KEY__OWNER:
				setOwner((Table)null);
				return;
			case DslrelacionalPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((PrimaryKey)null);
				return;
			case DslrelacionalPackage.FOREIGN_KEY__COLUMN:
				getColumn().clear();
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
			case DslrelacionalPackage.FOREIGN_KEY__OWNER:
				return owner != null;
			case DslrelacionalPackage.FOREIGN_KEY__REFERS_TO:
				return refersTo != null;
			case DslrelacionalPackage.FOREIGN_KEY__COLUMN:
				return column != null && !column.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
