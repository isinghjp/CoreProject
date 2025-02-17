package day12;

public class PayPalPayment implements PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing PayPal Payment of ₹ "+amount);
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying PayPal Payment with Transcation ID : "+transactionId);
        return true;
    }
}
