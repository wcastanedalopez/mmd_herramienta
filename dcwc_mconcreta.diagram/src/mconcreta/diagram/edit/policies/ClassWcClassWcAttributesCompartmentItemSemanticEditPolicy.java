/*
* 
*/
package mconcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import mconcreta.diagram.edit.commands.AttributeWcCreateCommand;
import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class ClassWcClassWcAttributesCompartmentItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassWcClassWcAttributesCompartmentItemSemanticEditPolicy() {
		super(MconcretaElementTypes.ClassWc_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MconcretaElementTypes.AttributeWc_3001 == req.getElementType()) {
			return getGEFWrapper(new AttributeWcCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
