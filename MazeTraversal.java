import java.io.*; 
import java.util.*;

public class MazeTraversal {
    
    private static char[][] maze;
    
    private static void printMaze() {
        System.out.println();
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main () {
        maze = PrintMaze.cottonPicker();
        printMaze();
    }
}
