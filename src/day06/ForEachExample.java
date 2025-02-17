package day06;

import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        products.add("laptop");
        products.add("Smartphone");
        products.add("Tablets");
        products.add("Printers");
        products.add("Router");

        System.out.println("Product List : ");
        for(String product :products){
            System.out.println(product);
        }
    }
}
