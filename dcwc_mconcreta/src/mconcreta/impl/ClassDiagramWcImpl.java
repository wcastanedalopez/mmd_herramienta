/**
 */
package mconcreta.impl;

import java.util.Collection;

import mconcreta.ClassDiagramWc;
import mconcreta.ClassWc;
import mconcreta.MconcretaPackage;
import mconcreta.PackageWc;
import mconcreta.RelationWc;

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
 * An implementation of the model object '<em><b>Class Diagram Wc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mconcreta.impl.ClassDiagramWcImpl#getName <em>Name</em>}</li>
 *   <li>{@link mconcreta.impl.ClassDiagramWcImpl#getPath <em>Path</em>}</li>
 *   <li>{@link mconcreta.impl.ClassDiagramWcImpl#getListClass <em>List Class</em>}</li>
 *   <li>{@link mconcreta.impl.ClassDiagramWcImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link mconcreta.impl.ClassDiagramWcImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramWcImpl extends EObjectImpl implements ClassDiagramWc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getListClass() <em>List Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassWc> listClass;

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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageWc> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramWcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MconcretaPackage.Literals.CLASS_DIAGRAM_WC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.CLASS_DIAGRAM_WC__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MconcretaPackage.CLASS_DIAGRAM_WC__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassWc> getListClass() {
		if (listClass == null) {
			listClass = new EObjectContainmentEList<ClassWc>(ClassWc.class, this, MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS);
		}
		return listClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationWc> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationWc>(RelationWc.class, this, MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageWc> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<PackageWc>(PackageWc.class, this, MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS:
				return ((InternalEList<?>)getListClass()).basicRemove(otherEnd, msgs);
			case MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
			case MconcretaPackage.CLASS_DIAGRAM_WC__NAME:
				return getName();
			case MconcretaPackage.CLASS_DIAGRAM_WC__PATH:
				return getPath();
			case MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS:
				return getListClass();
			case MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP:
				return getRelationship();
			case MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES:
				return getPackages();
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
			case MconcretaPackage.CLASS_DIAGRAM_WC__NAME:
				setName((String)newValue);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__PATH:
				setPath((String)newValue);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS:
				getListClass().clear();
				getListClass().addAll((Collection<? extends ClassWc>)newValue);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationWc>)newValue);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends PackageWc>)newValue);
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
			case MconcretaPackage.CLASS_DIAGRAM_WC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS:
				getListClass().clear();
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP:
				getRelationship().clear();
				return;
			case MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES:
				getPackages().clear();
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
			case MconcretaPackage.CLASS_DIAGRAM_WC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MconcretaPackage.CLASS_DIAGRAM_WC__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case MconcretaPackage.CLASS_DIAGRAM_WC__LIST_CLASS:
				return listClass != null && !listClass.isEmpty();
			case MconcretaPackage.CLASS_DIAGRAM_WC__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case MconcretaPackage.CLASS_DIAGRAM_WC__PACKAGES:
				return packages != null && !packages.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ClassDiagramWcImpl
