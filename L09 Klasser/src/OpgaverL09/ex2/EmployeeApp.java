package OpgaverL09.ex2;

public class EmployeeApp {
    void main() {
        Employee e1 = new Employee("Hans Jensen", true, 21);
        IO.println("Test: " + e1);
        IO.println();

        IO.println("Name: " + e1.getName());
        IO.println("Trainee? " + e1.isTrainee());
        IO.println();

        IO.println("Age? " + e1.getAge());
        e1.birthday(e1.getAge());
        IO.println();
        
        IO.println("Trainee? " + e1.isTrainee());
        IO.println();
        e1.printEmployee(e1.getName(), e1.isTrainee(), e1.getAge());

    }
}
