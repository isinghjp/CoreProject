package day11;

public class PaymentGateway {

    public void processPayment(String cardNumber, double amount){
        System.out.println("Processing Credit Card Payment of ₹ "+ amount +" using card : "+cardNumber);
    }
    public void processPayment(String upiID){
        System.out.println("Processing UPI payment using ID: "+upiID);
    }
    public void processPayment(String cardNumber, double amount, double discount){
        double finalAmount = amount - (amount * discount/100);
        System.out.println("Processing Credit Card Payment of ₹ "+finalAmount+" after "+discount+" % discount");
    }
}
