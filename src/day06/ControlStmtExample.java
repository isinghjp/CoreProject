package day06;

import java.util.Scanner; //full qualified name

public class ControlStmtExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the student's name : ");
        String studentName=sc.nextLine();

        System.out.println("Enter the marks obtained(0-100) :");
        int marks=sc.nextInt();

        System.out.println("Enter Attendance percentage(0-100) : ");
        int attendance=sc.nextInt();

        //1. if use
        if(marks > 40){
            System.out.println(studentName + "passed with marks :  "+marks);
        }
         //2. if else use
        if(marks > 40){
            System.out.println(studentName + "passed with marks :  "+marks);
        }else{
            System.out.println(studentName+"failed the exam.");
        }
        //3. Nested if else use
        if(marks >= 40){
            if(marks>=85){
                System.out.println("Congratulations "+studentName+" you passed with distinction.");
            }else{
                System.out.println(studentName + "passed with marks :  "+marks);
            }
        }else{
            System.out.println(studentName+"failed the exam.");
        }

        //4. switch case :-
        switch (attendance/10){
            case 10: {
                System.out.println("Excellent 100% attendance.");
                break;
            }
            case 9: {
                System.out.println("Excellent attendance. Keep it up");
                break;
            }
            case 8: {
                System.out.println("Good attendance.");
                break;
            }
            case 7: {
                //use this if you have to use some manipulation inside it.
                System.out.println("satisfactory attendance.");
                break;
            }
            default:
                System.out.println("Poor Attendance.");
                break;
        }

    }
}
