package ex3;

public class Main {
    void main() {

        Car c1 = new Car("EA9713", "2015");
        Car c2 = new Car("BABABOOEY", "2016");
        Rental r1 = new Rental(1312, "13-03-2026", 10);

        r1.addCar(c1);
        r1.addCar(c2);
        c1.setPricePerDay(500);
        c2.setPricePerDay(200);

        IO.println("Pris for " + r1.getDays() + " dage: " + r1.getPrice() + " kr");
    }
}
