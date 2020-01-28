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
    private static final String DATA_FILE = "maze1.txt";

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
    
    public static char[] [] readFile() {
        readString();
        readString();
    }
}