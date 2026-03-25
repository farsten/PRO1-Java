package Opgave1;

public class Person {
    private String name;
    private String title;
    private boolean senior;

    public Person(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;


    }
        public String toString() {
            return (title.isEmpty() ? "" : title + " ") + name + (senior ? "(senior)" : "");
        }
    }

