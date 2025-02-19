/*
* 
*/
package mconcreta.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import mconcreta.diagram.edit.commands.ClassWcCreateCommand;
import mconcreta.diagram.edit.commands.PackageWcCreateCommand;
import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class ClassDiagramWcItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassDiagramWcItemSemanticEditPolicy() {
		super(MconcretaElementTypes.ClassDiagramWc_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MconcretaElementTypes.ClassWc_2001 == req.getElementType()) {
			return getGEFWrapper(new ClassWcCreateCommand(req));
		}
		if (MconcretaElementTypes.PackageWc_2002 == req.getElementType()) {
			return getGEFWrapper(new PackageWcCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
