package day10;

public class Guest extends User{

    public Guest(String username, String email) {
        super(username, email);
    }

    public void browserProducts(){
        System.out.println(username+" is browsing products as a guest.");
    }
}
