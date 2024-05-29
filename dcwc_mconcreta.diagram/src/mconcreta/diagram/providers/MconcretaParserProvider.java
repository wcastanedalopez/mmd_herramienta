/*
 * 
 */
package mconcreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import mconcreta.MconcretaPackage;
import mconcreta.diagram.edit.parts.AggregationMultAEditPart;
import mconcreta.diagram.edit.parts.AggregationMultBEditPart;
import mconcreta.diagram.edit.parts.AggregationRoleAEditPart;
import mconcreta.diagram.edit.parts.AggregationRoleBEditPart;
import mconcreta.diagram.edit.parts.AssociationMultAEditPart;
import mconcreta.diagram.edit.parts.AssociationMultBEditPart;
import mconcreta.diagram.edit.parts.AssociationRoleAEditPart;
import mconcreta.diagram.edit.parts.AssociationRoleBEditPart;
import mconcreta.diagram.edit.parts.AttributeWcNameEditPart;
import mconcreta.diagram.edit.parts.ClassWcNameEditPart;
import mconcreta.diagram.edit.parts.CompositionMultAEditPart;
import mconcreta.diagram.edit.parts.CompositionMultBEditPart;
import mconcreta.diagram.edit.parts.CompositionRoleAEditPart;
import mconcreta.diagram.edit.parts.CompositionRoleBEditPart;
import mconcreta.diagram.edit.parts.MethodWcNameEditPart;
import mconcreta.diagram.edit.parts.PackageWcNameEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryMultAEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryMultBEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryRoleAEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryRoleBEditPart;
import mconcreta.diagram.parsers.MessageFormatParser;
import mconcreta.diagram.part.MconcretaVisualIDRegistry;

/**
 * @generated
 */
