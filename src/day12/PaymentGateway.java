package day12;

public interface PaymentGateway {
    void initiatePayment(double amount);
    boolean verifyPayment(String transactionId);
}
