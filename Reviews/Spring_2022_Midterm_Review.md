# Spring 2022 Midterm Review

<img src="https://imgs.xkcd.com/comics/bug.png" width="30%" />

## Overview

The exam is 12 questions, all short answer and worth the same number of points. Remember that under our specs grading system you only need to **pass** the exam in order for it to count towards a passing grade for the overall class. In order to pass, you must

1. Make a reasonable attempt at every question. You can't leave any questions blank or write something completely irrelevant.
2. Earn at least 60 / 100 total points across the 12 questions. I will award full credit to answers that are substantially complete and correct (there may be issues but only minor ones) and half credit to questions that are partially correct.

You will not have to write classes or complete programs, but there are some questions that ask you to write methods. I won't penalize you for minor syntax errors but I reserve the right to deduct points for major errors or repeated mistakes that show a lack of familiarity with basic Java syntax or style.

## Basic Java

Know the eight basic primitive types and examples of each one.

Be able to write code fragments that use `for` and `while` loops. Be able to write `static` methods that take input parameters and return a result.

### Example questions

Write a `for` loop that iterates through the numbers from 1 to 50 and prints the ones that are divisible by 5 or 8. Convert your loop to an equivalent `while` loop.

## Strings

Know the most important `String` methods:

- `length`
- `charAt`
- `substring`
- `equals` and `equalsIgnoreCase`

Remember that you can't use `==` to compare `String` objects for equality! 

Know the difference between *value equality* (two strings have the same sequence of characters) and *reference equality* (two string variables refer to the same underlying object in memory).

### Example questions

Write a loop that prints all of the characters in a `String`.

Write a loop that counts the number of `'a'` characters in a `String`.

Write a boolean method named `startsWithQ` that takes a `String` as input
and returns `true` if the `String` starts with `'q'` and `false` otherwise.

Write a boolean method named `endsWithLY` that takes a `String` as input
and returns `true` if its last two letters are `'l'` and `'y'` in that order
and returns `false` otherwise. Tip: think about how to access the last and next-to-list characters of the `String`.

Write a code fragments that creates two objects that have value equality but not reference equality.

## Arrays

There will be a question about looping over 2-D arrays.

### Example Questions

Initialize a 5x5 2-D array and fill it with the numbers 1 to 25.

Print all of the elements of a 2-D array in matrix style.

Write a method that takes a 2-D array as input and returns its maximum element.

Write a method that takes a 2-D array as input and returns the sum of its elements.

## Recursion

Be able to write a recursive method given a mathematical description of its base and recursive cases. There **won't** be any recursive `String` methods.

### Example Questions

Look at the examples from the homework and class (McCarthy's function, ziggurats, Fibonacci, bunnies, etc.).

## Object-Oriented Programming

What is the significance of the `static` keyword when applied
to a method in a Java class?

Define the term **encapsulation** as it applies to object-oriented
programming. Why is encapsulation beneficial for programmers?

Give two examples of encapsulation in Java classes that we have used.

Name and describe the four access modifiers.

## Files

Be able to write a code block that opens a file (using `try`-`catch` and `Scanner`) and then loops through and prints each line of the file.
