public class PacMan {
	
	private double x, y, radius;
	
	
	public PacMan() {
		this.x = .5;
		this.y = .5;
		this.radius = .02;
	}
	
	
	public void draw() {
		StdDraw.setPenColor(250, 250, 50);
		StdDraw.filledCircle(this.x, this.y, this.radius);
	}

}
