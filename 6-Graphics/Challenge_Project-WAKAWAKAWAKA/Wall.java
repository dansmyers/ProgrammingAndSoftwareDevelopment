public class Wall {
	
	private double x, y, halfWidth, halfHeight;

	public Wall(double newX, double newY, double newWidth, double newHeight) {
		this.x = newX;
		this.y = newY;
		this.halfWidth = newWidth;
		this.halfHeight = newHeight;
	}
	
	public void draw() {
		StdDraw.setPenColor(20, 100, 225);
		StdDraw.filledRectangle(this.x, this.y, this.halfWidth, this.halfHeight);
	}

}
