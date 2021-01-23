public class PhoneDisplay implements IObserver {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Display updated to temperature:"+weatherStation.getTemperature());
    }
}
