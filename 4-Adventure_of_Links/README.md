# The Adventure of Links

<img src="https://upload.wikimedia.org/wikipedia/en/4/44/I_am_Error.png" width="400px" />

*Should have implemented automated testing*

## Due

## Overview

This project is a grab-bag of questions related to our recent classes:

- Implementing methods for a `LinkedList` class
- Answering some written questions related to Big-O notation
- Implementing recursive methods

This project uses **autograding** for the programming parts. You have specific test cases that your programs must pass in order to get full credit.

Submit all of your files in one zip to the assignment I'll create on Canvas.

## Links

Complete the given `LinkedList` class by implementing the following methods:

- `void push(T new)`: add the given integer to the front of the list

- `void append(T new)`: append the given integer to the end of the list

- `void insert(int index, T new)`: insert the given integer at position index

- `void set(int index, T new)`: set the node at position index to have value new

- `int get(int index)`: return the value stored at the node at position `index`

- `T pop()`: remove the first node and return its value

- `int remove(int index)`: remove the node stored at position `index` and return its value

- `void reverse()`: reverse the order of the list – do not create a new list!

- `String toString()`: return a `String` representing the values in the list

- `LinkedList<T> copy()`: return a **new** `LinkedList` that is a copy of this one

- `boolean equals(LinkedList<T> list)`: return `true` if the input list has the same values in the same order as this list; otherwise return `false`


Tests for this program are given in `LinkedListTest`. Run `LinkedListTest` and it will automatically create an instance of your `LinkedList`, call its methods, and check the results to verify that your code works as expected. **You must pass the tests to get full credit**.

- Don't modify `LinkedListTest`!
- Start by implementing the first method, testing it until you pass, then move on to the second. You'll fail the tests for methods that you haven't implemented yet, but that's not a problem.
- Look at the relevant sections in the book for tips on implementing insertion, removal, and reversal.


## Big-O




## Recursion


