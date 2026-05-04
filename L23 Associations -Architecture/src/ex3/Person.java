package src.ex3;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    private final ArrayList<Gift> receivedGifts = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addReceivedGift(Gift gift) {
        receivedGifts.add(gift);
    }

    public double totalValueReceived() {
        double total = 0;
        for (Gift g : receivedGifts) {
            total += g.getPrice();
        }
        return total;
    }

    public ArrayList<Person> getGivers() {
        ArrayList<Person> givers = new ArrayList<>();

        for (Gift g : receivedGifts) {
            Person giver = g.getGiver();

            if (!givers.contains(giver)) {
                givers.add(giver);
            }
        }

        return givers;
    }
    public ArrayList<Gift> getReceivedGifts() {
        return new ArrayList<>(receivedGifts);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}