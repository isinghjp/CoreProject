package day08;

public class Employee {
    String name;
    int id;

    //parameterized constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Copy Constructor
    Employee(Employee emp){
        this.name=emp.name;
        this.id= emp.id;
    }

    void displayEmployee() {
        System.out.println("Employee Name : " + name + ", Employee Id :" + id);
    }
}
