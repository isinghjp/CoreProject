package day11;

public class Freelancer extends Emp{
    private int projectCompleted;
    private double ratePerProject;

    public Freelancer(int id, String name, int projectCompleted, double ratePerProject) {
        super(id, name);
        this.projectCompleted = projectCompleted;
        this.ratePerProject = ratePerProject;
    }

    @Override
    public double calculateSalary() {
        return projectCompleted*ratePerProject;
    }
}
