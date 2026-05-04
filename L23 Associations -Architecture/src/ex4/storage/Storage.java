package src.ex4.storage;


import org.jspecify.annotations.NullMarked;
import src.ex4.model.Company;
import src.ex4.model.Employee;

import java.util.ArrayList;

@NullMarked
public abstract class Storage {
    private static final ArrayList<Company> companies = new ArrayList<>();
    private static final ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList<Company> getCompanies() {
        return companies;
    }

    public static void storeCompany(Company company) {
        companies.add(company);
    }

    public static void deleteCompany(Company company) {
        companies.remove(company);
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void storeEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }
}
