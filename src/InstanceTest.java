public class InstanceTest {

    int a=10;
    int b=20;

    public void show(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
    public void change()
    {
        a++;
        b++;
    }
    public static void main(String []args){

        InstanceTest obj1=new InstanceTest();
        InstanceTest obj2=new InstanceTest();

        obj1.show();
        obj2.show();
        obj1.change();
        obj2.change();
        obj1.show();
        obj2.show();
        obj1.change();
        obj1.show();
        obj2.show();
    }
}
