# Practice Writing Objects

## Cars

Write a class called `Car` in a file named `Car.java`. Your class should have the following private instance variables:

- `String make`
- `String model`
- `int year`

Write a constructor that initializes the values of the instance variables, get methods for each variable, and a `toString` method.

Write a second class called `CarDriver` (hah) with a `main` method that tests your `Car` class.

## Guitars

<img src="http://getbusyyall.files.wordpress.com/2011/09/pointy-guitar.jpg" width="35%" />

*Much pointies. Such metal.*

<img src="https://www.dreamguitars.com/shop/media/catalog/product/cache/1/thumbnail/9df78eab33525d08d6e5fb8d27136e95/1/9/1990s-klein-electric-066-1.jpg" width="35%" />

*Round guitars are totally not metal.*

Write a class called `Guitar` that represents a totally sweet rock n' roll guitar. Your guitar should have the following variables:

- `String brand`
- `String model`
- `int numStrings`
- `boolean isPointy`

Give your class a constructor, `toString`, and get methods for each variable. In addition, write an `isRound` method that returns the opposite of `isPointy`

## Recursion Recurrence

### Everyone Needs a Hobby

<img src="https://upload.wikimedia.org/wikipedia/commons/4/41/White_Temple_ziggurat_in_Uruk.jpg" width="35%" />

*The Anu ziggurat was built by the ancient Sumerians at the city of Uruk in approximately 4000 BCE.*

One of my favorite activities is building stone ziggurats in my backyard. To build an *n*-level ziggurat, I first lay down an *n* x *n* square of stones for the first level, then an (*n* - 1) x (*n* - 1) square of stones for the second level, and so forth, until I finally place a single stone on the top.

Write a **recursive function** called `public static int stones` that takes a positive integer *n* as input and calculates the total number of stones in an *n*-level ziggurat. For example, a four-level structure has

4<sup>2</sup> + 3<sup>2</sup> + 2<sup>2</sup> + 1 = 30

total stones.

Tip:

The recursive relationship is

```
stones(n) = n * n + stones(n - 1)
```

Think about the base case: What value of *n* allows you to return immediately without doing any recursive work?


## Mutant Bunnies

<img src="https://i.pinimg.com/originals/c7/6f/44/c76f44b3ce4aac376292b8e0b911f95e.jpg" width="35%" />

A group of *n* bunnies are standing in a line. The bunnies at odd-numbered positions have the standard two ears, but the bunnies standing at even-numbered positions are **mutated** and have ***three*** ears.

Write a **recursive function** called `public static int ears` to calculate the total number of ears in a line of *n* bunnies.

The base case is one bunny having the conventional two ears. The recursive case has the general form:

```
ears(n) = ears for the Nth bunny + ears(n - 1)
```

That is, the total number of ears for the line of *n* bunnies is the number of ears on bunny *n* plus the total ears of the remaining *n - 1* bunnies. The number of ears for bunny *n* is either two or three, depending on whether *n* is even or odd.
