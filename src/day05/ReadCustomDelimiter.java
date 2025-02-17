package day05;

import java.util.Scanner;

public class ReadCustomDelimiter {
    public static void main(String[] args) {
        String csvData = "Jay,35,New Delhi;Anuj,40,Pune;Pratiksha,22,Banglore";
        Scanner sc = new Scanner(csvData);
        sc.useDelimiter(";"); // Set semicolon as the delimiter

        while (sc.hasNext()) {
            System.out.println(sc.next()); // Print each record
        }
        sc.close(); // Always close the scanner
    }
}
