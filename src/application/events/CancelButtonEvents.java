package application.events;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import application.FirstSWTApplication;
import application.widgets.CancelButton;
import application.widgets.DrawButton;

public class CancelButtonEvents {

	public static void addCancelButtonEvents(DrawButton drawButton, CancelButton cancelButton) {
		cancelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				drawButton.setEnabled(true);
				cancelButton.setEnabled(false);
				FirstSWTApplication.resetDraw();
			}
		});
	}
}
