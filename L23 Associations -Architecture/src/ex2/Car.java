package src.ex2;


import java.util.ArrayList;

public class Car {
    private String no; // registration number
    private String year; // year of first registration
    private int pricePrDay;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String no, String year) {
        this.no = no;
        this.year = year;
        pricePrDay = 0;
    }

    public void addRental(Rental rental) {
        if (!rentals.contains(rental)) {
            rentals.add(rental);
            rental.addCar(this);
        }
    }
    public ArrayList<Rental> getRentals() {
        return new ArrayList<>(rentals);
    }

    public int maxRentalDays() {
        int max = 0;
        for (Rental r : rentals) {
            if (r.getDays() > max) {
                max = r.getDays();
            }
        }
        return max;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int getPricePrDay() {
        return pricePrDay;
    }

    public void setPricePrDay(int pricePrDay) {
        this.pricePrDay = pricePrDay;
    }

    @Override
    public String toString() {
        return String.format("Car(%s,%s,%d)", no, year, pricePrDay);
    }
}
