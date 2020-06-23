package book.observer_pattern.weather_exercise;

import java.util.HashSet;
import java.util.Set;

public class WeatherSubject implements Subject<WeatherInfo> {
    private Set<Observer> observers;

    public WeatherSubject() {
        observers = new HashSet<>();
    }

    @Override
    public void onAdd(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void onDelete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void onChange(WeatherInfo data) {
        for (Observer o : observers) {
            o.notify(data);
        }
    }
}
