# Spring 2022 Final Exam Review

## Exam Details



## Big-O Notation and Complexity

### Functions
Be able to look at a mathematical function and give its order of growth. Remember: identify the fastest growing term, ignoring any constants.

- *f(c) = .001 c<sup>4</sup> + 100 c<sup>3</sup>*
- *g(n) = log(n) + sqrt(n)*
- *w(n) = n<sup>100</sup> + 2<sup>n</sup>*

### Get Huge
Use the "get huge" method to prove that a function satisfies the formal definition of *O(g(n))* for a given function *g(n)*.

> Show that *f(n) = .5 n<sup>4</sup> + 100 n<sup>2</sup> + 1000* is *O(n<sup>4</sup>)*.

Using the "get huge" technique, we'll raise each term to the 4th power, since *n*<sup>4</sup> is greater than *n*<sup>2</sup> and *n*<sup>0</sup> for large values of *n*. This change yields an inequality,

*f(n) <= .5 n<sup>4</sup> + 100 n<sup>4</sup> + 1000 n<sup>4</sup>*

Combining terms on the right side gives

*f(n) <= 1100.5 n<sup>4</sup>*

which satisfies the formal definition of Big-O notation by showing that the original *f(n)* is upper-bounded by a multiple of *n*<sup>4</sup> for all *n* >= 1.

### Data

Be able to look at a table of performance measurements and describe the complexity relationship between the outputs and inputs. For example,

```
input size      run time
----------      --------
1000            5000 ms
2000            20000 ms
4000            80000 ms
8000            320000 ms
```

Doubling the input size increases the run time by a factor of four, so run time scales *quadatically* with peformance in this example. That is, if the input size is *n*, then performance is *O(n<sup>2</sup>*.

Try writing down tables that would show different relationships (e.g. linear, quadratic, cubic).


## Binary Search

### Code

You should be able to write down a pseudocode version of binary search **from memory**. This is sufficiently important that I think asking you to memorize it is reasonable.

### Search Comparisons

Insertion sort is an okay but not amazing sorting algorithm that runs in *O(n<sup>2</sup>)* time.

Suppose you have a large array of data that you need to search one time. Which is faster: linear search, or sorting the data with insertion sort and then applying a binary search?

Hint: think about the total amount of work required in each case.

## Revenge of the 2-D Arrays

Make sure that you haven't forgotten how to write loops that iterate over a 2-D array.

## Recursion

Recursion is supa important, so I'll ask you another question for writing a recursive method given a description of a recursive function. Review the earlier examples from the homework and midterm review.

## ArrayList

Know how to declare and construct and ArrayList. Know how to use the most important methods: `add`, `get`, `insert`, `remove`, `size`

Absolute banger of a question: write versions of linear and binary search that operate on an ArrayList rather than a regular 1-D array. This is not that bad, but you have to remember that you can't use `[ ]` to access individual elements of the list.



