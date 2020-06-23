package book.observer_pattern.weather_exercise;

public class SimpleWeatherDisplayObserver implements Observer<WeatherInfo> {
    @Override
    public void notify(WeatherInfo data) {
        System.out.println("Something changed, but i don't really care...");
    }
}
