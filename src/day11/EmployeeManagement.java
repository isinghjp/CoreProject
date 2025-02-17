package day11;

public class EmployeeManagement {
    public static void main(String[] args) {
        Emp e1=new FullTimeEmp(101,"Swapnil",150000);
        Emp e2=new ContractEmployee(102,"jay",100,1000);
        Emp e3=new Freelancer(103,"Satyam",3,10000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
