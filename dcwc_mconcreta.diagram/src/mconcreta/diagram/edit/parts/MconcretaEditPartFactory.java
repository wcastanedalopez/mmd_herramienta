/*
 * 
 */
package mconcreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import mconcreta.diagram.part.MconcretaVisualIDRegistry;

/**
 * @generated
 */
public class MconcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MconcretaVisualIDRegistry.getVisualID(view)) {

			case ClassDiagramWcEditPart.VISUAL_ID:
				return new ClassDiagramWcEditPart(view);

			case ClassWcEditPart.VISUAL_ID:
				return new ClassWcEditPart(view);

			case ClassWcNameEditPart.VISUAL_ID:
				return new ClassWcNameEditPart(view);

			case PackageWcEditPart.VISUAL_ID:
				return new PackageWcEditPart(view);

			case PackageWcNameEditPart.VISUAL_ID:
				return new PackageWcNameEditPart(view);

			case AttributeWcEditPart.VISUAL_ID:
				return new AttributeWcEditPart(view);

			case AttributeWcNameEditPart.VISUAL_ID:
				return new AttributeWcNameEditPart(view);

			case MethodWcEditPart.VISUAL_ID:
				return new MethodWcEditPart(view);

			case MethodWcNameEditPart.VISUAL_ID:
				return new MethodWcNameEditPart(view);

			case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
				return new ClassWcClassWcAttributesCompartmentEditPart(view);

			case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
				return new ClassWcClassWcMethodsCompartmentEditPart(view);

			case CompositionEditPart.VISUAL_ID:
				return new CompositionEditPart(view);

			case CompositionRoleAEditPart.VISUAL_ID:
				return new CompositionRoleAEditPart(view);

			case CompositionMultAEditPart.VISUAL_ID:
				return new CompositionMultAEditPart(view);

			case CompositionRoleBEditPart.VISUAL_ID:
				return new CompositionRoleBEditPart(view);

			case CompositionMultBEditPart.VISUAL_ID:
				return new CompositionMultBEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case AggregationRoleAEditPart.VISUAL_ID:
				return new AggregationRoleAEditPart(view);

			case AggregationMultAEditPart.VISUAL_ID:
				return new AggregationMultAEditPart(view);

			case AggregationRoleBEditPart.VISUAL_ID:
				return new AggregationRoleBEditPart(view);

			case AggregationMultBEditPart.VISUAL_ID:
				return new AggregationMultBEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationRoleAEditPart.VISUAL_ID:
				return new AssociationRoleAEditPart(view);

			case AssociationMultAEditPart.VISUAL_ID:
				return new AssociationMultAEditPart(view);

			case AssociationRoleBEditPart.VISUAL_ID:
				return new AssociationRoleBEditPart(view);

			case AssociationMultBEditPart.VISUAL_ID:
				return new AssociationMultBEditPart(view);

			case RelationBinaryEditPart.VISUAL_ID:
				return new RelationBinaryEditPart(view);

			case RelationBinaryRoleAEditPart.VISUAL_ID:
				return new RelationBinaryRoleAEditPart(view);

			case RelationBinaryMultAEditPart.VISUAL_ID:
				return new RelationBinaryMultAEditPart(view);

			case RelationBinaryRoleBEditPart.VISUAL_ID:
				return new RelationBinaryRoleBEditPart(view);

			case RelationBinaryMultBEditPart.VISUAL_ID:
				return new RelationBinaryMultBEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
