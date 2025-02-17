package day11;

abstract class Emp {
    protected String name;
    protected int id;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //abstract method
    public abstract double calculateSalary();
    //normal method
    public void displayDetails(){
        System.out.println("Employee ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+calculateSalary());
        System.out.println("------------------------------");
    }
}
