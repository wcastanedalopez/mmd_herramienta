/*
* 
*/
package mconcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import mconcreta.diagram.edit.commands.MethodWcCreateCommand;
import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class ClassWcClassWcMethodsCompartmentItemSemanticEditPolicy extends MconcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassWcClassWcMethodsCompartmentItemSemanticEditPolicy() {
		super(MconcretaElementTypes.ClassWc_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MconcretaElementTypes.MethodWc_3002 == req.getElementType()) {
			return getGEFWrapper(new MethodWcCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
