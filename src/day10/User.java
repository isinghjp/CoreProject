package day10;

public class User {
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("User Name : "+username);
        System.out.println("Email : "+email);
    }
}
