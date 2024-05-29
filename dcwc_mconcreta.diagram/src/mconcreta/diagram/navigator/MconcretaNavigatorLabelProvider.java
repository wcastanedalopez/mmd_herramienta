/*
* 
*/
package mconcreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import mconcreta.ClassDiagramWc;
import mconcreta.Generalization;
import mconcreta.diagram.edit.parts.AggregationEditPart;
import mconcreta.diagram.edit.parts.AggregationRoleAEditPart;
import mconcreta.diagram.edit.parts.AssociationEditPart;
import mconcreta.diagram.edit.parts.AssociationRoleAEditPart;
import mconcreta.diagram.edit.parts.AttributeWcEditPart;
import mconcreta.diagram.edit.parts.AttributeWcNameEditPart;
import mconcreta.diagram.edit.parts.ClassDiagramWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcNameEditPart;
import mconcreta.diagram.edit.parts.CompositionEditPart;
import mconcreta.diagram.edit.parts.CompositionRoleAEditPart;
import mconcreta.diagram.edit.parts.GeneralizationEditPart;
import mconcreta.diagram.edit.parts.MethodWcEditPart;
import mconcreta.diagram.edit.parts.MethodWcNameEditPart;
import mconcreta.diagram.edit.parts.PackageWcEditPart;
import mconcreta.diagram.edit.parts.PackageWcNameEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryRoleAEditPart;
import mconcreta.diagram.part.MconcretaDiagramEditorPlugin;
import mconcreta.diagram.part.MconcretaVisualIDRegistry;
import mconcreta.diagram.providers.MconcretaElementTypes;
import mconcreta.diagram.providers.MconcretaParserProvider;

/**
 * @generated
 */
public class MconcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MconcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MconcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MconcretaNavigatorItem && !isOwnView(((MconcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MconcretaNavigatorGroup) {
			MconcretaNavigatorGroup group = (MconcretaNavigatorGroup) element;
			return MconcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MconcretaNavigatorItem) {
			MconcretaNavigatorItem navigatorItem = (MconcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://mconcreta?ClassDiagramWc", //$NON-NLS-1$
					MconcretaElementTypes.ClassDiagramWc_1000);
		case ClassWcEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://mconcreta?ClassWc", MconcretaElementTypes.ClassWc_2001); //$NON-NLS-1$
		case PackageWcEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://mconcreta?PackageWc", MconcretaElementTypes.PackageWc_2002); //$NON-NLS-1$
		case AttributeWcEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://mconcreta?AttributeWc", MconcretaElementTypes.AttributeWc_3001); //$NON-NLS-1$
		case MethodWcEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://mconcreta?MethodWc", MconcretaElementTypes.MethodWc_3002); //$NON-NLS-1$
		case CompositionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mconcreta?Composition", MconcretaElementTypes.Composition_4001); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mconcreta?Generalization", //$NON-NLS-1$
					MconcretaElementTypes.Generalization_4002);
		case AggregationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mconcreta?Aggregation", MconcretaElementTypes.Aggregation_4003); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mconcreta?Association", MconcretaElementTypes.Association_4004); //$NON-NLS-1$
		case RelationBinaryEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mconcreta?RelationBinary", //$NON-NLS-1$
					MconcretaElementTypes.RelationBinary_4005);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MconcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MconcretaElementTypes.isKnownElementType(elementType)) {
			image = MconcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof MconcretaNavigatorGroup) {
			MconcretaNavigatorGroup group = (MconcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MconcretaNavigatorItem) {
			MconcretaNavigatorItem navigatorItem = (MconcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return getClassDiagramWc_1000Text(view);
		case ClassWcEditPart.VISUAL_ID:
			return getClassWc_2001Text(view);
		case PackageWcEditPart.VISUAL_ID:
			return getPackageWc_2002Text(view);
		case AttributeWcEditPart.VISUAL_ID:
			return getAttributeWc_3001Text(view);
		case MethodWcEditPart.VISUAL_ID:
			return getMethodWc_3002Text(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004Text(view);
		case RelationBinaryEditPart.VISUAL_ID:
			return getRelationBinary_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getClassDiagramWc_1000Text(View view) {
		ClassDiagramWc domainModelElement = (ClassDiagramWc) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassWc_2001Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.ClassWc_2001,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(ClassWcNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageWc_2002Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.PackageWc_2002,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(PackageWcNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeWc_3001Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.AttributeWc_3001,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(AttributeWcNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethodWc_3002Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.MethodWc_3002,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(MethodWcNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComposition_4001Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.Composition_4001,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(CompositionRoleAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeneralization_4002Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getType();
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregation_4003Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.Aggregation_4003,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(AggregationRoleAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociation_4004Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.Association_4004,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(AssociationRoleAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelationBinary_4005Text(View view) {
		IParser parser = MconcretaParserProvider.getParser(MconcretaElementTypes.RelationBinary_4005,
				view.getElement() != null ? view.getElement() : view,
				MconcretaVisualIDRegistry.getType(RelationBinaryRoleAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MconcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ClassDiagramWcEditPart.MODEL_ID.equals(MconcretaVisualIDRegistry.getModelID(view));
	}

}
