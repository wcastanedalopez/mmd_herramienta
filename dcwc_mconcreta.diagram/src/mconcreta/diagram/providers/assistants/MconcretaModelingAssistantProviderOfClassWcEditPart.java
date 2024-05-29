/*
 * 
 */
package mconcreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mconcreta.diagram.edit.parts.ClassWcEditPart;
import mconcreta.diagram.providers.MconcretaElementTypes;
import mconcreta.diagram.providers.MconcretaModelingAssistantProvider;

/**
 * @generated
 */
public class MconcretaModelingAssistantProviderOfClassWcEditPart extends MconcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MconcretaElementTypes.AttributeWc_3001);
		types.add(MconcretaElementTypes.MethodWc_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClassWcEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClassWcEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(MconcretaElementTypes.Composition_4001);
		types.add(MconcretaElementTypes.Generalization_4002);
		types.add(MconcretaElementTypes.Aggregation_4003);
		types.add(MconcretaElementTypes.Association_4004);
		types.add(MconcretaElementTypes.RelationBinary_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClassWcEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClassWcEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClassWcEditPart) {
			types.add(MconcretaElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof ClassWcEditPart) {
			types.add(MconcretaElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof ClassWcEditPart) {
			types.add(MconcretaElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof ClassWcEditPart) {
			types.add(MconcretaElementTypes.Association_4004);
		}
		if (targetEditPart instanceof ClassWcEditPart) {
			types.add(MconcretaElementTypes.RelationBinary_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClassWcEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClassWcEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MconcretaElementTypes.Composition_4001) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Generalization_4002) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Aggregation_4003) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Association_4004) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.RelationBinary_4005) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClassWcEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClassWcEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(MconcretaElementTypes.Composition_4001);
		types.add(MconcretaElementTypes.Generalization_4002);
		types.add(MconcretaElementTypes.Aggregation_4003);
		types.add(MconcretaElementTypes.Association_4004);
		types.add(MconcretaElementTypes.RelationBinary_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClassWcEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClassWcEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MconcretaElementTypes.Composition_4001) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Generalization_4002) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Aggregation_4003) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.Association_4004) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		} else if (relationshipType == MconcretaElementTypes.RelationBinary_4005) {
			types.add(MconcretaElementTypes.ClassWc_2001);
		}
		return types;
	}

}
