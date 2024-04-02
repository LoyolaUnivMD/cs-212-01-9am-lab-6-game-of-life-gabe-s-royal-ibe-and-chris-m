import java.util.Scanner;
// Programmers:  [Royal Ibeadogbulem, Gabe, Chris ]
// Course:  CS 212
// Due Date: 3/17/2024
// Lab Assignment: 6
// Problem Statement: Create a program that runs the Game of Life
// Data In: Rows, Column, x-coordinate, y-coordinate
// Data Out: Game Generation

class game {
    int rows;
    int columns;
    int [][] grid;

    public game(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.grid = new int [rows][columns]; // Initialize the grid with given dimensions
    }

    public int [][] getGrid(){
        return grid; // Return the current state of the grid
    }
    
    public void birthCell(int xposition, int yposition){
        grid[xposition][yposition] = 1; // Set the cell at a given position as alive
    }
    
    public void advanceTime(){
        int[][] newGrid = new int[rows][columns]; // Create a new grid to store the next generation
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                int count = countLive(i, j); // Count the number of live cells surrounding the current cell
                if (grid[i][j] == 1) {
                    // Cell is alive
                    if (count == 2 || count == 3) {
                        // Cell survives
                        newGrid[i][j] = 1;
                    } else {
                        // Cell dies due to loneliness or overcrowding
                        newGrid[i][j] = 0;
                    }
                } else {
                    // Cell is dead
                    if (count == 3) {
                        // Cell comes to life
                        newGrid[i][j] = 1;
                    } else {
                        // Cell remains dead
                        newGrid[i][j] = 0;
                    }
                }
            }
        }
        grid = newGrid; // Update the current grid with the next generation
    }
    
    int countLive(int x, int y) {
        int count = 0;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            if (newX >= 0 && newX < rows && newY >= 0 && newY < columns && grid[newX][newY] == 1) {
                count++; // Increment count if the surrounding cell is alive
            }
        }
        return count; // Return the count of live neighbors
    }
    
    void printGrid() {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1)
                    System.out.print("O "); // Print 'O' for alive cell
                else
                    System.out.print("X "); // Print 'X' for dead cell
            }
            System.out.println();
        }
    }
}
                
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Welcome to [Isaacman's] Conway's Game of Life!");
        System.out.println("How big would you like the board?");
        System.out.print("rows: ");
        x = in.nextInt();

        System.out.print("columns: ");
        y = in.nextInt();

        game Game = new game(x,y);
        int [][] grid = Game.getGrid();
        do {
            System.out.println("Place a cell or enter -1 for either coordinate.");
            System.out.print("x coordinate: ");
            x = in.nextInt();

            System.out.print("y coordinate: ");
            y = in.nextInt();

            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length)
                Game.birthCell(x, y);
        } while( x >=0 && y >= 0);

        System.out.println("Your starting board:");
        Game.printGrid();

        in.nextLine();

        String next;
        System.out.println("Instructions: To advance time, hit enter. To quit, type anything before hitting enter.");
        next = in.nextLine();
        while(next.isEmpty()){
            Game.advanceTime();
            Game.printGrid();
            next = in.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}
