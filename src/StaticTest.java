public class StaticTest {
    int a=20;  //instance
    static int b; //static or class //may initilize with default value.
                        //here it will be 0
    public void show(){
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    void change(){
        a++;
        b++;
    }
    public static void main(String[] args) {
        StaticTest st1=new StaticTest();
        StaticTest st2=new StaticTest();
        st1.show();
        st2.show();
        st1.change();
        st2.change();
        st1.show();
        st2.show();
        st1.change();
        st1.show();
        st2.show();
    }
}
