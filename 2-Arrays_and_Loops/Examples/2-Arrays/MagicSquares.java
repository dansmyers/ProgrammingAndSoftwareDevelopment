/**
 * Magic squares
 *
 * CMS 121
 */
 
import java.util.Scanner;
 
public class MagicSquares {

    public static void main(String[] args) {

        // Create a Scanner and read n from the terminal
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value of n: ");
        int n = input.nextInt();
        
        
        // n must be odd and positive; if it isn't, quit immediately
        // Use return to end the program immediately
        

        // Initialize an n x n array of int
        int[][] square = new int[n][n];
        
        
        // Start in the top row, center column
        int row = 0;
        int col = n / 2;  // Integer division yields the correct column
        
        
        // Place the values from 1 to n ^ 2
        for (int i = 1; i <= n * n; i++) {
        
            // Place value i at square[row][col]
        	square[row][col] = i;
        	
        	// Save the old values of row and col so you can return to your
        	// starting position if you need to
        	int oldRow = row;
        	int oldCol = col;
            
        
            // Try to move up and right, wrapping around if you need to
        	row = row - 1;
        	if (row < 0) {
        		row = n - 1;
        	}
        	
        	col = col + 1;
        	if (col > n - 1) {
        		col = 0;
        	}
            
            
            // If that position is occupied, go back to the old location and move down instead
        	if (square[row][col] != 0) {
        		
        		// Reset to the old original values of row and col
        		row = oldRow;
        		col = oldCol;
        		
        		// Move down one square, wrapping around the bottom if I need to
        		row = row + 1;
        	}
            
        }
        
        
        // Print the final magic square
        
    }
}
