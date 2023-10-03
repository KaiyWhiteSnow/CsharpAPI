package Console;
import java.util.Scanner;

public class Console {
    /**
     * Console functions are standard C# functions
     * 
     * WriteLine();
     * ReadLine();
     */
    public static void WriteLine(Object arg){
        /**
         * WriteLine(Obj arg)
         * 
         * WriteLine takes argument in the form of object which java can interpret on it's own.
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
        java.io.Console console = System.console();
        if (console == null) {
            throw new UnsupportedOperationException("Console not available");
        }
        
        char key = console.readLine().charAt(0);
        return key;
    }
}