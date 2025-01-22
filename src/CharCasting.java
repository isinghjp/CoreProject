public class CharCasting {

    public static void main(String[] args) {
        char c='A';  //16bit unicode

        float ascii=c; // int 32 bit, here char to int is widening

        char newChar=(char)(ascii+1); //int to char (narrowing)

        System.out.println("Character  : "+c);
        System.out.println("ASCII value  : "+ascii);
        System.out.println("Next character : "+newChar);
    }
}
