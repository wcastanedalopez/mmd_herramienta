/*
* 
*/
package mconcreta.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import mconcreta.diagram.edit.commands.AggregationCreateCommand;
import mconcreta.diagram.edit.commands.AggregationReorientCommand;
import mconcreta.diagram.edit.commands.AssociationCreateCommand;
import mconcreta.diagram.edit.commands.AssociationReorientCommand;
import mconcreta.diagram.edit.commands.CompositionCreateCommand;
import mconcreta.diagram.edit.commands.CompositionReorientCommand;
import mconcreta.diagram.edit.commands.GeneralizationCreateCommand;
import mconcreta.diagram.edit.commands.GeneralizationReorientCommand;
import mconcreta.diagram.edit.commands.RelationBinaryCreateCommand;
import mconcreta.diagram.edit.commands.RelationBinaryReorientCommand;
import mconcreta.diagram.edit.parts.AggregationEditPart;
import mconcreta.diagram.edit.parts.AssociationEditPart;
import mconcreta.diagram.edit.parts.AttributeWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcAttributesCompartmentEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcMethodsCompartmentEditPart;
import mconcreta.diagram.edit.parts.CompositionEditPart;
import mconcreta.diagram.edit.parts.GeneralizationEditPart;
import mconcreta.diagram.edit.parts.MethodWcEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryEditPart;
import mconcreta.diagram.part.MconcretaVisualIDRegistry;
import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class ClassWcItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassWcItemSemanticEditPolicy() {
		super(MconcretaElementTypes.ClassWc_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MconcretaVisualIDRegistry.getVisualID(incomingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(incomingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(incomingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(incomingLink) == RelationBinaryEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MconcretaVisualIDRegistry.getVisualID(outgoingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(outgoingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(outgoingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MconcretaVisualIDRegistry.getVisualID(outgoingLink) == RelationBinaryEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (MconcretaVisualIDRegistry.getVisualID(node)) {
			case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MconcretaVisualIDRegistry.getVisualID(cnode)) {
					case AttributeWcEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MconcretaVisualIDRegistry.getVisualID(cnode)) {
					case MethodWcEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MconcretaElementTypes.Composition_4001 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Generalization_4002 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Aggregation_4003 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Association_4004 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.RelationBinary_4005 == req.getElementType()) {
			return getGEFWrapper(new RelationBinaryCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MconcretaElementTypes.Composition_4001 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Generalization_4002 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Aggregation_4003 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.Association_4004 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MconcretaElementTypes.RelationBinary_4005 == req.getElementType()) {
			return getGEFWrapper(new RelationBinaryCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationReorientCommand(req));
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case RelationBinaryEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationBinaryReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
