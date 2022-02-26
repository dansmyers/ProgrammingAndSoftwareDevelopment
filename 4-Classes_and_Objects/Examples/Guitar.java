/**
 * Class representing a guitar
 * 
 * @author dmyers
 *
 */

public class Guitar {
	
	// Key idea: think about the class as a container that holds a set of logically related variables
	
	private String make;
	private String model;
	private int numStrings;
	private boolean isPointy;
	
	
	public Guitar(String make, String model, int numStrings, boolean isPointy) {
		this.make = make;
		this.model = model;
		this.numStrings = numStrings;
		this.isPointy = isPointy;
	}
	
	// Second version of the constructor
	//
	// Java can distinguish between different methods with the same name
	// if they have different argument lists
	//
	// Ex: calling Guitar constructor with three arguments runs this version
	// that sets the default number of strings to 6
	public Guitar(String make, String model, boolean isPointy) {
		this.make = make;
		this.model = model;
		this.isPointy = isPointy;
		
		this.numStrings = 6;
	}
	
	
	// Get methods
	public String getMake() {
		return this.make;
	}
	
	public int getNumStrings() {
		return this.numStrings;
	}
	
	// What about set methods?
	//
	// If you make private instance variables but no set methods, then your
	// variables are READ ONLY
	//
	// You can get them and use them in the program, but you can't change them to
	// new values once the object has been created
	
	public boolean isRound() {
		
		return !this.isPointy;
		
	}
	
	
	public String toString() {
		return this.make + " " + this.model + " " + this.numStrings + " strings." + " pointy? " + this.isPointy;
	}
	
	
	// How to test this code?
	//
	// One way: to write a separate class with a main, like in our previous examples
	// This separate class with a main is often called a "Driver" class, but that's not required
	//
	// Another way: put a main inside the Guitar class itself
	
	// Writing main inside a class is basically the same as writing main in a different
	// Driver class
	//
	// You can construct objects and then call their methods, but you don't get any special
	// access to the fields of the Guitar class by being a main declared inside the Guitar class
	
	public static void main(String[] args) {
		
		// Declare some Guitar objects
		Guitar strat = new Guitar("Fender", "Stratocaster", 6, false);
		Guitar universe = new Guitar("Ibanez", "Universe 7 String", 7, true);
		
		
		// Alternate constructor that assumes a six-string guitar
		Guitar tele = new Guitar("Fender", "Telecaster", false);
		
		
		// Key idea: main can create new objects of the class type and access
		// their fields and methods like in the other mains that we've written
		
		// But you can't directly access instance variables or class methods from main
		
		System.out.println(strat.isRound());
		System.out.println(universe.isRound());
	}

}
