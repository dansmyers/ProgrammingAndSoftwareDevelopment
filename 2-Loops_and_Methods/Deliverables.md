# Problems

## I Would Like to Say a Few Words

<img src="https://img.ifunny.co/images/c0a91be0159716612bffdd06abe7a13fd8071846bf69e7f70ba4c8d0ebb9f495_1.jpg" width="50%" />

Write a program that uses a `while` loop to prompt the user to enter a `String`. Keep prompting until the user types one of the following words:

```
nitwit
blubber
oddment
tweak
```

Tip:

- Use a `Scanner` with the `next` method to read a `String` input from the terminal.

- Use the `equals()` method to check if the input string is equal to one of the test words. **You can't compare strings using `==`**.


## If They're the Super Mario Bros., Does That Mean His Name is Mario Mario?

<img src="https://i.ytimg.com/vi/_lSfM7F-_2E/hqdefault.jpg" width="30%" />

At the end of most levels in the original *Super Mario Bros.*, Mario jumps up a stair like the following:

```
     ##
    ###
   ####
  #####
 ######
#######
```

Write a set of loops that print Mario-style stairs of arbitrary height. Prompt the user to input the height of the staircase.

Use a `for` loop to iterate over the height of the stairs. Use two inner loops, one to print the number of spaces and another
to print the number of blocks on the line.

```
for (int i = 0; i < height; i++) {

    // Figure out the number of spaces and number of stars on line i

    for (int sp = 0; sp < numSpaces; sp++) {
        // Print a space
    }
    
    for (int st = 0; st < numStars; st++) {
        // Print a star
    }
    
    // Use System.out.println() to go to the next line
    
}
```

Tips: 

- The first line has `height - 1` spaces and 2 blocks. The second line has `height - 2` spaces and 3 blocks.

- Use a `Scanner` with the `nextInt()` method to read the height of the staircase. You can assume the user inputs a valid number.

- You can use `System.out.print()` (not `println`) to print without automatically moving to the next line.

## Subtraction Game

Here's a mathematical strategy game.

Beginning with a pile of 21 stones, players alternate removing stones until none are left. On her turn, a player may take 1, 2,
or 3 stones. The player who takes the last stone is the winner. This game is known by a few different names, inluding *the Subtraction Game* and *Nim*. 
It was featured as a challenge on an episode of *Survivor: Thailand*, where it was called *Thai 21*.

There are lots of variations:

- Changing the number of stones or the numbers that may be removed on each turn.
- Using multiple piles of stones. In classic Nim, a player may take as many stones as he wants, but from only one pile at a time.
- Playing a *misère* game (French for "destitution"), where the player who takes the last stone **loses**.

Write a program that implements the Thai 21 version of the Subtraction Game. Use the skeleton below to get started.

This program shows a useful strategy for game programs. You might think that the best way to handle a two-player game is to put both player's turns inside the the loop: on each iteration,
have player 1 make a move, then have player 2 make a move. This works, but it makes ending the loop tricky, because you don't want to do player 2's turn if player 1 wins. 

Here, we're going to use the loop to play just one turn. The `player` variable keeps track of which player's turn it is. The end of the loop switches to the other player.

```
/**
 * Subtraction Game
 *
 * @author CMS 167
 */

import java.util.Scanner;

public class SubtractionGame {
    
    
    /**
     * Main
     */
    public static void main(String[] args) {
    
        boolean playing = true;  // Guard variable
        int stones = 21;
        int player = 1;
        
        
        // TODO: Initialize a Scanner to read from the terminal
        
        
        // Main game loop
        while (playing) {
        
            System.out.println();
            System.out.println("Stones: " + stones):
            System.out.println("It's your turn, Player " + player + ".";
            System.out.println("Take 1, 2, or 3 stones from the pile.");
            
            
            // TODO: Use nextInt() to get the player's move
            
            
            // TODO: Reduce the number of stones
            
            
            // TODO: Check the winning condition
            
            // If stones == 0, print a winning message and set playing = false;
            
            // else, switch to the other player
        
        }
        
    }

}
```

### Specifications

To get full credit for this program, you must do the following:

- Prompt the user to enter a number of stones.

- Correctly read the input.

- Verify that the input value is 1, 2, or 3 and doesn't exceed the number of remaining stones. If the user enters a bad value, print an error message, then use `continue` to return to the top of the loop.

- Update the number of stones.

- Correctly end the game with a winning message when the number of stones reaches 0.

- If the game has not ended yet, switch to the other player.
