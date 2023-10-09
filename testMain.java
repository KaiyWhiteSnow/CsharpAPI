import Console.Console;
import Queue.Queue;

class testMain{
    public static void main(String[] args) {
        Console.WriteLine("Press A for enqueueTest, press B for consoleTest");
        char keyPressed = Console.ReadKey();
        if (keyPressed == 'a'){
            enqueueTest();
        }
        else if (keyPressed == 'b'){
            consoleTest();
        }
        else{
            Console.WriteLine("Auf der Heide blüht ein kleines Blümelein Und das heißt Erika");
        }
    }
    public static void enqueueTest(){
        Queue<String> myQueue = new Queue<>(); // Initialize Queue

        myQueue.Enqueue("Hello");
        myQueue.Enqueue("World");
        myQueue.Enqueue("!");

        Console.WriteLine(myQueue);
    }
    public static void consoleTest(){
        Console.WriteLine("dog"); // obj
        Console.ReadLine(null); // String
        Console.ReadLine(0); // int
        Console.ReadKey(); // char
        while (true){
            Console.WriteLine(Console.GetCursorPosition());
        }
    }
}
