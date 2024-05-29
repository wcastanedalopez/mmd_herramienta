/**
 */
package dslrelacional.impl;

import dslrelacional.DataProject;
import dslrelacional.DslrelacionalPackage;
import dslrelacional.ModelFactoryRelacional;

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
 * An implementation of the model object '<em><b>Model Factory Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslrelacional.impl.ModelFactoryRelacionalImpl#getListProjects <em>List Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryRelacionalImpl extends EObjectImpl implements ModelFactoryRelacional {
	/**
	 * The cached value of the '{@link #getListProjects() <em>List Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProject> listProjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelacionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslrelacionalPackage.Literals.MODEL_FACTORY_RELACIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProject> getListProjects() {
		if (listProjects == null) {
			listProjects = new EObjectContainmentEList<DataProject>(DataProject.class, this, DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS);
		}
		return listProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS:
				return ((InternalEList<?>)getListProjects()).basicRemove(otherEnd, msgs);
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
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS:
				return getListProjects();
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
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS:
				getListProjects().clear();
				getListProjects().addAll((Collection<? extends DataProject>)newValue);
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
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS:
				getListProjects().clear();
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
			case DslrelacionalPackage.MODEL_FACTORY_RELACIONAL__LIST_PROJECTS:
				return listProjects != null && !listProjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryRelacionalImpl
