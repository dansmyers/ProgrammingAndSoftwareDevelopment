# Classes and Objects &ndash; Deliverables

## Description

You have two projects to complete:

- An implementation of John Conway's *Game of Life*, an **artificial life** simulation that models the births and deaths of cells living on a 2-D grid. 
Life is the best-known example of a **cellular automaton** and is famous for the intricate patterns it can produce without human input.

- Reading data from a file to answer questions about songs and artists that have appeared on the *Billboard Hot 100* record charts.
 
The Life project has starter code in the `Deliverables` directory, which you must use to develop your solution. Note that this project is more complex than anything we have developed so far.

- Take time to carefully read the descriptions and really understand the requirements for each problem.
 
- **Develop incrementally** and **test your code frequently as you develop**.
 
- **Start early**! Don't wait until the last minute. In particular, you should be able to write most of `Life` right away.

### Life

<img src="https://external-preview.redd.it/U38P67RJ7qavOCX3MDmFRoIN1Ht5WXK_O4-zm8IwSpc.jpg?auto=webp&s=002ab4f1c7de99b320f3968b3d8e671b0abf7a50" width="35%" />

*Some people take this stuff really seriously.*

Read through the description in the `Deliverables` directory. Your job is to complete the `Life` class, which will include all of the logic needed to implement the simulation. The `Life` project includes a driver class named `RunLife` that implements four automated patterns.

- A simple three-square blinker that alternates between vertical and horizontal

- A glider, the iconic Life pattern that walks diagonally across the grid

- A more complex flashing pattern

- **Gosper's Glider Gun**, a pattern that produces an infinite stream of gliders. The Gun is named after Bill Gosper, who created it in 1970, winning $50 from 
John Conway for discovering the first Life pattern that could produce an infinite number of living cells.

Don't modify `RunLife`, but you may want to look at it to understand how it uses the `Life` class.

### Number One Jams

<img src="https://upload.wikimedia.org/wikipedia/en/c/cc/Lady_Gaga_-_Bad_Romance.png" width="25%" />

*The greatest record of the 21st Century so far is "Bad Romance" twelve times*.

*Billboard* magazine publishes weekly charts tracking the popularity of songs and albums across a variety of genres. 

In this project you’ll work with a data set containing information from 64 years of the *Billboard* charts.
We're going to work with data taken from the **Hot 100**, which tracks the 100 most popular songs in the country, determined
by aggregating various factors, including radio airplay and, in the modern era, streams.

This is intentionally a shorter project that will allow you to practice working with files before we dig into the remaining major
projects in the second part of the course.

The data for the project is taken from the TSorT music pages, which compile lots of information about music charts from all over the world:

https://tsort.info/music/

I have processed the raw CSV file containing all of their chart entries to extract only the data for songs that made the US Hot 100 
music charts from 1950 to the beginning of 2013, which was the most recent data at the time I put together the data set.

The data file is posted to Canvas--it's called `billboard_chart_data.txt`. When you copy it into
Eclipse, make sure you place it in the top-level directory for a project (that is, the folder that has the name of the project), not in the lower-level `src`
folder.

#### File Contents

 <img src="https://upload.wikimedia.org/wikipedia/en/a/ad/Gangnam_Style_Official_Cover.png" width="25%" />

If you open the file you'll see lines like these:

```
Psy;Gangnam Style;2012;2;31
Adele;Skyfall;2012;8;20
Flo-Rida & Sia;The Wild Ones;2012;5;36
Justin Bieber;Die In Your Arms;2012;17;2
Jason Mraz;I Won't Give Up;2012;8;44
Madonna;Give Me All Your Luvin';2012;10;6
Taylor Swift;Stay Stay Stay;2012;91;1
Alicia Keys;Girl On Fire;2012;11;30
Katy Perry;Wide Awake;2012;2;26
Carly Rae Jepsen;Call Me Maybe;2012;1;50
Skrillex;Bangarang;2012;72;20
Calvin Harris;Feel So Close;2012;12;26
Melanie Martinez;Too Close;2012;94;1
Glee Cast;Black Or White;2012;64;1
Terry McDermott;I Want to Know What Love Is;2012;84;1
Neon Trees;Everybody Talks;2012;6;39
Ellie Goulding;Lights;2012;2;56
Glee Cast;Wanna Be Startin' Something;2012;78;1
Adam Levine;Yesterday;2012;68;1
The Lumineers;Ho Hey;2013;3;62
```

Each line records information on one song. The five fields are:
- The artist
- The song title
- The year the song was released
- The maximum position attained by the song during its life on the charts
- The total number of weeks on the charts

The fields are separated by **semicolons**.

For example, the output above shows that Psy's "Gangnam Style", released in 2012, made it up to number 2 and spent a total of 31 weeks
on the charts.
 
 
#### Example Programs

Take a look at `ChartData.java` in the `Examples` directory, which shows how to open the file, loop through its lines using a `Scanner`, and how to use
a second `Scanner` to parse out the five fields of each line.

Use that program as a guide as you write new programs to answer the questions below.

 
#### Questions
<img src="https://upload.wikimedia.org/wikipedia/en/f/f5/Elvis_Presley_LPM-1254_Album_Cover.jpg" width="25%" />

Write Java programs to answer each of the following questions. This project is worth **five** total points, one point per question. You will receive full credit
for a question if your program produces output that gives a satisfactory answer.

1. Which artist has more all-time chart appearances: Prince or Madonna? Tip: Only count appearances as solo artists, so you only need to match songs
by "Prince" and "Madonna".

2. Find and print all of the number one hits by Elvis Presley.

3. Which song spent the greatest total number of weeks on the charts?

4. How many unique artists are in the entire data set? This is not the same as the number of lines in the file, because many artists have had multiple
charting songs. The easiest way to create a set of the unique artists is to use a `HashSet<String>`, which maintains a set of values with no duplicates.
Take a look at [the `HashSet` documentation](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html); use the `add` method
to put a new item in the `HashSet` and the `size` method to get the size of the final set at the end of the program.

4. A major change in the charts took place in late 1991, when *Billboard* switched to using Nielsen’s SoundScan 
technology to automatically track radio play of songs. Prior to 1991, song popularity was determined from surveys filled 
out by radio stations. It’s been said that the switch to SoundScan led to popular songs remaining on the charts longer
than the old survey system. Determine if this is empirically true by calculating the average time spent on the charts
for songs released in 1991 or earlier and songs released in 1992 or later.

