package src.ex2;

import java.util.ArrayList;

public class Rental {
    private int no;
    private String date;
    private int days; // days of rental
    private final ArrayList<Car> cars = new ArrayList<>();

     public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
            car.addRental(this);
        }
    }
    public int getPrice() {
        int total = 0;
        for (Car c : cars) {
            total += c.getPricePrDay() * days;
        }
        return total;
    }


    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Rental(" + no + "," + date + "," + days + ")";
    }
}
