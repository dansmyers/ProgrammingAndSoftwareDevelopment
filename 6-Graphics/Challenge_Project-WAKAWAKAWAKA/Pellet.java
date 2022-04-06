public class Pellet {
	
	private double x, y, radius;

	public Pellet(double newX, double newY) {
		this.x = newX;
		this.y = newY;
		this.radius = .0075;
	}
	
	public void draw() {
		StdDraw.setPenColor(250, 250, 250);
		StdDraw.filledCircle(this.x, this.y, this.radius);
	}
}
