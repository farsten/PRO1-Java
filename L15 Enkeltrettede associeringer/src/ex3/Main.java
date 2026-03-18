package ex3;

public class Main {
    void main() {

Car c1 = new Car("EA9713", "2015");
Rental r1 = new Rental(1312, "13-03-2026", 10);

r1.setCar(c1);
c1.setPricePerDay(500);

IO.println("Pris for " + r1.getDays() + " dage: " + r1.getPrice() + " kr");



    }
}
