package OpgaverL13.ex1;

public class WeatherStation {
    private double temperature;
    private double pressure;
    private static final double BAR = 14.503773773;

    public WeatherStation() {
    this.temperature = 0;
    this.pressure = BAR;
}
public WeatherStation(double celsius, double bar) {
    this.temperature = celsius;
    this.pressure = bar;
}

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }
    public double getPressurePSI() {
        return pressure *= BAR;
    }
    public double getTemperatureFahrenheit() {
        return temperature = temperature * 1.8 + 32;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public void setTemperatureFahrenheit(double fahrenheit) {
        this.temperature = (fahrenheit - 32) / 1.8;
    }
    public void setPressurePSI(double pressure) {
        this.pressure = pressure / BAR;
    }
    public static WeatherStation imperialUnits(double fahrenheit, double psi) {
        double temperature = (fahrenheit - 32) / 1.8;
        double pressure =  psi / BAR;

        return new WeatherStation(temperature, pressure);
    }
}
