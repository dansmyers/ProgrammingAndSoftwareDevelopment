# WAKA WAKA WAKA WAKA WAKA WAKA WAKA WAKA WAKA

## Due Tuesday, April 19


## Overview

Here is your next object-oriented programming challenge: write your own version of *Pac-Man*, the grandaddy-of-them-all and greatest-of-all-time eat-'em-up arcade game.

Here is a refresher if you need one:

https://www.youtube.com/watch?v=dScq4P5gn4A

![](http://www.playthepast.org/wp-content/uploads/2011/10/636x460design_01.jpg)

## Reading

Complete the **participation questions** for Chapter 3 of the ZyBook. You **do not** need to complete the challenge questions or any optional or hidden sections.

## Honor Code

Add a file to your project that contains your name, a statement of the Honor Code, and references for any external resources you used in preparing your project.

## Details

The basic game has four elements:

- Pac-Man (or Ms. Pac-Man, if you prefer)

- The Ghosts

- The pellets that Pac-Man eats. Eating all the pellets ends the level.

- The walls that block both Pac-Man and Ghost movements.

For our version, the only requirement will be to navigate Pac-Man through a maze, avoiding the ghosts, until he eats every pellet. The layout of the level does not have to copy the classic Pac-Man board: it will be easier to start with a simpler layout.

Keep the graphics simple:

- Pac-Man can be a yellow circle.

- The ghosts can be colored squares.

- The pellets are small circles.

- The walls are solid rectangles.

Note: there are ways to incorporate images and more complex shapes with `StdDraw` functions. You might want to experiment with those after you get the core game working. See the last section for more ideas on advanced features you can add.

**All of your code must use an object-oriented style**. Do not access any object properties directly from `main`! All object instance variables must be `private` and accessed through appropriate methods.

## Classes

The project repo comes with five classes:

- `Game.java`: the `main` method and game loop.

- `PacMan.java`: represents Pac-Man, all of his attributes, and relevant methods.

- `Ghost.java`: a ghost, with its attributes and relevant methods.

- `Pellet.java`: a pellet, with variables representing its location.

- `Wall.java`: a single rectangular wall.

The classes have a few methods and game elements in place to help you get started, but they're far from complete. You'll probably need to add methods and parameters to each class as you build out the game features.

## Gameplay

The basic loop is similar to the other games we've written. Each class has a `draw` method and Pac-Man and the Ghosts have `update` methods that implement their movement logic. The game ends when Pac-Man eats all of the pellets or when he collides with a Ghost.

You should be able to draw on your previous labs and projects to write most of the code.

The `Pellet` objects are stored in an array. You can test for collisions between Pac-Man and pellets (using a suitable method) and `null` pellets that are eaten, similar to how we handled broken bricks in the Breakout game.

Handling the walls might be the trickiest part. You need to check for wall collisions when moving Pac-Man and the Ghosts, to preven moving into blocked-off areas. There are two basic strategies:

- Have Pac-Man check for `Wall` collisions during his `update` method: if a move would cause him to collide with a `Wall`, don't allow the move. This requires Pac-Man to have access to the array of `Wall` objects during his `update` method.

- Test for `Wall` collisions in the main game loop, after the update step. If a collision occurs, call an `undo` method that restores Pac-Man to his previous position, before the most recent update took place. This requires keeping track of Pac-Man's old position.

- Whichever strategy you pick, use the same one to handle Ghost movement.

## Questions You May Have

**How many ghosts?** Start with just one, then add more as you see fit. Four may make the game feel too crowded, so you can have fewer if it seems better.

**How should the ghosts move?** You can decide what strategy the ghosts should follow. In the original game, each ghost had its own movement rules, which were not random:

https://www.youtube.com/watch?v=ICwzQ0_RCcQ

The easiest choice is probably to have the ghosts move randomly or to chase Pac-Man (this is aggressive). This is an area where you can experiment after you have the basic structure implemented.

**Do the ghosts have to be different?** No, all of the ghosts can look the same and have the same behavior.

**How should the maze look?** You can pick any configuration of walls you want. You don't have to copy the classic Pac-Man game board. I recommend hard-coding one maze that you use for all of your development. Randomizing the maze is not hard, but might result in some pellets or areas being unreachable. Also, it's okay to have open spaces on your game board: start with a few walls and add more if you feel like it.

**What about the power pellets?** These are the big pellets that allow Pac-Man to eat the ghosts. You don't have to add these as part of the basic game (because it requires distinguishing between "powered up" and regular Pac-Man with a timer to turn off the power-up), but you can think about it as an extra feature once you have a ghost AI that you like.
