// v1.0 - First mini project for GitHub by Shane
// Future improvements: rename methods, input validation, return values instead of print
import java.util.Scanner;

public class firstMiniProject {
    public static void main(String[] args) {

        // Ask for the user's name
        System.out.println("Hi there, welcome to your first github project!");
        System.out.println("May I ask, who am I speaking to?");

        // User input
        Scanner scanner = new Scanner(System.in);

        // Store user input (name)
        String name = scanner.nextLine();
        greetUser(name);

        // Ask for user's age
        System.out.println("How old are you " + name + "?");
        int age = scanner.nextInt();
        showAge(name, age);

        // Close the scanner
        scanner.close();

    }

    // Method to greet the user by name
    public static void greetUser (String name) {
        System.out.println("Hello " + name + ", I'm here to let others know how far you've come!");
    }
    // Method to display the user's age
    public static void showAge (String name, int age) {
        System.out.println(name + ", you are " + age + " years old.");
    }
}









