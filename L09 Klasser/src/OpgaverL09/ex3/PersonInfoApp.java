package OpgaverL09.ex3;

public class PersonInfoApp {
    void main() {
       PersonInfo p1 = new PersonInfo("Leroy Jenkins", "Paper St.", 100);
        IO.println("Test: " + p1);
        IO.println();

        IO.println("Name: " + p1.getName());
        IO.println();

        IO.println("Address: " + p1.address());
        IO.println();

        IO.println("Monthly salary: " + p1.getMonthlySalary());
        IO.println();
        IO.println(p1.yearlySalary());
    }
}
