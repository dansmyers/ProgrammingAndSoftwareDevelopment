/**
 * FirstDrawing
 * 
 * Demonstrates how to draw using JFrame and Graphics
 */

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class FirstDrawing extends Canvas {
	
  // Size of the display window
  final int WIDTH = 640;
  final int HEIGHT = 480;
	
  /**
   * Constructor
   */
  public FirstDrawing() {
    setSize(WIDTH, HEIGHT);
  }
	
  /**
   * paint -- contains all drawing operations
   * 
   * @param  g  Graphics object that refers to the 
   *            drawable surface
   */
  public void paint(Graphics g) {
    g.fillRect(100, 125, 320, 240);
  }
	
  /**
   * main -- sets up frame and makes it visible
  */
  public static void main(String[] args) { 
    // Construct the driver object
    FirstDrawing app = new FirstDrawing();
        
    // Create a JFrame and attach the driver to it
    // These steps are required to make the window visible
    JFrame frame = new JFrame();
    frame.add(app);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
