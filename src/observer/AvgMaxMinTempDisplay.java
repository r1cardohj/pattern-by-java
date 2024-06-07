package observer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AvgMaxMinTempDisplay implements Observer, DisplayAble{
    WeatherData weatherData;
    List<Float> temperatures;
    float maxTemperature;
    float minTemperature;
    float avgTemperature;


    public AvgMaxMinTempDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        temperatures.add(this.weatherData.getTemperature());
        this.maxTemperature = Collections.max(temperatures);
        this.minTemperature = Collections.min(temperatures);
        float sum = 0;
        for (float temp : temperatures) {
            sum += temp;
        }
        this.avgTemperature = sum / temperatures.size();
        this.display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f%n",
                this.avgTemperature, this.maxTemperature, this.minTemperature);
    }
}
