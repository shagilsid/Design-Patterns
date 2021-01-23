import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObserverable {
    private List<IObserver> observerList;
    private int temperature;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(observer -> observer.update());
    }
    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature){
        this.temperature=temperature;
        notifyObservers();;
    }
}
