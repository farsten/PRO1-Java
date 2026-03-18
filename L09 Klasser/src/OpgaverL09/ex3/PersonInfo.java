package OpgaverL09.ex3;

public class PersonInfo {
    private String name;
    private String address;
    private double monthlySalary;

    public PersonInfo(String name, String address, double monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("PersonInfo(%s, %s, %s)",
                this.name, this.address, this.monthlySalary
        );
    }

    public String getName() {
        return this.name;
    }

    public String address() {
        return this.address;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;

    }
    public double yearlySalary() {
        return this.monthlySalary * 12 + (this.monthlySalary * 0.025);
    }

}
