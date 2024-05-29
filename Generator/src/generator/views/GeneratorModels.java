package generator.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.ui.*;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class GeneratorModels extends ViewPart {
	public GeneratorModels() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "generator.views.GeneratorModels";

	@Inject IWorkbench workbench;
	

	 


	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FormLayout());
		
		Label lblPoomTool = new Label(parent, SWT.NONE);
		FormData fd_lblPoomTool = new FormData();
		fd_lblPoomTool.left = new FormAttachment(0, 251);
		lblPoomTool.setLayoutData(fd_lblPoomTool);
		lblPoomTool.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		lblPoomTool.setFont(SWTResourceManager.getFont("Segoe UI Black", 11, SWT.BOLD));
		lblPoomTool.setAlignment(SWT.CENTER);
		lblPoomTool.setText("Poom Tool");
		
		Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		fd_lblPoomTool.bottom = new FormAttachment(label, -6);
		FormData fd_label = new FormData();
		fd_label.right = new FormAttachment(0, 584);
		fd_label.top = new FormAttachment(0, 28);
		fd_label.left = new FormAttachment(0, 10);
		label.setLayoutData(fd_label);
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_FOREGROUND));
		
		Group grpTransformationModelTo = new Group(parent, SWT.NONE);
		FormData fd_grpTransformationModelTo = new FormData();
		fd_grpTransformationModelTo.bottom = new FormAttachment(0, 164);
		fd_grpTransformationModelTo.right = new FormAttachment(0, 584);
		fd_grpTransformationModelTo.top = new FormAttachment(0, 42);
		fd_grpTransformationModelTo.left = new FormAttachment(0, 10);
		grpTransformationModelTo.setLayoutData(fd_grpTransformationModelTo);
		grpTransformationModelTo.setText("Transformation Model To Model (M2M)");
		
		Button btnNewButton = new Button(grpTransformationModelTo, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.transformationM2M();
			}
		});
		btnNewButton.setTouchEnabled(true);
		btnNewButton.setBounds(10, 28, 554, 25);
		btnNewButton.setText("Generate Model");
		
	}



	@Override
	public void setFocus() {
		
	}
}
