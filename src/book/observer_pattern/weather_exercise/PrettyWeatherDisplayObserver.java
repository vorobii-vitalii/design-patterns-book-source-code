package book.observer_pattern.weather_exercise;

public class PrettyWeatherDisplayObserver implements Observer<WeatherInfo> {
    @Override
    public void notify(WeatherInfo data) {
        System.out.println("Gotten : " + data);
    }
}
