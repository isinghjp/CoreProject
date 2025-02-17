package day06;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double balance = 10000; //initial balance

        while(balance > 0){ //condition checked repeatedly
            System.out.println("Current Balance ₹  : "+balance);
            System.out.println("Enter withdrawal amount : ");
            double withdrawal = sc.nextDouble();

            if(withdrawal > balance){ //need to check once
                System.out.println("Insufficient funds!");
            }else {
                balance -=withdrawal;
                System.out.println("Withdrawal Successful");
            }
            if (balance <=0){
                System.out.println("Balance is zero.");
            }
        }
        sc.close();
    }
}
