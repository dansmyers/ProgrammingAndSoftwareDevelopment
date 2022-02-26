/**
 * A class that represents a book with a title, author, and price
 * 
 * @author dmyers
 *
 */

public class Book {
	
	// Declare instance variables -- every new Book gets its own copy of these variables
	private String title;
	private String author;
	private double price;
	
	// Java supports four different access modifiers
	//
	// Each modifier sets rules on how a piece of data or method can be used by other parts of the program
	//
	// 1. public -- public data and methods are visible everywhere
	// 2. private -- private data and methods are only visible from within the class where they're declared
	
	// public and private are BY FAR the two most common access modifiers that we'll use
	
	// 3. protected -- like private, but data is also visible to other classes in the same package (or directory)
	//                 and to any subclasses that have inherited from this class
	
	// 4. no modifier (default) -- like private, but data is also visible to other classes in the same
	//                             package or directory
	
	
	// Common model: private internal instance variables with public methods
	// Serves the goal of encapsulating data and providing methods with a well-defined
	// interface for interacting with it

	
	public Book(String newTitle, String newAuthor, double newPrice) {
		
		this.title = newTitle;
		this.author = newAuthor;
		this.price = newPrice;
	}
	
	
	// Class methods that interact with instance variables CANNOT be static
	//
	// static methods can be used for code that takes inputs and produces an output, but
	// they can't depend on internal instance variables (e.g. Math.sqrt())
	//
	// Static methods belong to the class as a whole, so they cannot access or use any data
	// created for a particular instance of the class
	
	// Accessor methods (or "get" methods) return the value of a private variable
	
	// Format: must be public, name is always get + name of variable
	// Return type is always the type of the variable
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// set methods ("mutator methods") are used to change the value of a private instance variable
	// method can enforce restrictions on what values are reasonable
	
	// Format: public, name is set + name of the variable, return type is void
	// Take one input, which is the same type as the variable
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	
	public void setPrice(double newPrice) {
		if (newPrice <= 0) {
			// Do something to reject the price
			
			// Third option: actually create an error that will crash the entire program
			//
			// Java does this a mechanism called "throwing errors"
			//
			// When a program gets into a bad runtime state, it can throw an error, which
			// may result in the program crashing
			
			
			// Second option, print an error message
			System.out.println("That is a bad price. You have caused confusion and delay.");
			
			
			// One option: just to fail silently, return without making a change
			return;
			
			
		} else {
			this.price = newPrice;
		}
	}
	
	
	// toString gets called automatically when you print an object
	// It must return a String
	// Java prints the String that is returned by toString, rather than the hashCode
	public String toString() {
		return this.title + " by " + this.author + ", " + this.price;
	}
	
}
