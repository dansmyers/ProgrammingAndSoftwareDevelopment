# Final Exam Review

<img src="https://imgs.xkcd.com/comics/final_exam_2x.png" width="300px" />

## Topics

Be prepared for questions on the following major topics:

- Binary search
- Big-O notation
- Array and linked lists
- Writing recursive methods
- Analyzing the complexity of a recursive method

There will be some Java coding questions, but no specific questions on OOP or other topics from the first half of class.


## Searching

Be prepared to write *correct* implementations *in Java* for the recursive and iterative versions of binary search.

You should know the basic argument for the complexity of binary search, but there won't be any questions on the proof of correctness using a loop invariant.


## Big-O notation

Know the formal definition of Big-O notation and how to use the definition to show that a polynomial function has a certain complexity. Know how to analyze code fragments.

There won't be any questions on Big-Omega or Big-Theta notation (but I would like you to be familiar with them).

Suggested studying:

- Relevant sections of Chapter 5 and their examples
- Chapter 5 questions 6-10, 14, 24, 28 


## Lists

Know the definition of an abstract data type and be able to give methods of the list ADT.

Know the implementation strategies for array and linked lists. Be able to summarize the argument that appending to an array list is *O*(*n*) on average.
Be able to give complexities for the other standard array and linked list operations and compare the two.

- See the example interview question on comparing lists. Think about how the answers change if the list is singly-linked without a tail pointer vs. doubly-linked with a tail pointer.

Be able to implement methods that iterate through a linked list. For example,

- Getting the item and given index position
- Setting the value at a given index position
- Inserting a new node at a given position
- Removing the node at a given position
- Inserting at the tail when there is no tail pointer

I won't ask you to reverse a list: that question is frightfully jejune.


## Recursion

Be able to implement a recursive function as a Java method given its description. See Chapter 8 questions 13-16.

Be able to use induction to prove that a given *T*(*n*)  satisfies a recurrence relation. I will give you the function; you won't have to guess it from cases. See Chapter 8 questions 17-19.
