package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Set up the reader
        System.out.print("Enter your name: ");
        String name= reader.readLine(); // Read a line of text
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine()); // Parse an integer
        System.out.println("Hi " + name + ", you are " + age + " years old.");
    }
}
