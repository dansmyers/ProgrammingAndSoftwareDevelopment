# Assignment 3: Mindstorms

## Due Thursday, March 28


<img src="https://media.istockphoto.com/id/1464556258/vector/senior-gentleman-riding-on-a-turtle-cut-out-on-white-background.jpg?s=612x612&w=0&k=20&c=9JZz7_aLdkuLsR2XmI1kQ632sjrH3rB1Q-XiwjKmII0=" width="400px" />


## Overview

This project uses the `Turtle` class we built using the instructions in Chapter 3. You're going to write some object-oriented extensions to the `Turtle`, then use it to build your own version of the classic Logo language.


## Starting point

We previously built `Turtle` in class. If you don't have a working `Turtle`, you'll need to finish it using the instructions in Chapter 3, then work on implementing some of the example complex shapes at the end of the chapter.


## More methods

Once you have the basic `Turtle` class working, add the following additional methods:

- `turnRight`, which takes an `double angle` and turns the turtle to the right by that amount

- `penUp` and `penDown` described in the Extensions section of Chapter 3. These methods allow you to raise the turtle's pen so it can move without drawing and then lower the pen to resume drawing. You'll need to add a `boolean` variable to keep track of the state of the turtle's pen and modify move to check whether it should draw a line or not.

## Hexagons

Implement the `drawHexagon` and `hexagonRing` methods described in the Extensions of Chapter 3.

- `drawHexagon` draws a regular hexagon
- `hexagonRing` calls `drawHexagon` in a loop, turning after each call

Take a look at the rosettes and spirals at the end of Chapter 3 for some tips on how to implement these methods.

## Program

**Logo** was an old educational programming language that used simple commands to control a drawing turtle. For example, a Logo program might look like the following:

```
penup
move 25
pendown

move 50
turnleft
move 100
turnleft
move 50
turnleft
move 100
turnleft
```

Let's write our own simple Logo-style programming system.

Write a new class called `TurtleDriver` with a `main`.
