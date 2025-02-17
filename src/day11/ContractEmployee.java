package day11;

public class ContractEmployee extends Emp{
    private int hoursWroked;
    private double hourlyRate;

    public ContractEmployee(int id, String name, int hoursWroked, double hourlyRate) {
        super(id, name);
        this.hoursWroked = hoursWroked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWroked*hourlyRate;
    }
}
