package day12;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentService service1=new PaymentService(new CreditCardPayment());
        service1.processPayment(11000);

        PaymentService service2=new PaymentService(new UpiPayment());
        service2.processPayment(2100);

        PaymentService service3=new PaymentService(new PayPalPayment());
        service3.processPayment(510000);
    }
}
