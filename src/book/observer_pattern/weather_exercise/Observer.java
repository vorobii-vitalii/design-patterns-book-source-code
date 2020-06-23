package book.observer_pattern.weather_exercise;

public interface Observer<T> {
    void notify(T data);
}
