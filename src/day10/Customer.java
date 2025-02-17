package day10;

public class Customer extends  User {
    int loyaltyPoints;

    public Customer(String username, String email, int loyaltyPoints) {
        super(username, email);
        this.loyaltyPoints = loyaltyPoints;
    }

    public void placeOrder(){
        System.out.println(username+" placed an order.");
    }
}
