package day11;

public class EmployeeSalaryMain {
    public static void main(String[] args) {

        Employee fullTime=new FullTimeEmployee("Pratiksha",500000, 10000);
        Employee partTime=new PartTimeEmployee("Jay",100, 1000);

        System.out.println(fullTime.name+"'s Salary : ₹"+fullTime.calculateSalary());
        System.out.println(partTime.name+"'s Salary : ₹"+partTime.calculateSalary());
    }
}
