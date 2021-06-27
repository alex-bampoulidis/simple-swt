package application.widgets;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class DrawButton extends Button {

	public DrawButton(Composite parent, int style) {
		super(parent, style);

		setText("Draw");
	}

	@Override
	protected void checkSubclass() {

	}
}
