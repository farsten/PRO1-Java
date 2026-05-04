package src.ex4.gui;


import javafx.application.Application;
import org.jspecify.annotations.NullMarked;
import src.ex4.controller.Controller;
import src.ex4.model.Company;
import src.ex4.model.Employee;

@NullMarked
public class ArchitectureApp {
    void main() {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Employee bob = Controller.createEmployee("Bob Dole", 210);
        Employee alice = Controller.createEmployee("Alice Schmidt", 250);
        Employee george = Controller.createEmployee("George Down", 150);
        Employee rita = Controller.createEmployee("Rita Uphill", 300);
        Controller.createEmployee("John Doe", 100);

        Controller.addEmployeeToCompany(ibm, bob);
        Controller.addEmployeeToCompany(amd, alice);
        Controller.addEmployeeToCompany(sled, george);
        Controller.addEmployeeToCompany(ibm, rita);
    }
}
