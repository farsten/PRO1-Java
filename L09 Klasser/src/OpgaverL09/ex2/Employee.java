package OpgaverL09.ex2;

public class Employee {
    // The name of the employee.
    private String name;
    // Whether the employee is a trainee or not.
    private boolean trainee;
    // The age of the employee.
    private int age;

    /** Create an employee. */
    public Employee(String name, boolean trainee, int age) {
        this.name = name;
        this.trainee = trainee;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Employee(%s, %s, %s)",
                this.name, this.trainee, this.age
        );
    }

    public String getName() {
        return this.name;
    }

    public boolean isTrainee() {
        return this.trainee;
    }
    public int getAge() {
        return this.age;

    }

    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }
    public void birthday(int age) {
        age++;
        IO.println("The employee is " + age + " years old next year");
    }
    public void printEmployee(String name, boolean isTrainee, int age) {

        IO.println("***************");
        IO.println("name: " + name);
        IO.println("Trainee: " + isTrainee);
        IO.println("Age: " + age);
        IO.println("***************");
    }
}
