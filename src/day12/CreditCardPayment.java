package day12;

public class CreditCardPayment implements PaymentGateway{

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Credit Card Payment of ₹ "+amount);
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying Credit Card Payment with Transaction ID : "+transactionId);
        return true;
    }
}
