public class Ghost {
	
	private double x, y, radius;
	
	public Ghost() {
		this.x = .90;
		this.y = .90;
		this.radius = .02;
	}
	
	
	public void draw() {
		StdDraw.setPenColor(200, 25, 25);
		StdDraw.filledSquare(this.x, this.y, this.radius);
	}

}
