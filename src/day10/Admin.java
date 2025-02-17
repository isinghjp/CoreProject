package day10;

public class Admin extends User{

    String adminRole;

    public Admin(String username, String email, String adminRole) {
        super(username, email); //parent class constructor
        this.adminRole = adminRole;
    }

    public void manageUsers(){
        System.out.println(username+"is managing users.");
    }
}
