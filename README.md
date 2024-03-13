# Lab 6 - Isn't Life Grand?
Due: Sun 3/17 before class

## Purpose
In this lab students will get practice in:  
1. Creating Multidimensional Arrays 
2. Manipulating Multidimensional Arrays
3. Creating their own classes

## Problem
Conway's Game of Life is a famous example of a zero-player game in which the initial state of the board determines how
the rest of the game plays out. If you have never tried it before, play it [here](https://playgameoflife.com/). Your
task today is to create a text based version of this.

## Requirements
You must write the `Life` class such that it will play Conway's game of life. The game is played on a grid of cells.
The size of the grid is chosen by the user and the user selects which cells begin "alive." From that point on, the game
moves in rounds. The rules for a cell on any subsequent round are:
1. Any cell touching exactly 3 live cells is alive on the next round.
2. Any live cell touching exactly 2 other live cells is alive on the next round. 
3. In all other cases, the cell either dies or remains dead either through loneliness or overcrowding.

The edges of the board are all considered to have dead cells beyond them.

## Design
You have been given a `Main` class which implies the existence of a constructor and three methods of your `Life` class.
* Constructor - takes a number of rows and columns to create the game board
* `birthCell(int xposition, int yposition)` - creates a live cell in the specified position, if possible
* `advanceTime()` - changes the board position to the next round of play
* `toString()` - prints out the board

You are required to use a 2 dimensional array to store the current state of the game board, though it can be of 
whatever type you would like to use to display the game. You may find it useful to create a few private methods to
support some of your public methods.

Before you begin coding, create **design.txt**. This file should contain an *algorithm* for your `advanceTime()` method.
Should this to your lab instructor before beginning. 

### Extra Credit
Instead of the edges of the board having dead cells, assume that the board wraps around on itself. That is, the top row
is next to the bottom row and the left-most column is next to the right-most column.

## Testing
Conway's Game of Life has some well known behaviors. To test your code, try creating a few of the still lifes or 
oscillators from [this wikipedia article](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#Examples_of_patterns).
If you really want to play with it, try the spaceships. A glider is relatively simple to input. Or, compare your output
to the graphical one, above.

## Submission
To GitHub, 1 per group:
* **design.txt** containing your algorithm for `advanceTime()`
* All the code you need to run your game

To Moodle, 1 per person:
* A reflection containing at least answers to the following:  
  * Had you every heard of Conway's Game of Life and what do you think of it?
  * What were the hardest and easiest parts of the lab?
  * How comfortable are you with 2D arrays? Did this lab help you think about them?
  * How did working with your partner go?
