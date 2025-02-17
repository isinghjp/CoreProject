/**  block comment*/
public class AutoUnbox {
    public static  final double TAX_RATE=0.18;
    public static void main(String[] args) {
        int a;
        //autoboxing primitives - wrapper
        Integer i=1000; //hardcodec value
        //value of pi

        System.out.println(i);
        System.out.println(i.toString());

        //autounboxing wrapper object - primitives
        int aa=new Integer(100);
        System.out.println(aa);
    }
}
