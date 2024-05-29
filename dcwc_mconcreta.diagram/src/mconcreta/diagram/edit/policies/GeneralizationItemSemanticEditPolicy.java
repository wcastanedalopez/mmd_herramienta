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
public class GeneralizationItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GeneralizationItemSemanticEditPolicy() {
		super(MconcretaElementTypes.Generalization_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
