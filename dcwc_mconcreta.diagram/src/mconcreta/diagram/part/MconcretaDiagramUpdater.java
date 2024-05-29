/*
* 
*/
package mconcreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import mconcreta.Aggregation;
import mconcreta.Association;
import mconcreta.AttributeWc;
import mconcreta.ClassDiagramWc;
import mconcreta.ClassWc;
import mconcreta.Composition;
import mconcreta.Generalization;
import mconcreta.MconcretaPackage;
import mconcreta.MethodWc;
import mconcreta.PackageWc;
import mconcreta.RelationBinary;
import mconcreta.diagram.edit.parts.AggregationEditPart;
import mconcreta.diagram.edit.parts.AssociationEditPart;
import mconcreta.diagram.edit.parts.AttributeWcEditPart;
import mconcreta.diagram.edit.parts.ClassDiagramWcEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcAttributesCompartmentEditPart;
import mconcreta.diagram.edit.parts.ClassWcClassWcMethodsCompartmentEditPart;
import mconcreta.diagram.edit.parts.ClassWcEditPart;
import mconcreta.diagram.edit.parts.CompositionEditPart;
import mconcreta.diagram.edit.parts.GeneralizationEditPart;
import mconcreta.diagram.edit.parts.MethodWcEditPart;
import mconcreta.diagram.edit.parts.PackageWcEditPart;
import mconcreta.diagram.edit.parts.RelationBinaryEditPart;
import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class MconcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<MconcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return getClassDiagramWc_1000SemanticChildren(view);
		case ClassWcClassWcAttributesCompartmentEditPart.VISUAL_ID:
			return getClassWcClassWcAttributesCompartment_7001SemanticChildren(view);
		case ClassWcClassWcMethodsCompartmentEditPart.VISUAL_ID:
			return getClassWcClassWcMethodsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MconcretaNodeDescriptor> getClassDiagramWc_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClassDiagramWc modelElement = (ClassDiagramWc) view.getElement();
		LinkedList<MconcretaNodeDescriptor> result = new LinkedList<MconcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListClass().iterator(); it.hasNext();) {
			ClassWc childElement = (ClassWc) it.next();
			int visualID = MconcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassWcEditPart.VISUAL_ID) {
				result.add(new MconcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPackages().iterator(); it.hasNext();) {
			PackageWc childElement = (PackageWc) it.next();
			int visualID = MconcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageWcEditPart.VISUAL_ID) {
				result.add(new MconcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MconcretaNodeDescriptor> getClassWcClassWcAttributesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassWc modelElement = (ClassWc) containerView.getElement();
		LinkedList<MconcretaNodeDescriptor> result = new LinkedList<MconcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			AttributeWc childElement = (AttributeWc) it.next();
			int visualID = MconcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeWcEditPart.VISUAL_ID) {
				result.add(new MconcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MconcretaNodeDescriptor> getClassWcClassWcMethodsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassWc modelElement = (ClassWc) containerView.getElement();
		LinkedList<MconcretaNodeDescriptor> result = new LinkedList<MconcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethods().iterator(); it.hasNext();) {
			MethodWc childElement = (MethodWc) it.next();
			int visualID = MconcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodWcEditPart.VISUAL_ID) {
				result.add(new MconcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MconcretaLinkDescriptor> getContainedLinks(View view) {
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramWcEditPart.VISUAL_ID:
			return getClassDiagramWc_1000ContainedLinks(view);
		case ClassWcEditPart.VISUAL_ID:
			return getClassWc_2001ContainedLinks(view);
		case PackageWcEditPart.VISUAL_ID:
			return getPackageWc_2002ContainedLinks(view);
		case AttributeWcEditPart.VISUAL_ID:
			return getAttributeWc_3001ContainedLinks(view);
		case MethodWcEditPart.VISUAL_ID:
			return getMethodWc_3002ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004ContainedLinks(view);
		case RelationBinaryEditPart.VISUAL_ID:
			return getRelationBinary_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MconcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassWcEditPart.VISUAL_ID:
			return getClassWc_2001IncomingLinks(view);
		case PackageWcEditPart.VISUAL_ID:
			return getPackageWc_2002IncomingLinks(view);
		case AttributeWcEditPart.VISUAL_ID:
			return getAttributeWc_3001IncomingLinks(view);
		case MethodWcEditPart.VISUAL_ID:
			return getMethodWc_3002IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004IncomingLinks(view);
		case RelationBinaryEditPart.VISUAL_ID:
			return getRelationBinary_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MconcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (MconcretaVisualIDRegistry.getVisualID(view)) {
		case ClassWcEditPart.VISUAL_ID:
			return getClassWc_2001OutgoingLinks(view);
		case PackageWcEditPart.VISUAL_ID:
			return getPackageWc_2002OutgoingLinks(view);
		case AttributeWcEditPart.VISUAL_ID:
			return getAttributeWc_3001OutgoingLinks(view);
		case MethodWcEditPart.VISUAL_ID:
			return getMethodWc_3002OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004OutgoingLinks(view);
		case RelationBinaryEditPart.VISUAL_ID:
			return getRelationBinary_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getClassDiagramWc_1000ContainedLinks(View view) {
		ClassDiagramWc modelElement = (ClassDiagramWc) view.getElement();
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationBinary_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getClassWc_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getPackageWc_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAttributeWc_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getMethodWc_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getComposition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getGeneralization_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAggregation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAssociation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getRelationBinary_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getClassWc_2001IncomingLinks(View view) {
		ClassWc modelElement = (ClassWc) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelationBinary_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getPackageWc_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAttributeWc_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getMethodWc_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getComposition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getGeneralization_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAggregation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAssociation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getRelationBinary_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getClassWc_2001OutgoingLinks(View view) {
		ClassWc modelElement = (ClassWc) view.getElement();
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelationBinary_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getPackageWc_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAttributeWc_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getMethodWc_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getComposition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getGeneralization_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAggregation_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getAssociation_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MconcretaLinkDescriptor> getRelationBinary_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4001(
			ClassDiagramWc container) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4002(
			ClassDiagramWc container) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getParent();
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4003(
			ClassDiagramWc container) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getContainedTypeModelFacetLinks_Association_4004(
			ClassDiagramWc container) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getContainedTypeModelFacetLinks_RelationBinary_4005(
			ClassDiagramWc container) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RelationBinary) {
				continue;
			}
			RelationBinary link = (RelationBinary) linkObject;
			if (RelationBinaryEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.RelationBinary_4005,
					RelationBinaryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MconcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4001(ClassWc target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MconcretaPackage.eINSTANCE.getRelationWc_Target()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, target, link, MconcretaElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MconcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4002(
			ClassWc target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MconcretaPackage.eINSTANCE.getGeneralization_Parent()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, target, link, MconcretaElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MconcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4003(ClassWc target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MconcretaPackage.eINSTANCE.getRelationWc_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, target, link, MconcretaElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MconcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4004(ClassWc target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MconcretaPackage.eINSTANCE.getRelationWc_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, target, link, MconcretaElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MconcretaLinkDescriptor> getIncomingTypeModelFacetLinks_RelationBinary_4005(
			ClassWc target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MconcretaPackage.eINSTANCE.getRelationWc_Target()
					|| false == setting.getEObject() instanceof RelationBinary) {
				continue;
			}
			RelationBinary link = (RelationBinary) setting.getEObject();
			if (RelationBinaryEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc src = link.getSource();
			result.add(new MconcretaLinkDescriptor(src, target, link, MconcretaElementTypes.RelationBinary_4005,
					RelationBinaryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Composition_4001(ClassWc source) {
		ClassDiagramWc container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramWc) {
				container = (ClassDiagramWc) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4002(
			ClassWc source) {
		ClassDiagramWc container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramWc) {
				container = (ClassDiagramWc) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getParent();
			ClassWc src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4003(ClassWc source) {
		ClassDiagramWc container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramWc) {
				container = (ClassDiagramWc) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4004(ClassWc source) {
		ClassDiagramWc container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramWc) {
				container = (ClassDiagramWc) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MconcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_RelationBinary_4005(
			ClassWc source) {
		ClassDiagramWc container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramWc) {
				container = (ClassDiagramWc) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MconcretaLinkDescriptor> result = new LinkedList<MconcretaLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RelationBinary) {
				continue;
			}
			RelationBinary link = (RelationBinary) linkObject;
			if (RelationBinaryEditPart.VISUAL_ID != MconcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassWc dst = link.getTarget();
			ClassWc src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MconcretaLinkDescriptor(src, dst, link, MconcretaElementTypes.RelationBinary_4005,
					RelationBinaryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MconcretaNodeDescriptor> getSemanticChildren(View view) {
			return MconcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MconcretaLinkDescriptor> getContainedLinks(View view) {
			return MconcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MconcretaLinkDescriptor> getIncomingLinks(View view) {
			return MconcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MconcretaLinkDescriptor> getOutgoingLinks(View view) {
			return MconcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
