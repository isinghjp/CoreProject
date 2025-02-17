package day10;

public class Child extends Parent{
        void m1(){
            System.out.println("Child m1 method");
        }
        void m2(){
            this.m1();
            super.m1();
        }
    public static void main(String[] args) {
        new Child().m2();
    }
}
