package day05;

public class ConsoleExample {
    public static void main(String[] args) {
        java.io.Console console = System.console(); // Get the console instance
        if (console != null) {
            String name = console.readLine("Enter your name: "); // Prompt and read input
            char[] password = console.readPassword("Enter your password: "); // Read password without echoing
            System.out.println("Hi " + name + "! Your password length is " + password.length);
        } else {
            System.out.println("No console available.");
        }
    }
}
