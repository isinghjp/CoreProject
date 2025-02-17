package day05;

import java.util.Scanner;

public class StandareInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Reading from standard input
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        sc.nextLine();
       // Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        //String name=sc1.nextLine(); //method next used to read string


        System.out.println("Hello "+name+", You are "+age+" years old");
        sc.close();
    }
}
