/*
* 
*/
package mconcreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import mconcreta.ClassDiagramWc;
import mconcreta.MconcretaPackage;
import mconcreta.diagram.edit.parts.AggregationEditPart;
import mconcreta.diagram.edit.parts.AggregationMultAEditPart;
import mconcreta.diagram.edit.parts.AggregationMultBEditPart;
import mconcreta.diagram.edit.parts.AggregationRoleAEditPart;
import mconcreta.diagram.edit.parts.AggregationRoleBEditPart;
import mconcreta.diagram.edit.parts.AssociationEditPart;
import mconcreta.diagram.edit.parts.AssociationMultAEditPart;
import mconcreta.diagram.edit.parts.AssociationMultBEditPart;
import mconcreta.diagram.edit.parts.AssociationRoleAEditPart;
import mconcreta.diagram.edit.parts.AssociationRoleBEditPart;
import mconcreta.diagram.edit.parts.AttributeWcEditPart;
import mconcreta.diagram.edit.parts.AttributeWcNameEditPart;
import mconcreta.diagram.edit.parts.ClassDiagramWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcAttributesCompartmentEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcMethodsCompartmentEditPart;
import mconcreta.diagram.edit.parts.ClassWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcNameEditPart;
import mconcreta.diagram.edit.parts.CompositionEditPart;
import mconcreta.diagram.edit.parts.CompositionMultAEditPart;
import mconcreta.diagram.edit.parts.CompositionMultBEditPart;
import mconcreta.diagram.edit.parts.CompositionRoleAEditPart;
import mconcreta.diagram.edit.parts.CompositionRoleBEditPart;
import mconcreta.diagram.edit.parts.GeneralizationEditPart;
import mconcreta.diagram.edit.parts.MethodWcEditPart;
import mconcreta.diagram.edit.parts.MethodWcNameEditPart;
import mconcreta.diagram.edit.parts.PackageWcEditPart;
import mconcreta.diagram.edit.parts.PackageWcNameEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryMultAEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryMultBEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryRoleAEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryRoleBEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MconcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dcwc_mconcreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ClassDiagramWcEditPart.MODEL_ID.equals(view.getType())) {
				return ClassDiagramWcEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mconcreta.diagram.part.MconcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				MconcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MconcretaPackage.eINSTANCE.getClassDiagramWc().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ClassDiagramWc) domainElement)) {
			return ClassDiagramWcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mconcreta.diagram.part.MconcretaVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramWcEditPart.MODEL_ID.equals(containerModelID) && !"mconcreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ClassDiagramWcEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mconcreta.diagram.part.MconcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramWcEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			if (MconcretaPackage.eINSTANCE.getClassWc().isSuperTypeOf(domainElement.eClass())) {
				return ClassWcEditPart.VISUAL_ID;
			}
			if (MconcretaPackage.eINSTANCE.getPackageWc().isSuperTypeOf(domainElement.eClass())) {
				return PackageWcEditPart.VISUAL_ID;
			}
			break;
		case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
			if (MconcretaPackage.eINSTANCE.getAttributeWc().isSuperTypeOf(domainElement.eClass())) {
				return AttributeWcEditPart.VISUAL_ID;
			}
			break;
		case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
			if (MconcretaPackage.eINSTANCE.getMethodWc().isSuperTypeOf(domainElement.eClass())) {
				return MethodWcEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mconcreta.diagram.part.MconcretaVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramWcEditPart.MODEL_ID.equals(containerModelID) && !"mconcreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ClassDiagramWcEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mconcreta.diagram.part.MconcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramWcEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			if (ClassWcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageWcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassWcEditPart.VISUAL_ID:
			if (ClassWcNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageWcEditPart.VISUAL_ID:
			if (PackageWcNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeWcEditPart.VISUAL_ID:
			if (AttributeWcNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodWcEditPart.VISUAL_ID:
			if (MethodWcNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeWcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
			if (MethodWcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositionEditPart.VISUAL_ID:
			if (CompositionRoleAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositionMultAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositionRoleBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositionMultBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationRoleAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationMultAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationRoleBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationMultBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationRoleAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationMultAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationRoleBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationMultBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationBinaryEditPart.VISUAL_ID:
			if (RelationBinaryRoleAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationBinaryMultAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationBinaryRoleBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationBinaryMultBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MconcretaPackage.eINSTANCE.getComposition().isSuperTypeOf(domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (MconcretaPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (MconcretaPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (MconcretaPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (MconcretaPackage.eINSTANCE.getRelationBinary().isSuperTypeOf(domainElement.eClass())) {
			return RelationBinaryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ClassDiagramWc element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
		case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return false;
		case PackageWcEditPart.VISUAL_ID:
		case AttributeWcEditPart.VISUAL_ID:
		case MethodWcEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return mconcreta.diagram.part.MconcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
