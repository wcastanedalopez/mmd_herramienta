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
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.PrimaryKeyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link dslrelacional.impl.PrimaryKeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link dslrelacional.impl.PrimaryKeyImpl#getRefersOpposite <em>Refers Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends ModelElemntWcImpl implements PrimaryKey {
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
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getRefersOpposite() <em>Refers Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> refersOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.PRIMARY_KEY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslrelacionalPackage.PRIMARY_KEY__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.PRIMARY_KEY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectResolvingEList<Column>(Column.class, this, DslrelacionalPackage.PRIMARY_KEY__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getRefersOpposite() {
		if (refersOpposite == null) {
			refersOpposite = new EObjectResolvingEList<ForeignKey>(ForeignKey.class, this, DslrelacionalPackage.PRIMARY_KEY__REFERS_OPPOSITE);
		}
		return refersOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslrelacionalPackage.PRIMARY_KEY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case DslrelacionalPackage.PRIMARY_KEY__COLUMN:
				return getColumn();
			case DslrelacionalPackage.PRIMARY_KEY__REFERS_OPPOSITE:
				return getRefersOpposite();
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
			case DslrelacionalPackage.PRIMARY_KEY__OWNER:
				setOwner((Table)newValue);
				return;
			case DslrelacionalPackage.PRIMARY_KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DslrelacionalPackage.PRIMARY_KEY__REFERS_OPPOSITE:
				getRefersOpposite().clear();
				getRefersOpposite().addAll((Collection<? extends ForeignKey>)newValue);
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
			case DslrelacionalPackage.PRIMARY_KEY__OWNER:
				setOwner((Table)null);
				return;
			case DslrelacionalPackage.PRIMARY_KEY__COLUMN:
				getColumn().clear();
				return;
			case DslrelacionalPackage.PRIMARY_KEY__REFERS_OPPOSITE:
				getRefersOpposite().clear();
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
			case DslrelacionalPackage.PRIMARY_KEY__OWNER:
				return owner != null;
			case DslrelacionalPackage.PRIMARY_KEY__COLUMN:
				return column != null && !column.isEmpty();
			case DslrelacionalPackage.PRIMARY_KEY__REFERS_OPPOSITE:
				return refersOpposite != null && !refersOpposite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
