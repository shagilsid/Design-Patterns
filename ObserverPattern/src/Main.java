public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        PhoneDisplay phoneDisplay=new PhoneDisplay(weatherStation);
        weatherStation.register(phoneDisplay);
        weatherStation.setTemperature(30);
        weatherStation.setTemperature(40);
    }
}
