package day11;

public class FullTimeEmp extends Emp{

    private double fixedSalary;

    public FullTimeEmp(int id,String name,  double fixedSalary) {
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
