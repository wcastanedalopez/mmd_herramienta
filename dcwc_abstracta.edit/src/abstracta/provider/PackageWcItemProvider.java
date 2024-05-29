/**
 */
package abstracta.provider;


import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.PackageWc;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link abstracta.PackageWc} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageWcItemProvider extends NamedElemntWcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageWcItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageWc_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageWc_path_feature", "_UI_PackageWc_type"),
				 AbstractaPackage.Literals.PACKAGE_WC__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AbstractaPackage.Literals.PACKAGE_WC__LISTS_CLASS_WC);
			childrenFeatures.add(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP);
			childrenFeatures.add(AbstractaPackage.Literals.PACKAGE_WC__CHILDREN_PACKAGES_WC);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PackageWc.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PackageWc"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PackageWc)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PackageWc_type") :
			getString("_UI_PackageWc_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PackageWc.class)) {
			case AbstractaPackage.PACKAGE_WC__PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractaPackage.PACKAGE_WC__LISTS_CLASS_WC:
			case AbstractaPackage.PACKAGE_WC__RELATIONSHIP:
			case AbstractaPackage.PACKAGE_WC__CHILDREN_PACKAGES_WC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__LISTS_CLASS_WC,
				 AbstractaFactory.eINSTANCE.createClassWc()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP,
				 AbstractaFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP,
				 AbstractaFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP,
				 AbstractaFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP,
				 AbstractaFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__RELATIONSHIP,
				 AbstractaFactory.eINSTANCE.createRelationBinary()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.PACKAGE_WC__CHILDREN_PACKAGES_WC,
				 AbstractaFactory.eINSTANCE.createPackageWc()));
	}

}
