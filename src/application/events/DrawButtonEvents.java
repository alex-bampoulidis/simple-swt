package application.events;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import application.FirstSWTApplication;
import application.widgets.CancelButton;
import application.widgets.DrawButton;

public class DrawButtonEvents {

	public static void addDrawButtonEvents(DrawButton drawButton, CancelButton cancelButton) {
		drawButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				drawButton.setEnabled(false);
				cancelButton.setEnabled(true);
				FirstSWTApplication.getDraw().setDrawing(true);
			}
		});
	}
}
