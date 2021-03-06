package application.events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Event;

import application.FirstSWTApplication;
import application.widgets.CancelButton;
import application.widgets.DrawingCanvas;
import objects.Draw;
import objects.Rectangle;

public class DrawingCanvasEvents {

	public static void addDrawingCanvasEvents(DrawingCanvas drawingCanvas, CancelButton cancelButton) {
		drawingCanvas.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				for (Rectangle rectangle : drawingCanvas.getRectangles()) {
					e.gc.drawRectangle(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
				}
			}
		});

		drawingCanvas.addMouseListener(new MouseListener() {
			@Override
			public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
				Draw draw = FirstSWTApplication.getDraw();

				if (draw.isDrawing()) {
					if (!draw.isClickedOnce()) {
						draw.setFirstClickX(e.x);
						draw.setFirstClickY(e.y);
						draw.setClickedOnce(true);
					} else {
						draw.setSecondClickX(e.x);
						draw.setSecondClickY(e.y);

						drawingCanvas.drawRectangle(draw);

						cancelButton.notifyListeners(SWT.Selection, new Event());
					}
				}
			}

			@Override
			public void mouseUp(org.eclipse.swt.events.MouseEvent e) {

			}

			@Override
			public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {

			}
		});
	}
}
