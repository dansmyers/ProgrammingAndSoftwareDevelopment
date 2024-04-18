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

Complete the given `LinkedList` class by implementing the following methods. It already includes the example methods we wrote in class to `push` to the front and `get` the item at a partiular position.

- `void append(T new)`: append the given integer to the end of the list

- `void insert(int index, T new)`: insert the given integer at position index

- `void set(int index, T new)`: set the node at position index to have value new

- `T pop()`: remove the first node and return its value

- `int remove(int index)`: remove the node stored at position `index` and return its value

- `void reverse()`: reverse the order of the list – do not create a new list!

- `String toString()`: return a `String` representing the values in the list

- `LinkedList<T> copy()`: return a **new** `LinkedList` that is a copy of this one

- `boolean equals(LinkedList<T> list)`: return `true` if the input list has the same values in the same order as this list; otherwise return `false`


Tests for this program are given in `LinkedListTest`. Run `LinkedListTest` and it will automatically create an instance of your `LinkedList`, call its methods, and check the results to verify that your code works as expected. **You must pass the tests to get full credit**. Tips:

- Don't modify `LinkedListTest`!
- Throw an `ArrayIndexOutofBoundsException` if the user passes an index that's out of range
- Start by implementing the first method, testing it until you pass, then move on to the second. You'll fail the tests for methods that you haven't implemented yet, but that's not a problem.
- Look at the relevant sections in the book for tips on implementing insertion, removal, and reversal.


## Big-O




## Recursion

Complete the methods in `Recursion.java`. Like the earlier problem, it includes automated test cases to check your answers. You need to pass the automated tests to get full credit.

**You must write recursive solutions**. Do not use any loops!


### The Collatz Sequence
Given an arbitrary positive starting integer `n`, it's possible to create a sequence by repeatedly applying the following rules:

```
if n is even, the next number is n / 2
if n is odd, the next number is 3 * n + 1
```

For example, beginning with 6, the sequence is: 6, 3, 10, 5, 16, 8, 4, 2, 1

Lothar Collatz conjectured that this sequence always converges to 1 for any starting positive integer `n`. No counterexample
has ever been found, but the Collatz conjecture has never been formally proven.

Complete the method `collatz(n)`, which recursively calculates the length of the Collatz sequence beginning with `n`. For example,

```
collatz(1) = 1  (because 1 is the base case)
collatz(8) = 4  (because the sequence is 8, 4, 2, 1)
collatz(6) = 9  (because the sequence is 6, 3, 10, 5, 16, 8, 4, 2, 1)
```

Hint: the length of the sequence starting from any `n` is 1 plus the length of the remaining sequence.

### Negative Fibonacci Numbers

Recall the definition of the Fibonacci sequence:

```
fib(0) = 0
fib(1) = 1
fib(n) = fib(n - 2) + fib(n - 1)
```

The last rule can be rewritten as

```
fib(n - 2) = fib(n) - fib(n - 1)
```

or equivalently,

```
fib(n) = fib(n + 2) - fib(n + 1)
```

Using this definition, we can now extend the Fibonacci sequence to **negative values of `n`**.

```
fib(-1) = fib(1) - fib(0) = 1
fib(-2) = fib(0) - fib(-1) = -1
fib(-3) = fib(-1) - fib(-2) = 2
fib(-4) = fib(-2) - fib(-3) = -3
```

The negative side of the sequence has the same values as the positive side, but offset by 1 and with alternating signs.

Complete the method `fib(n)` which finds the `n`th Fibonacci number. Your method has to work for both postiive and negative values of
`n`.

### McCarthy's 91 Function

Mathematician John McCarthy and his colleagues defined the following function:

```
M(n) = 

    n - 10        if n > 100
    M(M(n + 11))  if n <= 100
```

This function is interesting because it evaluates to 91 for all inputs `n <= 100`. For larger values,

```
M(101) = 91
M(102) = 92
M(103) = 93

and so forth...
```

Implement the function `mccarthy(n)` to calculate McCarthy's 91 function. (No, you can't just make it return 91. You have to do the evaluation recursively.)

Tips:

- Observe that the base case is all values `n > 100`. This is an example where the base case is not 0 or 1.
- Observe that the recursive case uses a nested evaluation. You have to call `mcarthy(mccarthy(n + 11))`.
