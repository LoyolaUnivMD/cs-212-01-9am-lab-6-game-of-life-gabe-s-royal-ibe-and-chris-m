import java.util.Scanner;

class game {
    int rows;
    int columns;
    int[rows][columns] grid;

    public game(int rows, int columns, int grid [rows][columns]){
        this.rows = rows;
        this columns = columns;
        this grid = grid;
    }
    public void birthCell(int x position, int y position){
        grid[xposition][yposition] = "O";
    }
    public void advanceTime(){
        for (int i = 0, i < grid.length, i++){
            for (int j = 0, j < grid[].length, j++){
                int count = 0;
                if (grid[i+1][j].equals("O"){
                    count += 1;
                }
                if (grid[i-1][j.equals("O"){
                    count += 1;
                }
                if (grid[i][j+1].equals("O")
                    count += 1;
                if (grid[i][j-1].equals("O"){
                    count += 1;
                }
                if (grid[i+1][j+1].equals("O"){ 
                    count += 1;
                }
                if (grid[i-1][j-1].equals("O"){
                    count += 1;
                }
                if (grid[i+1][j-1].equals("O"){
                    count += 1; 
                }
                if (grid[i-1+[j+1].equals("O"){
                    count += 1;
                }
                if !(count == 2 or count == 3){
                    grid[i][j] = "X";
                }
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
        y = in.nextInt();

        System.out.print("columns: ");
        x = in.nextInt();

        Life game = new Life(x,y);

        do {
            System.out.println("Place a cell or enter -1 for either coordinate.");
            System.out.print("x coordinate: ");
            x = in.nextInt();

            System.out.print("y coordinate: ");
            y = in.nextInt();

            game.birthCell(x,y);
        } while( x >=0 && y >= 0);

        System.out.println("Your starting board:");
        System.out.println(game);

        in.nextLine();

        String next;
        System.out.println("Instructions: To advance time, hit enter. To quit, type anything before hitting enter.");
        next = in.nextLine();
        while(next.isEmpty()){
            game.advanceTime();
            System.out.println(game);
            next = in.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}
