package application.widgets;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import objects.Draw;
import objects.Rectangle;

public class DrawingCanvas extends Canvas {

	private Set<Rectangle> rectangles;

	public DrawingCanvas(Composite parent, int style) {
		super(parent, style);

		rectangles = new HashSet<>();
	}

	@Override
	protected void checkSubclass() {

	}

	public Set<Rectangle> getRectangles() {
		return rectangles;
	}

	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle);
	}

	public void drawRectangle(Draw draw) {
		if (draw.isRectangle()) {
			Rectangle rectangle = new Rectangle(draw);

			rectangles.add(rectangle);

			redraw();
		}
	}
}
