/*
 * 
 */
package mconcreta.diagram.providers;

import mconcreta.diagram.part.MconcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MconcretaDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MconcretaDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
