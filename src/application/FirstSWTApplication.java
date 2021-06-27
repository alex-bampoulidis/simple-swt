package application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import application.widgets.CancelButton;
import application.widgets.DrawButton;
import application.widgets.DrawingCanvas;
import objects.Draw;

public class FirstSWTApplication {

	private static Draw draw = new Draw();

	public static void main(String[] args) {
		Display display = new Display();

		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		shell.setText("Simple SWT app");

		DrawingCanvas drawingCanvas = new DrawingCanvas(shell, SWT.NONE);

		DrawButton drawButton = new DrawButton(shell, SWT.PUSH);

		CancelButton cancelButton = new CancelButton(shell, SWT.PUSH);

		Events.addEvents(drawingCanvas, drawButton, cancelButton);

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	public static Draw getDraw() {
		return draw;
	}

	public static void resetDraw() {
		draw = new Draw();
	}
}