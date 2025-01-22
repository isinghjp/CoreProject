public class Employee {
    //Constant
    public static final String COMPANY_NAME="ACTE";

    //Fields
    private  Sting name;
    private int id;

    public Employee(Sting name, int id) {
        this.name = name;
        this.id = id;
    }

    public Sting getName() {
        return name;
    }

    public void setName(Sting name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
