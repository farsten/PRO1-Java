public class House {
    private double price;
    private int squaremeters;
    private boolean hasLawn;
    private boolean isInCity;
    private double electrictyCost;
    private double waterCost;
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public House(String adresse, double price, int squaremeters, boolean hasLawn, boolean isInCity) {
        this.price = price;
        this.squaremeters = squaremeters;
        this.hasLawn = hasLawn;
        this.isInCity = isInCity;
        this.electrictyCost = 400;
        this.waterCost = 460;
        this.adresse = adresse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSquaremeters() {
        return squaremeters;
    }

    public void setSquaremeters(int squaremeters) {
        this.squaremeters = squaremeters;
    }

    public boolean isHasLawn() {
        return hasLawn;
    }

    public void setHasLawn(boolean hasLawn) {
        this.hasLawn = hasLawn;
    }

    public boolean isInCity() {
        return isInCity;
    }

    public void setInCity(boolean inCity) {
        isInCity = inCity;
    }

    public double getElectrictyCost() {
        return electrictyCost;
    }

    public void setElectrictyCost(double electrictyCost) {
        this.electrictyCost = electrictyCost;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }

    public double downPaymentPrMonth(double percentage, int months) {

        percentage /= 100;

        double downpayment = this.price * percentage;

        return downpayment / months;
    }

    public void udskriv() {
        IO.println("=================");
        IO.println("Adresse: " + this.adresse);
        IO.println("Pris: " + this.price);
        IO.println("Antal kvadratmeter: " + this.squaremeters);
        IO.println("Har den en have? " + this.hasLawn);
        IO.println("Er den i byen? " + this.isInCity);
        IO.println("Vandregning: " + this.waterCost);
        IO.println("Elregning: " + this.waterCost);
        IO.println("=================");
    }

    public double downPayment(double percentage) {
        percentage /= 100;
        return this.price * percentage;
    }
}

