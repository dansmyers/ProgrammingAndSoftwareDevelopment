/**
 * Starting LinkedList code
 */

// As before, use <T> to be the generic type of data in the list

public class LinkedList<T> {

  // Reference to the head node
  ListNode head;
  
  // Size
  int size;
  
  /**
   * Brand new list is empty: head points to null
   */
  public LinkedList() {
    this.head = null;
    this.size = 0;
  }
  
  /**
   * Add a new item to the front of the list
   */
  public void push(T newValue) {
    // 1. Make a new ListNode
    ListNode newNode = new ListNode(newValue);
    
    // 2. Make the newNode point to the current head
    newNode.next = this.head;
    
    // 3. Move the head to the newNode
    this.head = newNode;
    
    // 4. Increment size
    this.size++;
  }
  
  /**
   * get the item at a given position
   * @param index  the position to return
   * @return the value at the given index
   */
  public T get(int index) {
    // Check that the given index is in bounds
    if (index >= this.size) {
      throw new IllegalArgumentException("Index out of bounds: " + index);
    }
    
    ListNode current = this.head;
    
    // Advance current the requested number of times
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    
    // Finish by returning the value at that node
    return current.value;
  }
  
  public int size() {
    return this.size;
  }
  
  /**
   * Private internal ListNode class
   */
  private class ListNode {
    T value;  // Value stored by this node
    ListNode next;  // Reference to next node in the chain
    
    ListNode(T newValue) {
      this.value = newValue;
      this.next = null;  // New node is not automatically connected to anything
    }
  }
}
