import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the input provided by the user
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        
        // Close the scanner to release resources
        scanner.close();
    }
}
