package OpgaverL09.ex1;

public class CarApp {
    void main() {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        IO.println("Test: " + myCar);
        IO.println();

        String brand = myCar.getBrand();
        IO.println("Brand: " + brand);
        IO.println("My car: " + myCar.getBrand() + ", " +
                myCar.getColor() + ", " + myCar.getRegNo());
        myCar.setKm(65000);
        IO.println("Km nu: " + myCar.getKm()); myCar.nummerplade(myCar.getBrand(), myCar.getColor(), myCar.getRegNo(), myCar.getKm());



    } {

        Car NewCar = new Car("Toyota", "Black", "BL 13 812", 0);
        IO.println("Test: " + NewCar);
        IO.println();

        String brand = NewCar.getBrand();
        IO.println("Brand: " + brand);
        IO.println("New car: " + NewCar.getBrand() + ", " +
                NewCar.getColor() + ", " + NewCar.getRegNo()
        );

        NewCar.setKm(1000);
        IO.println("Km nu: " + NewCar.getKm()); NewCar.nummerplade(NewCar.getBrand(), NewCar.getColor(), NewCar.getRegNo(), NewCar.getKm());
    ;
}}
