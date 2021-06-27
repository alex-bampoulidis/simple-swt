package objects;

public class Rectangle {

	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(Draw draw) {
		int firstClickX = draw.getFirstClickX();
		int firstClickY = draw.getFirstClickY();
		int secondClickX = draw.getSecondClickX();
		int secondClickY = draw.getSecondClickY();

		if (firstClickX < secondClickX) { // drawn from left to right
			x = firstClickX;
			width = secondClickX - x;
			if (firstClickY < secondClickY) { // drawn from top to bottom
				y = firstClickY;
				height = secondClickY - y;
			} else { // drawn from bottom to top
				y = secondClickY;
				height = firstClickY - y;
			}
		} else { // drawn from right to left
			x = secondClickX;
			width = firstClickX - x;
			if (firstClickY < secondClickY) { // drawn from top to bottom
				y = firstClickY;
				height = secondClickY - y;
			} else { // drawn from bottom to top
				y = secondClickY;
				height = firstClickY - y;
			}
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
