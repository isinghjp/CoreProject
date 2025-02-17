package day08;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity=1;  //Default quantity
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    void displayProduct(){
        System.out.println("Prodct : "+name +", Price : "+price +", Quantity : "+quantity);
    }
}
