package Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.MouseInfo;

/**
* Console functions are standard C# functions

* WriteLine();
* ReadLine();
* ReadKey();
* GetCursonPosition();
*/
public class Console {
    /**
     * Prints the string representation of the provided object to the standard output (System.out).
     * 
     * @param arg The object to be printed to the standard output. It can be of any data type, as the
     *            method will call the toString() method of the object to obtain its string representation.
     */
    public static void WriteLine(Object arg){
        System.out.println(arg);
    }
    /**
     * Reads a line of input from the standard input (System.in) and attempts to parse it as an integer.
     * 
     * @param dataType An integer indicating the type of data to read. This parameter is not used in this method
     *                 but is included for illustrative purposes.
     * @return The integer value read from the standard input, or 0 if the input could not be parsed as an integer
     *         or if an error occurs during input reading.
     * @throws NoSuchElementException If there is no more input to read from the standard input.
     * @throws IllegalStateException  If the scanner is closed or has been closed.
     */
    public static int ReadLine(int dataType){ 
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                return (int) input;
            }
        }
        return 0;
    }
    /**
     * Reads a line of input from the standard input (System.in) and returns it as a String.
     * 
     * @param dataType A String indicating the type of data to read. This parameter is not used in this method
     *                 but is included for illustrative purposes.
     * @return The String value read from the standard input, or null if no input is available or if an error occurs
     *         during input reading.
     * @throws NoSuchElementException If there is no more input to read from the standard input.
     * @throws IllegalStateException  If the scanner is closed or has been closed.
     */
    public static String ReadLine(String dataType){
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextLine()){
                String input = scanner.nextLine();
                return (String) input;
            }
        }
        return null;
    }

    /**
     * Reads a single character from the standard input (System.in) and returns it as a char.
     * 
     * @return The character read from the standard input.
     * @throws UnsupportedOperationException If there is an issue reading input or if the console is not available.
     */
    public static char ReadKey() {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.length() == 1) {
                    return input.charAt(0);
                }
            }
        }
        throw new UnsupportedOperationException("Console not available");
    }
    /**
     * Retrieves the current cursor position on the screen.
     * 
     * @return An ArrayList containing two Integer values representing the X and Y coordinates of the cursor,
     *         respectively. The first element (index 0) is the X-coordinate, and the second element (index 1) is
     *         the Y-coordinate.
     */
    public static ArrayList<Integer> GetCursorPosition(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pointX = MouseInfo.getPointerInfo().getLocation().x;
        int pointY = MouseInfo.getPointerInfo().getLocation().y;

        list.add(pointX);
        list.add(pointY);


        return list;
    }
}