/**
 * Write a main method to test the Book class
 * 
 * @author dmyers
 *
 */
public class BookDriver {

	public static void main(String[] args) {
		
		// Create a new Book object
		//
		// Recall: use the new keyword to allocate memory and call the constructor
		// for the class, which has the same name as the class
		
		Book hp1 = new Book("Harry Potter and the Sorceror's Stone", "J.K. Rowling", 8.99);
		
		// Let's make another book
		Book pnp = new Book("Pride and Prejudice", "Jane Austen", 12.99);
		
		
		Book grinch = new Book("How the Grinch Stole Christmas", "Dr. Seuss", 5.99);
		
		// Let's print a Book
		System.out.println(pnp);
		System.out.println(hp1);
		System.out.println(grinch);
		
		// Goal: enforce logical restrictions on how variables get used and protect
		// them from illogical operations that don't make sense in the context
		// of the program
		
		// Solution: private instance variables with class methods to interact with them
		
		System.out.println(pnp.getTitle());
		System.out.println(pnp.getAuthor());
		
		// Write a set method to change the value of price, but in only reasonable ways
		pnp.setPrice(2.99);   // Okay
		pnp.setPrice(-2.99);  // Error
		
	}

}
