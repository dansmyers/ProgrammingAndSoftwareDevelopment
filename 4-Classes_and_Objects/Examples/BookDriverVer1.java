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
		
		Book hp1 = new Book("Harry Potter and the Sorceror's Stone", "J.K. Rowling", 9.99);
		
		// Let's make another book
		Book pnp = new Book("Pride and Prejudice", "Jane Austen", 12.99);
		
		
		Book grinch = new Book("How the Grinch Stole Christmas", "Dr. Seuss", 5.99);
		
		// Let's print a Book
		System.out.println(pnp);
		System.out.println(hp1);
		System.out.println(grinch);
	}

}
