// The main method for the Pac-Man project
// CMS 170, Spring 2019

public class Game {
	
	public static void main(String[] args) {
		
		// Initialize objects
		PacMan pacman = new PacMan();
		Ghost blinky = new Ghost();
		
		Wall[] walls = new Wall[1];
		walls[0] = new Wall(.25, .25, .02, .20);
		
		Pellet[] pellets = new Pellet[1];
		pellets[0] = new Pellet(.75, .75);
		
		boolean playing = true;
		while (playing) {
			
			
			//*** Check for collisions ***//
			
			
			//*** Update positions ***//
			
			
			//*** Animate all elements ***//
			
			StdDraw.clear();
			
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(.5, .5, .5, .5);
			
			pacman.draw();
			blinky.draw();
			
			for (Pellet p : pellets) {
				if (p != null) {
					p.draw();
				}
			}
			
			for (Wall w : walls) {
				w.draw();
			}
			
			StdDraw.show(20);
		}
		
	}

}
