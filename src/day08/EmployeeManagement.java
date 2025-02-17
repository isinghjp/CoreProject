package day08;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1=new Employee("Jay", 101); //Original Employee
        Employee emp2=new Employee(emp1); //copying emp1 data into emp2

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
