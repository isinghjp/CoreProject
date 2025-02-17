package day08;

public class User {
    String name;
    int age;

    //Default Constructor
    public User(){
        this.name="Guest";
        this.age=18;
    }

    void displayUser(){
        System.out.println("User : "+ name +" , Age :"+age);
    }

    public static void main(String[] args) {

        User newUser=new User();
        newUser.displayUser();
    }
}
