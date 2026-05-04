package src.ex1;

public class test {
    void main() {
        Person p1 = new Person("Ella", "123456-1111", "42526004");
        Person p2 = new Person("Leon", "654321-2222", "93990577");

        Dog d1 = new Dog(1, "Cava");
        Dog d2 = new Dog(2, "Fido");

        p1.addDog(d1);
        p1.addDog(d2);

IO.println("----INFO----");
IO.println(p1);
for (Dog d : p1.getDogs()) {
    IO.println(" owned dog: " + d.getName());
}
        IO.println("\n--- Information from Dog side ---");
        IO.println(d1.getName() + "'s owner is: " + d1.getOwner().getName());
        IO.println(d2.getName() + "'s owner is: " + d2.getOwner().getName());

        IO.println("\n--- Transferring " + d1.getName() + " to " + p2.getName() + "---");

        p1.removeDog(d1);
        p2.addDog(d1);

        IO.println(p1.getName()  + " dogs now: " + p1.getDogs().size());
        IO.println(p2.getName() + " dogs now: " + p2.getDogs().size());
        IO.println(d1.getName() + " new owner: " + d1.getOwner().getName());
    }
}



