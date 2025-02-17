package day08;

public class CosnTest {
    public CosnTest(){
        System.out.println("Default Constructor or no-args constructor.");
    }
    public CosnTest(int a, int b){
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    public static void main(String[] args) {

        CosnTest obj=new CosnTest(); //this is default
        CosnTest obj2=new CosnTest(10,20);//parameterized
    }
}
