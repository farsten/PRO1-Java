package ex3;

public class Car {
    private String no; //registrerings nummer
    private String year; //registrerings år
    private int pricePerDay;


public Car(String no, String year) {
    this.no = no;
    this.year = year;
}

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
