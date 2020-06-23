package book.observer_pattern.weather_exercise;

public class WeatherData {
    private long temperature;
    private long pressure;
    private long humidity;
    private WeatherSubject weatherSubject;

    public void onWeatherChange() {
        weatherSubject.onChange( new WeatherInfo(temperature, pressure, humidity) );
    }

    public void setWeatherSubject(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
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

}