public class MconcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser classWcName_5003Parser;

	/**
	* @generated
	*/
	private IParser getClassWcName_5003Parser() {
		if (classWcName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getClassifierWc_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classWcName_5003Parser = parser;
		}
		return classWcName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser packageWcName_5004Parser;

	/**
	* @generated
	*/
	private IParser getPackageWcName_5004Parser() {
		if (packageWcName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getPackageWc_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageWcName_5004Parser = parser;
		}
		return packageWcName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeWcName_5001Parser;

	/**
	* @generated
	*/
	private IParser getAttributeWcName_5001Parser() {
		if (attributeWcName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getAttributeWc_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			attributeWcName_5001Parser = parser;
		}
		return attributeWcName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodWcName_5002Parser;

	/**
	* @generated
	*/
	private IParser getMethodWcName_5002Parser() {
		if (methodWcName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getMethodWc_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			methodWcName_5002Parser = parser;
		}
		return methodWcName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser compositionRoleA_6001Parser;

	/**
	* @generated
	*/
	private IParser getCompositionRoleA_6001Parser() {
		if (compositionRoleA_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionRoleA_6001Parser = parser;
		}
		return compositionRoleA_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser compositionMultA_6002Parser;

	/**
	* @generated
	*/
	private IParser getCompositionMultA_6002Parser() {
		if (compositionMultA_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionMultA_6002Parser = parser;
		}
		return compositionMultA_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser compositionRoleB_6003Parser;

	/**
	* @generated
	*/
	private IParser getCompositionRoleB_6003Parser() {
		if (compositionRoleB_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionRoleB_6003Parser = parser;
		}
		return compositionRoleB_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser compositionMultB_6004Parser;

	/**
	* @generated
	*/
	private IParser getCompositionMultB_6004Parser() {
		if (compositionMultB_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionMultB_6004Parser = parser;
		}
		return compositionMultB_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationRoleA_6005Parser;

	/**
	* @generated
	*/
	private IParser getAggregationRoleA_6005Parser() {
		if (aggregationRoleA_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationRoleA_6005Parser = parser;
		}
		return aggregationRoleA_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationMultA_6006Parser;

	/**
	* @generated
	*/
	private IParser getAggregationMultA_6006Parser() {
		if (aggregationMultA_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationMultA_6006Parser = parser;
		}
		return aggregationMultA_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationRoleB_6007Parser;

	/**
	* @generated
	*/
	private IParser getAggregationRoleB_6007Parser() {
		if (aggregationRoleB_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationRoleB_6007Parser = parser;
		}
		return aggregationRoleB_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationMultB_6008Parser;

	/**
	* @generated
	*/
	private IParser getAggregationMultB_6008Parser() {
		if (aggregationMultB_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationMultB_6008Parser = parser;
		}
		return aggregationMultB_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser associationRoleA_6009Parser;

	/**
	* @generated
	*/
	private IParser getAssociationRoleA_6009Parser() {
		if (associationRoleA_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRoleA_6009Parser = parser;
		}
		return associationRoleA_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMultA_6010Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMultA_6010Parser() {
		if (associationMultA_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationMultA_6010Parser = parser;
		}
		return associationMultA_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser associationRoleB_6011Parser;

	/**
	* @generated
	*/
	private IParser getAssociationRoleB_6011Parser() {
		if (associationRoleB_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRoleB_6011Parser = parser;
		}
		return associationRoleB_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMultB_6012Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMultB_6012Parser() {
		if (associationMultB_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationMultB_6012Parser = parser;
		}
		return associationMultB_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser relationBinaryRoleA_6013Parser;

	/**
	* @generated
	*/
	private IParser getRelationBinaryRoleA_6013Parser() {
		if (relationBinaryRoleA_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationBinaryRoleA_6013Parser = parser;
		}
		return relationBinaryRoleA_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser relationBinaryMultA_6014Parser;

	/**
	* @generated
	*/
	private IParser getRelationBinaryMultA_6014Parser() {
		if (relationBinaryMultA_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationBinaryMultA_6014Parser = parser;
		}
		return relationBinaryMultA_6014Parser;
	}

	/**
	* @generated
	*/
	private IParser relationBinaryRoleB_6015Parser;

	/**
	* @generated
	*/
	private IParser getRelationBinaryRoleB_6015Parser() {
		if (relationBinaryRoleB_6015Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_RoleB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationBinaryRoleB_6015Parser = parser;
		}
		return relationBinaryRoleB_6015Parser;
	}

	/**
	* @generated
	*/
	private IParser relationBinaryMultB_6016Parser;

	/**
	* @generated
	*/
	private IParser getRelationBinaryMultB_6016Parser() {
		if (relationBinaryMultB_6016Parser == null) {
			EAttribute[] features = new EAttribute[] { MconcretaPackage.eINSTANCE.getRelationWc_MultB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationBinaryMultB_6016Parser = parser;
		}
		return relationBinaryMultB_6016Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClassWcNameEditPart.VISUAL_ID:
			return getClassWcName_5003Parser();
		case PackageWcNameEditPart.VISUAL_ID:
			return getPackageWcName_5004Parser();
		case AttributeWcNameEditPart.VISUAL_ID:
			return getAttributeWcName_5001Parser();
		case MethodWcNameEditPart.VISUAL_ID:
			return getMethodWcName_5002Parser();
		case CompositionRoleAEditPart.VISUAL_ID:
			return getCompositionRoleA_6001Parser();
		case CompositionMultAEditPart.VISUAL_ID:
			return getCompositionMultA_6002Parser();
		case CompositionRoleBEditPart.VISUAL_ID:
			return getCompositionRoleB_6003Parser();
		case CompositionMultBEditPart.VISUAL_ID:
			return getCompositionMultB_6004Parser();
		case AggregationRoleAEditPart.VISUAL_ID:
			return getAggregationRoleA_6005Parser();
		case AggregationMultAEditPart.VISUAL_ID:
			return getAggregationMultA_6006Parser();
		case AggregationRoleBEditPart.VISUAL_ID:
			return getAggregationRoleB_6007Parser();
		case AggregationMultBEditPart.VISUAL_ID:
			return getAggregationMultB_6008Parser();
		case AssociationRoleAEditPart.VISUAL_ID:
			return getAssociationRoleA_6009Parser();
		case AssociationMultAEditPart.VISUAL_ID:
			return getAssociationMultA_6010Parser();
		case AssociationRoleBEditPart.VISUAL_ID:
			return getAssociationRoleB_6011Parser();
		case AssociationMultBEditPart.VISUAL_ID:
			return getAssociationMultB_6012Parser();
		case RelationBinaryRoleAEditPart.VISUAL_ID:
			return getRelationBinaryRoleA_6013Parser();
		case RelationBinaryMultAEditPart.VISUAL_ID:
			return getRelationBinaryMultA_6014Parser();
		case RelationBinaryRoleBEditPart.VISUAL_ID:
			return getRelationBinaryRoleB_6015Parser();
		case RelationBinaryMultBEditPart.VISUAL_ID:
			return getRelationBinaryMultB_6016Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MconcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MconcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MconcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
