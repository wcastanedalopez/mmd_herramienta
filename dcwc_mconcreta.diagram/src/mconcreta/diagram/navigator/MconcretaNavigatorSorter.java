/*
* 
*/
package mconcreta.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import mconcreta.diagram.part.MconcretaVisualIDRegistry;

/**
 * @generated
 */
public class MconcretaNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MconcretaNavigatorItem) {
			MconcretaNavigatorItem item = (MconcretaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MconcretaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
