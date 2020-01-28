/**
 * Reads maze files
 */
import java.util.Scanner;
import java.io.File;

/**
 * Convenience class for getting input from the mymedia.txt file
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class PrintMaze
{
    private static final String DATA_FILE = "./maze3.txt";
    private static Scanner in;
    
    /**
     * Opens a file to be used for input (if not already open),
     * reads a line from the file, and returns the entire line of data.
     * 
     * @return a line of text from the input file
     */
    public static String readString() {
        if (in == null) {
            try {
                in = new Scanner(new File(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try {
            if (in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot read  file!");
            e.printStackTrace();
        }
        return null;

    }
    
    public static char[] [] cottonPicker() {
         int numrow = Integer.parseInt(readString().trim());
        int numcol = Integer.parseInt(readString().trim());
        char[][] maze = new char[numrow + 2][numcol + 2];
        for (int i = 0; i < maze[0].length; i++) {
            maze[0][i] = '@';
            maze[maze.length - 1][i] = '@';
        }
        for (int i = 0; i < maze.length; i++) {
            maze[i][0] = '@';
            maze[i][maze[0].length - 1] = '@';
        }
        for (int i = 1; i < maze.length - 1; i++) {
            for (int j = 1; j < maze[0].length - 1; j++) {
                maze[i][j] = '.';
            }
        }
        String line = readString();
        while (line != null) {
            String[] splitString = line.split("\\s");
            int row = Integer.parseInt(splitString[0]) + 1;
            int col = Integer.parseInt(splitString[1]) + 1;
            maze[row][col] = '@';
            line = readString();
        }
        return maze;
        
    }
    
    public static void cotton() {
    String line = readString();
    while (line != null) {
        System.out.println(line);
        line = readString();
    }
}

}