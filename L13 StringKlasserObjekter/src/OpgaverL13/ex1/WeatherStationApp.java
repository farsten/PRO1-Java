package OpgaverL13.ex1;



public class WeatherStationApp {
void main() {
    WeatherStation w1 = new WeatherStation();
    WeatherStation w2 = new WeatherStation(35, 0.5);
    WeatherStation w3 = new WeatherStation(68, 21);

    w1.setPressurePSI(7.25);
    w1.setTemperatureFahrenheit(200);

    display(w1);
//    display(w2);
//    display(w3);
//    display(WeatherStation.imperialUnits(100, 32));


}
    public void display(WeatherStation weatherStation) {
    IO.println("Temperature (C): " + weatherStation.getTemperature());
    IO.println("Temperature (F): " + weatherStation.getTemperatureFahrenheit());
    IO.println("Pressure (BAR): " + weatherStation.getPressure());
    IO.println("Pressure (PSI): " + weatherStation.getPressurePSI());
    IO.println();




}
}
