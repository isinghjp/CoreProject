package day09;

public class Member extends User{
    public void borrowBook(){
        System.out.println("Member "+name+" borrowed a book.");
    }
    public void displayRole(){
        System.out.println("I am a Member. I borrow books.");
    }
}
