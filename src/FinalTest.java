public class FinalTest {
    public  static int a=10;
    public static final int b=30;
    void display(){
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    void change(){
        a++;
        //b++;
    }
    public static void main(String[] args) {

        FinalTest ft=new FinalTest(); //reference variable
        ft.display();

    }
}
