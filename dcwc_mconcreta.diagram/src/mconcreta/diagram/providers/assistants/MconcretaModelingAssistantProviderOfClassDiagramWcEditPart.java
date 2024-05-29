/*
 * 
 */
package mconcreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mconcreta.diagram.providers.MconcretaElementTypes;
import mconcreta.diagram.providers.MconcretaModelingAssistantProvider;

/**
 * @generated
 */
public class MconcretaModelingAssistantProviderOfClassDiagramWcEditPart extends MconcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MconcretaElementTypes.ClassWc_2001);
		types.add(MconcretaElementTypes.PackageWc_2002);
		return types;
	}

}
