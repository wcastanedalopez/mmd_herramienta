/*
 * 
 */
package mconcreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import mconcreta.MconcretaPackage;
import mconcreta.diagram.edit.parts.AggregationEditPart;
import mconcreta.diagram.edit.parts.AssociationEditPart;
import mconcreta.diagram.edit.parts.AttributeWcEditPart;
import mconcreta.diagram.edit.parts.ClassDiagramWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcEditPart;
import mconcreta.diagram.edit.parts.CompositionEditPart;
import mconcreta.diagram.edit.parts.GeneralizationEditPart;
import mconcreta.diagram.edit.parts.MethodWcEditPart;
import mconcreta.diagram.edit.parts.PackageWcEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryEditPart;
import mconcreta.diagram.part.MconcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class MconcretaElementTypes {

	/**
	* @generated
	*/
	private MconcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MconcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ClassDiagramWc_1000 = getElementType("dcwc_mconcreta.diagram.ClassDiagramWc_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClassWc_2001 = getElementType("dcwc_mconcreta.diagram.ClassWc_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PackageWc_2002 = getElementType("dcwc_mconcreta.diagram.PackageWc_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeWc_3001 = getElementType("dcwc_mconcreta.diagram.AttributeWc_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodWc_3002 = getElementType("dcwc_mconcreta.diagram.MethodWc_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Composition_4001 = getElementType("dcwc_mconcreta.diagram.Composition_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Generalization_4002 = getElementType("dcwc_mconcreta.diagram.Generalization_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4003 = getElementType("dcwc_mconcreta.diagram.Aggregation_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4004 = getElementType("dcwc_mconcreta.diagram.Association_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelationBinary_4005 = getElementType("dcwc_mconcreta.diagram.RelationBinary_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ClassDiagramWc_1000, MconcretaPackage.eINSTANCE.getClassDiagramWc());

			elements.put(ClassWc_2001, MconcretaPackage.eINSTANCE.getClassWc());

			elements.put(PackageWc_2002, MconcretaPackage.eINSTANCE.getPackageWc());

			elements.put(AttributeWc_3001, MconcretaPackage.eINSTANCE.getAttributeWc());

			elements.put(MethodWc_3002, MconcretaPackage.eINSTANCE.getMethodWc());

			elements.put(Composition_4001, MconcretaPackage.eINSTANCE.getComposition());

			elements.put(Generalization_4002, MconcretaPackage.eINSTANCE.getGeneralization());

			elements.put(Aggregation_4003, MconcretaPackage.eINSTANCE.getAggregation());

			elements.put(Association_4004, MconcretaPackage.eINSTANCE.getAssociation());

			elements.put(RelationBinary_4005, MconcretaPackage.eINSTANCE.getRelationBinary());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ClassDiagramWc_1000);
			KNOWN_ELEMENT_TYPES.add(ClassWc_2001);
			KNOWN_ELEMENT_TYPES.add(PackageWc_2002);
			KNOWN_ELEMENT_TYPES.add(AttributeWc_3001);
			KNOWN_ELEMENT_TYPES.add(MethodWc_3002);
			KNOWN_ELEMENT_TYPES.add(Composition_4001);
			KNOWN_ELEMENT_TYPES.add(Generalization_4002);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4003);
			KNOWN_ELEMENT_TYPES.add(Association_4004);
			KNOWN_ELEMENT_TYPES.add(RelationBinary_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return ClassDiagramWc_1000;
		case ClassWcEditPart.VISUAL_ID:
			return ClassWc_2001;
		case PackageWcEditPart.VISUAL_ID:
			return PackageWc_2002;
		case AttributeWcEditPart.VISUAL_ID:
			return AttributeWc_3001;
		case MethodWcEditPart.VISUAL_ID:
			return MethodWc_3002;
		case CompositionEditPart.VISUAL_ID:
			return Composition_4001;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4002;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4003;
		case AssociationEditPart.VISUAL_ID:
			return Association_4004;
		case RelationBinaryEditPart.VISUAL_ID:
			return RelationBinary_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return mconcreta.diagram.providers.MconcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return mconcreta.diagram.providers.MconcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return mconcreta.diagram.providers.MconcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
