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
public class AggregationItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AggregationItemSemanticEditPolicy() {
		super(MconcretaElementTypes.Aggregation_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
