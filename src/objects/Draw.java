package objects;

public class Draw {

	private boolean isDrawing;
	private int firstClickX;
	private int firstClickY;
	private int secondClickX;
	private int secondClickY;
	private boolean clickedOnce;

	public Draw() {
		isDrawing = false;
		clickedOnce = false;
	}

	public int getFirstClickX() {
		return firstClickX;
	}

	public void setFirstClickX(int firstClickX) {
		this.firstClickX = firstClickX;
	}

	public int getFirstClickY() {
		return firstClickY;
	}

	public void setFirstClickY(int firstClickY) {
		this.firstClickY = firstClickY;
	}

	public int getSecondClickX() {
		return secondClickX;
	}

	public void setSecondClickX(int secondClickX) {
		this.secondClickX = secondClickX;
	}

	public int getSecondClickY() {
		return secondClickY;
	}

	public void setSecondClickY(int secondClickY) {
		this.secondClickY = secondClickY;
	}

	public boolean isDrawing() {
		return isDrawing;
	}

	public void setDrawing(boolean isDrawing) {
		this.isDrawing = isDrawing;
	}

	public boolean isClickedOnce() {
		return clickedOnce;
	}

	public void setClickedOnce(boolean clickedOnce) {
		this.clickedOnce = clickedOnce;
	}

	public boolean isRectangle() {
		if ((firstClickX != secondClickX) && (firstClickY != secondClickY)) {
			return true;
		}

		return false;
	}
}
