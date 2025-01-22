public class NonPrimitiveCast {
    public static void main(String[] args) {

        Parent parent = new Child(); //Upcasting
        parent.display();

        //Downcasting
        if(parent instanceof Child){
            Child child=(Child) parent;
            child.display();
            child.childSpecificMethod();
        }
    }
}
