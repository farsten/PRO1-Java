package ex3;

public class Rental {
    private int no;
    private String date;
    private int days;
    private Car car;



    public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }
    public int getPrice() {
        return car.getPricePerDay() * this.days;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
