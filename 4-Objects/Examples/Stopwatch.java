/**
 * Write a Stopwatch class for timing code fragments
 * 
 * @author dmyers
 *
 */

public class Stopwatch {
	
	// Instance variables
	private long startTime;
	private long stopTime;
	
	// Constructor
	public Stopwatch() {
		this.startTime = 0;
		this.stopTime = 0;
	}
	
	// Start and stop methods
	public void start() {
		this.startTime = System.nanoTime();
	}
	
	public void stop() {
		this.stopTime = System.nanoTime();
	}
	
	// getElapsedTime
	public long getElapsedTime() {
		return this.stopTime - this.startTime;
	}
	
	
	public static void main(String[] args) {
	    Stopwatch watch = new Stopwatch();
	    
	    watch.start();
	    
	    // Waste some time
	    for (int i = 0; i < 1000000; i++) {
	        System.out.println("wasting time...");
	    }
	
	    watch.stop();
	    
	    long elapsedTime = watch.getElapsedTime() / 1000000;  // Convert to ms
	    
	    System.out.println(elapsedTime);
	}
}
