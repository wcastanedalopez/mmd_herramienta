/*
 * 
 */
package mconcreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import mconcreta.ClassDiagramWc;
import mconcreta.ClassWc;
import mconcreta.Composition;
import mconcreta.diagram.edit.policies.MconcretaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class CompositionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public CompositionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Composition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ClassWc && newEnd instanceof ClassWc)) {
			return false;
		}
		ClassWc target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ClassDiagramWc)) {
			return false;
		}
		ClassDiagramWc container = (ClassDiagramWc) getLink().eContainer();
		return MconcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistComposition_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ClassWc && newEnd instanceof ClassWc)) {
			return false;
		}
		ClassWc source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ClassDiagramWc)) {
			return false;
		}
		ClassDiagramWc container = (ClassDiagramWc) getLink().eContainer();
		return MconcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistComposition_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Composition getLink() {
		return (Composition) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ClassWc getOldSource() {
		return (ClassWc) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassWc getNewSource() {
		return (ClassWc) newEnd;
	}

	/**
	* @generated
	*/
	protected ClassWc getOldTarget() {
		return (ClassWc) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassWc getNewTarget() {
		return (ClassWc) newEnd;
	}
}
