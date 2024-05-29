/**
 */
package dslrelacional.impl;

import dslrelacional.DataProject;
import dslrelacional.DslrelacionalPackage;
import dslrelacional.Schema;

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
 * An implementation of the model object '<em><b>Data Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.DataProjectImpl#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link dslrelacional.impl.DataProjectImpl#getPath <em>Path</em>}</li>
 *   <li>{@link dslrelacional.impl.DataProjectImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProjectImpl extends ModelElemntWcImpl implements DataProject {
	/**
	 * The default value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final String PUERTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected String puerto = PUERTO_EDEFAULT;

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
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.DATA_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPuerto() {
		return puerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuerto(String newPuerto) {
		String oldPuerto = puerto;
		puerto = newPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.DATA_PROJECT__PUERTO, oldPuerto, puerto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslrelacionalPackage.DATA_PROJECT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, DslrelacionalPackage.DATA_PROJECT__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelacionalPackage.DATA_PROJECT__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
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
			case DslrelacionalPackage.DATA_PROJECT__PUERTO:
				return getPuerto();
			case DslrelacionalPackage.DATA_PROJECT__PATH:
				return getPath();
			case DslrelacionalPackage.DATA_PROJECT__SCHEMA:
				return getSchema();
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
			case DslrelacionalPackage.DATA_PROJECT__PUERTO:
				setPuerto((String)newValue);
				return;
			case DslrelacionalPackage.DATA_PROJECT__PATH:
				setPath((String)newValue);
				return;
			case DslrelacionalPackage.DATA_PROJECT__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
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
			case DslrelacionalPackage.DATA_PROJECT__PUERTO:
				setPuerto(PUERTO_EDEFAULT);
				return;
			case DslrelacionalPackage.DATA_PROJECT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DslrelacionalPackage.DATA_PROJECT__SCHEMA:
				getSchema().clear();
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
			case DslrelacionalPackage.DATA_PROJECT__PUERTO:
				return PUERTO_EDEFAULT == null ? puerto != null : !PUERTO_EDEFAULT.equals(puerto);
			case DslrelacionalPackage.DATA_PROJECT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DslrelacionalPackage.DATA_PROJECT__SCHEMA:
				return schema != null && !schema.isEmpty();
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
		result.append(" (puerto: ");
		result.append(puerto);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //DataProjectImpl
