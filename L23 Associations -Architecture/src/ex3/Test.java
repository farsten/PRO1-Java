package src.ex3;

import java.util.ArrayList;

public class Test {
    void main() {

        Person p1 = new Person("Ella", 30);
        Person p2 = new Person("Merlin", 25);
        Person p3 = new Person("Sarah", 10);

        // 2. Create Gifts
        Gift g1 = new Gift("Lego");
        g1.setPrice(300);

        Gift g2 = new Gift("Computer");
        g2.setPrice(10000.00);

        Gift g3 = new Gift("Sokker");
        g3.setPrice(50.00);

        g1.setGiver(p1);
        p3.addReceivedGift(g1);


        g2.setGiver(p2);
        p3.addReceivedGift(g2);


        g3.setGiver(p1);
        p3.addReceivedGift(g3);


        IO.println(p3.getName() + " received gifts worth: " + p3.totalValueReceived());

        IO.println("People who gave gifts to " + p3.getName() + ":");
        ArrayList<Person> givers = p3.getGivers();
        for (Person p : givers) {
            IO.println("- " + p.getName());
        }

        Person[] people = {p1, p2, p3};
        IO.println("--- Gift Inventory ---");
        for (Person p : people) {
            printReceivedGifts(p);
        }
    }

    public void printReceivedGifts(Person p) {
        if (p.totalValueReceived() > 0) {
            IO.println(p.getName() + " received these gifts:");
            for (Gift g : p.getReceivedGifts()) {
                IO.println("  - " + g.getDescription());
            }
        } else {
            IO.println(p.getName() + " received no gifts.");
        }
    }
}