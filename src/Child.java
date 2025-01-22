public class Child extends Parent{

    @Override
    void display() {
        super.display();
        System.out.println("Child Method");
    }
    void childSpecificMethod(){
        System.out.println("Child - Specific method");
    }
}
