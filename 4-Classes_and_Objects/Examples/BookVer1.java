/**
 * A class that represents a book with a title, author, and price
 * 
 * @author dmyers
 *
 */

public class Book {

	// These are our encapsulated internal variables for the Book objects
	// that we'll create
	//
	// Every Book object that we'll make has its own copies of title, author,
	// and price
	//
	// It's common to call these the "instance variables" of the Book class
	
	String title;
	String author;
	double price;
	
	
	// Write a constructor method that allows me to specify the title, author, and price
	// at the time that I create a new Book object
	
	// Constructor is a special method: always public, has no return type (not even void)
	// The name of the constructor is always the name of the class: Book
	
	// What we're doing here is typical: assigning values to the internal instance
	// variables when we create the new object
	
	public Book(String newTitle, String newAuthor, double newPrice) {
		
		// this is the "object self-reference"
		//
		// it's used to refer to the object's instance variables from within
		// the object's own code
		//
		// Think about it as referring to THIS new object, the one that's being
		// constructed right now as this constructor method execute
		
		// this is not strictly required -- Java is usually smart enough to figure
		// out when you're referring to an instance variable, but I like to use it
		// most of the time
		
		this.title = newTitle;
		this.author = newAuthor;
		this.price = newPrice;
	}
	
	
	// The toString method gets called when you print an object
	//
	// It returns a String representation of the object's data, so you can
	// print it easily
	public String toString() {
		return this.title + " by " + this.author + ", " + this.price;
	}
	
}
