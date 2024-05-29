/*
* 
*/
package mconcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class RelationBinaryItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RelationBinaryItemSemanticEditPolicy() {
		super(MconcretaElementTypes.RelationBinary_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
