package Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.MouseInfo;

public class Console {
    /**
     * Console functions are standard C# functions
     * 
     * WriteLine();
     * ReadLine();
     * ReadKey();
     * GetCursonPosition();
     */
    public static void WriteLine(Object arg){
        /**
         * WriteLine(Obj arg)
         * 
         * WriteLine takes argument in the form of object which java can interpret on it's own
         */
        System.out.println(arg);
    }
    public static int ReadLine(int dataType){
        /**
         * ReadLine(int)
         * 
         * In order to use this function you must pass an argument, it is the only way to make method overloading work unless I want to return object
         */
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                return (int) input;
            }
        }
        return 0;
    }

    public static String ReadLine(String dataType){
        /**
         * ReadLine(String)
         * 
         * In order to use this function you must pass an argument, it is the only way to make method overloading work unless I want to return object
         */
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextLine()){
                String input = scanner.nextLine();
                return (String) input;
            }
        }
        return null;
    }
    public static char ReadKey() {
        /**
         * ReadKey()
         * 
         * ReadKey will return a char "key" which is whatever key is pressed. Exception thrown if console is not used, commonly an issue in IDEs
         */
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
    public static ArrayList<Integer> GetCursorPosition(){
        /**
         * GetCursorPosition()
         * 
         * Returns ArrayList with x and y coordinates of your mouse position
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pointX = MouseInfo.getPointerInfo().getLocation().x;
        int pointY = MouseInfo.getPointerInfo().getLocation().y;

        list.add(pointX);
        list.add(pointY);


        return list;
    }
}