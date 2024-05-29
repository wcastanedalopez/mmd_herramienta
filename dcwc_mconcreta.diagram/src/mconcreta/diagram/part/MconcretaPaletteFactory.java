
/*
 * 
 */
package mconcreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import mconcreta.diagram.providers.MconcretaElementTypes;

/**
 * @generated
 */
public class MconcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributeWc1CreationTool());
		paletteContainer.add(createClassWc2CreationTool());
		paletteContainer.add(createMethodWc3CreationTool());
		paletteContainer.add(createPackageWc4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createAssociation2CreationTool());
		paletteContainer.add(createComposition3CreationTool());
		paletteContainer.add(createGeneralization4CreationTool());
		paletteContainer.add(createRelationBinary5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeWc1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AttributeWc1CreationTool_title,
				Messages.AttributeWc1CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.AttributeWc_3001));
		entry.setId("createAttributeWc1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.AttributeWc_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassWc2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ClassWc2CreationTool_title,
				Messages.ClassWc2CreationTool_desc, Collections.singletonList(MconcretaElementTypes.ClassWc_2001));
		entry.setId("createClassWc2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.ClassWc_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodWc3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MethodWc3CreationTool_title,
				Messages.MethodWc3CreationTool_desc, Collections.singletonList(MconcretaElementTypes.MethodWc_3002));
		entry.setId("createMethodWc3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.MethodWc_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageWc4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PackageWc4CreationTool_title,
				Messages.PackageWc4CreationTool_desc, Collections.singletonList(MconcretaElementTypes.PackageWc_2002));
		entry.setId("createPackageWc4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.PackageWc_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation1CreationTool_title,
				Messages.Aggregation1CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.Aggregation_4003));
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.Aggregation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association2CreationTool_title,
				Messages.Association2CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.Association_4004));
		entry.setId("createAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.Association_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComposition3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Composition3CreationTool_title,
				Messages.Composition3CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.Composition_4001));
		entry.setId("createComposition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.Composition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneralization4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generalization4CreationTool_title,
				Messages.Generalization4CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.Generalization_4002));
		entry.setId("createGeneralization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.Generalization_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelationBinary5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RelationBinary5CreationTool_title,
				Messages.RelationBinary5CreationTool_desc,
				Collections.singletonList(MconcretaElementTypes.RelationBinary_4005));
		entry.setId("createRelationBinary5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MconcretaElementTypes.getImageDescriptor(MconcretaElementTypes.RelationBinary_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
