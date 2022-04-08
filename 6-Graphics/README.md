# Unit 5 &ndash; Graphical Games

<img src="https://i.pinimg.com/originals/59/6c/ea/596cea092c81b88801087b5f8948c9d5.jpg" width="35%" />

## Deliverables and Challenge Project are due on Tuesday, 4/19

## Overview and Goals

Our goal in this unit is to continue our discussion of object-oriented programming in Java by writing some more complex programs that combine classes and objects with 
graphical output. There will be few new features added during this sprint, but we'll be building on what we learned last time to create larger programs. By the end
of this sprint, you should have a good grasp of creating objects that represent specific entities in a program and using their properties and methods to implement
non-trivial interactions.

## Deliverables

Complete the project in `Deliverables`. Remember that you may work with another person and you may use any resources that you find helpful to
complete the project. Put each program into its own `.java` file, then put all of your files into a ZIP archive and submit them through the assignment posted to Canvas.

## Challenge Project

The challenge project folder contains a second graphical game for you to implement. You can complete that one, or you can make **any other classic game that you want** using `StdDraw` functions and our object-oriented programming techniques.

This is intentionally open, so you have lots of choices. You don't have to be super ambitious or implement crazy features, just focus on getting the basic gameplay of your choice and then incrementally making it better. Take a look at the basic challenge project for some tips and guidelines that will be helpful no matter what game you choose to do.

Some options:

- *Space Invaders* is a good choice. Use an `ArrayList<Square>` to represent the enemy alien ships
- *Centipede* is like *Snake* plus a shooting element
- *Tetris* is cool, but very difficult. If you try it, I think the best approach is to use a 2-D array of Square objects to represent the board and represent each piece as a collection of Squares. The piece drops down until dropping it further would intersect it with another Square that's already in the array. Again, this one is pretty hard.

I've also given you one more example that uses the mouse: *Minesweeper*. You can use that as a template for click-based games.

## Reading

There's **no required reading** for this assignment.

## Java Features

At the end of this project, you should be comfortable with the following Java features:

- Creating your own classes to represent "things" in your program.

- Adding instance variables and methods to your classes.

- Java's access modifiers: `public`, `private`, `protected`, and default access modifier.

- Writing and calling constructor methods.

- Using a "driver" class to serve as the `main` for a program.

- Creating a moderately large program using object-oriented principles.

- Using the `StdDraw` library to create graphical programs and games.


## Schedule and Tips

Most of the material that we'll cover in this unit is an extension of the previous unit. If you're not 100% comfortable with objects and classes yet, review the `Book` 
class and the other simple examples from the last unit. You can also review the `Ball`, `SecretCollect`, `Pong`, and `Snake` labs.
