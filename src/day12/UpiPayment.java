package day12;

public class UpiPayment implements PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing UPI Payment of ₹ "+amount);
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying UPI Payment with Transaction ID " +transactionId);
        return true;
    }
}
