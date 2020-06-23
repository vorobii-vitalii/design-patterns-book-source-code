package book.observer_pattern.weather_refined;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    private long temperature;
    private long pressure;
    private long humidity;
    private final Set<Observer> observerSet;

    public WeatherData() {
        observerSet = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update(this);
        }
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", observerSet=" + observerSet +
                '}';
    }
}
