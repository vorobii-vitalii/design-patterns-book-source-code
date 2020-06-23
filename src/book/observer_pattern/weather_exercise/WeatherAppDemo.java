package book.observer_pattern.weather_exercise;

public class WeatherAppDemo {
    public static void main(String[] args) {
        WeatherData weatherData =  new WeatherData();
        weatherData.setHumidity(24);
        weatherData.setPressure(24);
        weatherData.setTemperature(24);
        WeatherSubject weatherSubject = new WeatherSubject();
        weatherSubject.onAdd(new PrettyWeatherDisplayObserver());
        weatherSubject.onAdd(new SimpleWeatherDisplayObserver());
        weatherData.setWeatherSubject(weatherSubject);
        weatherData.onWeatherChange();
        weatherData.setHumidity(52);
        weatherData.setPressure(12);
        weatherData.setTemperature(34);
        weatherData.onWeatherChange();
    }
}
