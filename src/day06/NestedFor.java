package day06;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) { // Outer loop for rows
            for (int j = 1; j <= 10; j++) { // Inner loop for columns
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }
}
