package day05;

public class CommandLineArgsEx {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CommandLineArgsExample <name> <age>");
            return;
        }
        String name = args[0]; // First argument
        int age = Integer.parseInt(args[1]); // Second argument
        System.out.println("Hi " + name + ", you are " + age + " years old.");
    }
}
