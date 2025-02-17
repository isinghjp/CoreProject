package day08;

public class ECommerce {
    public static void main(String[] args) {
        Product p1=new Product("Laptop",100000);
        Product p2=new Product("SmartPhone",50000, 12);

        p1.displayProduct();
        p2.displayProduct();
    }
}
