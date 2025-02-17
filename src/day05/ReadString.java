package day05;

import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        String input="String is a final class which is immutable.";

        Scanner sc=new Scanner(input); //Reading from the String

        while(sc.hasNext()){
            System.out.println(sc.next()); //Tokenize and print each word
        }
        sc.close(); //close the scanner
    }
}
