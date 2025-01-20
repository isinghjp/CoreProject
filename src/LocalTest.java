public class LocalTest {
    int a;
    int b=50;
    public void disp(){
       int m=10; //local variable
       int  n=20;
       int sum=m+n;

        System.out.println("Value of m : "+m);
        System.out.println("Value of n : "+n);
        System.out.println("Sum of two digits : "+sum);
        System.out.println("Value  of a : "+a);
        System.out.println("Value of  b : "+b);
    }
    public static void main(String[] args) {
        LocalTest lt=new LocalTest();
        lt.disp();

//        System.out.println("Value  of a : "+a);
//        System.out.println("Value of  b : "+b);
//        System.out.println("Value of m : "+m);
//        System.out.println("Value of n : "+n);

    }

}
