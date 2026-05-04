package src.ex4.model;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class Employee {
    private String name;
    private int wage; // hourly wage

    // link Employee --> 0..1 Company
    private @Nullable Company company; // nullable

    /** Pre: name not empty, wage >= 0. */
    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    /** Pre: name not empty. */
    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    /** Pre: wage >= 0. */
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + " (kr " + wage + ")";
    }

    public @Nullable Company getCompany() {
        return company;
    }

    public void setCompany(@Nullable Company company) {
        this.company = company;
    }

    /**
     * Return the weekly salary of this employee.
     * Return 0, if this employee doesn't have a company.
     */
    public int weeklySalary() {
        int weeklySalary = 0;
        if (company != null) {
            weeklySalary = company.getHours() * wage;
        }
        return weeklySalary;
    }
}
