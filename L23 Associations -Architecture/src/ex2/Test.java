package src.ex2;

public class Test {
    void main() {

        Car c1 = new Car("AB123", "2022");
        c1.setPricePrDay(500);
        Car c2 = new Car("CD456", "2023");
        c2.setPricePrDay(700);

        Rental r1 = new Rental(1, "2026-04-13", 3);
        Rental r2 = new Rental(2, "2026-05-01", 10);


        c1.addRental(r1);
        c1.addRental(r2);
        c2.addRental(r1);


        IO.println("Price for Rental 1 (2 cars, 3 days): " + r1.getPrice());

        IO.println("Max rental days for Car 1: " + c1.maxRentalDays());

        IO.println("Max rental days for Car 2: " + c2.maxRentalDays());

    }
}
