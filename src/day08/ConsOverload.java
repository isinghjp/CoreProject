package day08;

public class ConsOverload {
    private ConsOverload(){
        System.out.println("No-args private constructor.....");
    }
    public ConsOverload(int a){
        System.out.println("Value of a : "+a);
    }
    public ConsOverload(int a, int b){
        System.out.println("Value of a : "+a);
        System.out.println("Value of a : "+b);
    }
    public ConsOverload(int a, int b, int c){
        System.out.println("Value of a : "+a);
        System.out.println("Value of a : "+b);
        System.out.println("Value of c : "+c);
    }

    public static void main(String[] args) {
        ConsOverload ob1=new ConsOverload(100);
        ConsOverload ob2=new ConsOverload(100,200);
        ConsOverload ob3=new ConsOverload(100, 200,300);
        ConsOverload ob4=new ConsOverload();
    }
}
