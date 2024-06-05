package observer;

public class BetterDisplay implements Observer, DisplayAble{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public BetterDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Better! temp: %f humidity: %f pressure: %f%n",
                this.temp, this.humidity, this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
