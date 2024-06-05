package observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        this.observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        this.observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : this.observers) {
            obs.update(this.temperature, this.humidity, this.pressure);
        }
    }

    /*
    * data changed hook
    * */
    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

}
