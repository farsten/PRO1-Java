package src.ex4.controller;


import org.jspecify.annotations.NullMarked;
import src.ex4.model.Company;
import src.ex4.model.Employee;
import src.ex4.storage.Storage;

import java.util.ArrayList;

@NullMarked
public abstract class Controller {
    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.storeCompany(company);
        return company;
    }

    /**
     * Delete the company.
     * Pre: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.deleteCompany(company);
    }

    /**
     * Update the company.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }

    /**
     * Create a new employee.
     * Pre: name not empty, wage >= 0.
     */
    public static Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        Storage.storeEmployee(employee);
        return employee;
    }

    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }

    /**
     * Add the employee to the company.
     * If the employee is connected to another company, this connection is removed.
     */
    public static void addEmployeeToCompany(Company company, Employee employee) {
        Company oldCompany = employee.getCompany();
        if (oldCompany != null) {
            oldCompany.removeEmployee(employee);
        }
        employee.setCompany(company);
        company.addEmployee(employee);
    }

    public static void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }

    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            employee.getCompany().removeEmployee(employee);
        }
        Storage.deleteEmployee(employee);
    }
}
