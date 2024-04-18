/**
 * Test program for LinkedList.java
 */

/*** DON'T EDIT THIS CLASS ***/
/*** DON'T EDIT THIS CLASS ***/
/*** DON'T EDIT THIS CLASS ***/
/*** DON'T EDIT THIS CLASS ***/
/*** ARE YOU EDITING THIS CLASS? ***/
/*** STOP EDITING THIS CLASS ***/

import java.util.Arrays;

public class LinkedListTest {
  
  public static boolean testValues(LinkedList<Integer> list, int[] values) {
    
    if (list.size() != values.length) {
      System.out.println("     Failed.");
      System.out.println("     Expected " + Arrays.toString(values));
      System.out.println("     Got " + list);
      return false;
    }
    
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) != values[i]) {
    	  System.out.println("     Failed.");
        System.out.println("     Expected " + Arrays.toString(values));
        System.out.println("     Got " + list);
        return false;
      }
    }
    return true;
  }
 
  
  public static void main(String[] args) throws Exception {
    
    int numPassed = 0;
    
    // Create a new LinkedList
    LinkedList<Integer> list = new LinkedList<Integer>();
    numPassed += 1;
    
    // Add elements to the beginning of the list
    // Counts as three tests because it also validates size() and get()
    System.out.println("Adding values to the front of the list...");
    list.push(1);
    list.push(2);
    list.push(3);
    int[] test1Values = {3, 2, 1};
    if (!testValues(list, test1Values))
      return;
    System.out.println("     Passed!");
    numPassed += 3;
    
    // Add elements to end of list
    System.out.println("Adding value to the end..");
    list.append(0);
    int[] test2Values = {3, 2, 1, 0};
    if (!testValues(list, test2Values))
      return;
    System.out.println("     Passed!");
    numPassed += 1;
    
    // Add an element to the middle of the list
    System.out.println("Inserting at position 2...");
    list.insert(2, 4);
    int[] test3Values = {3, 2, 4, 1, 0};
    if (!testValues(list, test3Values))
      return;
    System.out.println("     Passed!");
    numPassed += 1;
    
    // Remove an element from the middle of the list
    System.out.println("Removing from position 3...");
    list.remove(3);
    int[] test4Values = {3, 2, 4, 0};
    if (!testValues(list, test4Values))
      return;
    System.out.println("     Passed!");
    numPassed += 1;
    
    // Try to insert at an invalid index
    System.out.println("Inserting at invalid position 123456789...");
    try {
        list.insert(123456789, -1);
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("     Passed!");
    	numPassed += 1;
    }
    
    // Reverse list
    // Counts as two tests
    System.out.println("Reversing list...");
    list.reverse();
    int[] test5Values = {0, 4, 2, 3};
    if (!testValues(list, test5Values))
      return;
    System.out.println("     Passed!");
    numPassed += 2;
    
    // Set an element
    System.out.println("Setting element at position 1 to 5...");
    list.set(1, 5);
    int[] test6Values = {0, 5, 2, 3};
    if (!testValues(list, test6Values))
      return;
    System.out.println("     Passed!");
    numPassed += 1;
    
    // Copy and compare
    // Counts as two tests
    System.out.println("Copying list...");
    LinkedList<Integer> copy = list.copy();
    if (!copy.equals(list)) {
     System.out.println("Copied list does not match original.");
     System.out.println("Expected " + list);
     System.out.println("Got " + copy);
     return;            
    }
    System.out.println("     Passed!");
    numPassed += 2;   
    
    System.out.println("Passed " + numPassed + " / 13 tests.  Complete!");
  }
}
