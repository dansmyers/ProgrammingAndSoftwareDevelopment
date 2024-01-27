# Assignment 1 &ndash; Deliverable Programs

## Description
Write Java programs for each of the following. Create a separate `.java` file for each question and put your code in the `main` method of the class. Put all of your Java files into one ZIP archive and submit the ZIP file through the assignment on Canvas.


## Unit of Measure

My son Scott has created a new unit of length called the **Scottometer**. The purpose of the Scottometer is, in his words, "to measure the size of the solar system". Confusingly, 1 Scottometer is defined to be 1 million miles.

Write a Java program that reads a number of miles from the console (using a `Scanner`) and prints the equivalent number of Scottometers. Here is a skeleton to help you get started.

```
/**
 * Scottometer Converter
 */
 
import java.util.Scanner;
 
public class Scottometers {

    public static void main(String[] args) {
    
        // Create a Scanner that reads from the standard input
        Scanner input = new Scanner(System.in);
        
        // Add your code here
    
    }

}
```

Tips:

- Put your code in a file named `Scottometers.java`. Remember that capitalization is important for class and file names.

- Use `double` variables to store the numbers of miles and Scottometers.

- Use the `Scanner`'s `nextDouble` method to read a `double` value from the console.

- Look at the `InchesToCentimeters.java` example.


## Fake Internet Meme Money

<img src="https://static-numista.com/forum/images/56febeae99f8b.jpg" width="50%" />

Dogecoin, the favored cryptocurrency of shiba inus everywhere, currently trades for about $.16 per DOGE.

Write a program that can take a value in dollars as input and output the equivalent number of dogecoins. Print your answers to two decimal places.

Tips:

- Use a `Scanner` and the `nextDouble` method to read from the console.

- To print to two decimal places, use `System.out.printf("%.2f", dogecoins)`, where `dogecoins` is the variable that holds the number of dogecoins you want to print.

- Use a `final double` to store the conversion factor:

```
final double USD_PER_DOGE = .003;
```

## The Newton-Pepys Problem

<img src="https://cdn.aarp.net/content/dam/aarp/food/healthy-eating/2016/2016-05/1140-peeps-nation.imgcache.rev3aa6a5a0b7d521bbef63f0e833d97a8f.web.900.513.jpg" width="40%" />

Samuel Pepys (pronounced "Peeps") was a 17th Century British naval administrator, best known for the detailed diary he kept describing his life in the 1660's. In 1693 he
corresponded with Isaac Newton regarding a wager:

>Which of the following three propositions has the greatest chance of success?
>
>- Six fair dice are tossed independently and at least one six appears.
>- Twelve fair dice are tossed independently and at least two sixes appear.
>- Eighteen fair dice are tossed independently and at least three sixes appear.

What is the answer to Pepys' question? Write a simulation program to test each proposition a large number of times and report the number of times each proposition successed.

Tip: This is question 26 at the end of Chapter 1. Read the section on Monte Carlo simulation and look at the sic bo example. Write a `toss` method that takes a number `n` as input, tosses `n` dice and then reports the number of sixes that occurred. For each proposition, call `toss` in  a loop with the appropriate value of `n`, test the resulting number of sixes, and keep count of how many trials succeed.

## Magic 8-Ball

<img src="https://upload.wikimedia.org/wikipedia/commons/9/90/Magic8ball.jpg" width="30%" />

Finish the Magic 8-Ball program given in the `Magic8Ball.java` example. The program should prompt the user for a question, then return one of following ten possible answers
selected at random.

- It is certain.
- It is decidedly so.
- Signs point to yes.
- Reply hazy, try again.
- Ask again later.
- Better not tell you now.
- Concentrate and ask again.
- Don't count on it.
- My reply is no.
- My sources say no.

## RPS

Follow the instructions in `RockPaperScissors.md` to implement a Rock-Paper-Scissors game. Put your program in a file named `RockPaperScissors.java`.
