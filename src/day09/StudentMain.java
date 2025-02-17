package day09;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Id : ");
        int id=sc.nextInt(); //
        System.out.println("Enter Student name : ");
        String name=sc.next(); //
        sc.close();

        Student sobj=new Student();
        sobj.setId(id);
        sobj.setName(name);

        System.out.println(sobj.getId());
        System.out.println(sobj.getName());
    }
}
