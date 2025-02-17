package day08;

public class EmpConsChain {
    int id;
    String name;
    String place;

    public EmpConsChain(int id, String name){
        this.id=id;
        this.name=name;
    }
    public EmpConsChain(int id, String name, String place){
        this(id, name);
        this.place=place;
    }
    public void showInfo(){
        System.out.println("Id : " +id+"Name : "+ name+"Place : "+place);
    }

    public static void main(String[] args) {
        EmpConsChain e1=new EmpConsChain(101,"Jay");
        EmpConsChain e2=new EmpConsChain(102,"ABC","Banglore");
        e1.showInfo();
        e2.showInfo();
    }
}
