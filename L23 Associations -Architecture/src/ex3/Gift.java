package src.ex3;

public class Gift {
    private String description;
    private double price;
    private Person giver;

    public Gift(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setGiver(Person giver) {
        this.giver = giver;
    }

    public Person getGiver() {
        return giver;
    }
}

