package day06;

import java.util.Scanner;

public class DoWhileEXample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userName, password;
        final String correctUsername="admin";
        final String correctPassword="admin@123";

        do{
            System.out.println("Enter userName : ");
            userName=sc.nextLine();

            System.out.println("Enter the Password : ");
            password=sc.nextLine();

            if(!userName.equals(correctUsername)|| !password.equals(correctPassword)){
                System.out.println("Invalid Credentials. Try again...");
            }
        }while (!userName.equals(correctUsername)|| !password.equals(correctPassword));
        System.out.println("Login Successful ! Welcome, "+userName);
    }
}
