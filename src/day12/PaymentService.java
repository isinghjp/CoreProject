package day12;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount){
        paymentGateway.initiatePayment(amount);
        boolean status=paymentGateway.verifyPayment("TXN1234556789");
        if(status){
            System.out.println("Payment Successful!");
        }else {
            System.out.println("Payment Failed!.......");
        }


    }
}
