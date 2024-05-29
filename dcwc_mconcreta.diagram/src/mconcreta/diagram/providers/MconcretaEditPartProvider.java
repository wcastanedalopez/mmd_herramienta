/*
 * 
 */
package mconcreta.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import mconcreta.diagram.edit.parts.ClassDiagramWcEditPart;
import mconcreta.diagram.edit.parts.MconcretaEditPartFactory;
import mconcreta.diagram.part.MconcretaVisualIDRegistry;

/**
 * @generated
 */
public class MconcretaEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MconcretaEditPartProvider() {
		super(new MconcretaEditPartFactory(), MconcretaVisualIDRegistry.TYPED_INSTANCE,
				ClassDiagramWcEditPart.MODEL_ID);
	}

}
