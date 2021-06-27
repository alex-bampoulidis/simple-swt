package application.widgets;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class CancelButton extends Button {

	public CancelButton(Composite parent, int style) {
		super(parent, style);

		setText("Cancel");
		setEnabled(false);
	}

	@Override
	protected void checkSubclass() {

	}
}
