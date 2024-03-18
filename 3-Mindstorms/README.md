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

<img src="https://cdn-blog.adafruit.com/uploads/2021/09/Untitled-114.png" width="400px" />

*AdaFruit: [The History of the Logo Language](https://blog.adafruit.com/2021/09/21/the-history-of-the-logo-language-an-updated-post-vintagecomputing-programming-history/)*

<br/>

**Logo** was an old educational programming language that used simple commands to control a drawing turtle. For example, a Logo program might look like the following:

```
; Move without drawing
penup
move 25
pendown

; Turn to an angle
turnleft 45

; Draw a rectangle
move 50
turnleft 90
move 100
turnleft 90
move 50
turnleft 90
move 100
turnleft 90
```

Let's write our own simple Logo-style programming system.

- Write a new class called `TurtleDriver` with a `main`

- At the start of `main`, initialize a new `Turtle`

- Open an input file named `example.tl` with a `Scanner`

- Iterate through the lines of the file and execute the `Turtle` command described by each one.

For example, your code might look like the following.

```
/**
 * Main method of TurtleDriver
 */
public static void main(String[] args) {

  // New Turtle
  Turtle t = new Turtle();

  //*** TODO: Add code to create a Scanner and open the example file ***//

  // Loop through the file's lines
  while (input.hasNext()) {
    // Read the next line
    String line = input.next();

    //*** TODO: Skip lines that start with a semicolon ***//

    // Split the line into the command and any additional arguments
    String[] parts = line.split();
    String command = parts[0];

    // Move command    
    if (command.equalsIgnoreCase("move")) {
      // Move distance is the second part of the command
      int distance = Integer.parseInt(parts[1]);

      // Call the turtle method
      t.move(distance);
    }

    //*** TODO: Add cases for other commands ***//
  }
}
```

You should support the following basic commands
- `move DISTANCE`, where `DISTANCE` is the number of pixels to move forward
- `turnleft ANGLE`, where `ANGLE` is the turn angle in degrees
- `turnright ANGLE`
- `penup`
- `pendown`
- Lines beginning with semicolons are comments

Test your program on the given example file, then write your own `.tl` file that draws a different image.
