package application;

import application.widgets.CancelButton;
import application.widgets.DrawButton;
import application.widgets.DrawingCanvas;

public class Events {

	public static void addEvents(DrawingCanvas drawingCanvas, DrawButton drawButton, CancelButton cancelButton) {		
		application.events.DrawingCanvasEvents.addDrawingCanvasEvents(drawingCanvas, cancelButton);
		application.events.DrawButtonEvents.addDrawButtonEvents(drawButton, cancelButton);
		application.events.CancelButtonEvents.addCancelButtonEvents(drawButton, cancelButton);
	}
}
