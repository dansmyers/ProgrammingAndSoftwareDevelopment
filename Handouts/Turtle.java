/**
 * Turtle graphics using Java classes
 * 
 * Key idea: the Turtle maintains an  ArrayList<Line2D>
 * describing the lines that it has drawn over the course of
 * the program
 * 
 * On a paint, draw each line in the ArrayList to produce the
 * complete figure
 */

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.geom.Line2D;

public class Turtle extends Canvas {
	
  /**
   * Instance variables
   */
 final int WIDTH = 500;
 final int HEIGHT = 400;
	
  /**
   * Constructor
   */
  public Turtle() {

  }
	
  /**
   * turnLeft -- adjust the Turtle's angle
   * 
   * @param  degrees  counter-clockwise change in angle
   */
  public void turnLeft(double degrees) {

  }
	
  /**
   * Helper method -- calculate cosine of an angle in degrees
   * 
   * @param  theta  angle in degrees
   * @return cos(theta)
   */
  public double cosDeg(double theta) {

  }
	
  /**
   * Helper method -- calculate sine of an angle in degrees
   * 
   * @param  theta  angle in degrees
   * @return sin(theta)
   */
  public double sinDeg(double theta) {

  }
	
  /**
   * move -- move the Turtle in its current facing direction
   * 
   * @param  dist  the linear distance for the move
   * 
   */
  public void move(double dist) {
		
  }
	
  /**
   * paint -- contains all drawing operations
   * 
   * @param  g  Graphics object that refers to the drawable surface
   */
  public void paint(Graphics g) {

  }
	
  /**
   * main -- creates and tests the Turtle
   */
  public static void main(String[] args) { 
  
    // Create a new Turtle object
    Turtle t = new Turtle();
    
    // Setup the JFrame
    JFrame frame = new JFrame();
    frame.add(t);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Issue commands to the Turtle to draw
    
    // Draw a rectangle
    t.move(100);
    t.turnLeft(90);
    t.move(50);
    t.turnLeft(90);
    t.move(100);
    t.turnLeft(90);
    t.move(50);
	    
    // Use repaint to trigger a call to paint
    t.repaint();
  }
}
