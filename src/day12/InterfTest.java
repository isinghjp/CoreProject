package day12;

interface MyInterface{
    public abstract void show();
    public static final int a=10;
}

public class InterfTest implements MyInterface {

    public void show(){
        System.out.println("Any specific implementation in child class.");
    }
    public void display(){
        System.out.println("Hi i am displaying name.");
    }

    public static void main(String[] args) {
       // MyInterface it=new InterfTest();
        InterfTest it=new InterfTest();
        it.show();
        it.display();
    }
}
