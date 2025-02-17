package day09;

public class User {
    protected String name;
    protected String email;

    public void login(){
        System.out.println("User logged in : "+name);
    }

    public  void displayRole(){
        System.out.println("I am a general user.");
    }
}
