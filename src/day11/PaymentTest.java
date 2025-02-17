package day11;


public class PaymentTest {
    public static void main(String[] args) {
         PaymentGateway payment=new PaymentGateway();

         payment.processPayment("1234-5678-7890-0987", 500);
         payment.processPayment("dummyuser@upi");
         payment.processPayment("1234-5678-7990-0987",1000,10);
    }
}
