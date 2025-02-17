package day11;

public class Audi extends Car{
    Audi get(){
        System.out.println("This is the Audi Class.");
        return this;
    }

    public static void main(String[] args) {
        Car obj=new Audi();
        obj.get();
    }
}
