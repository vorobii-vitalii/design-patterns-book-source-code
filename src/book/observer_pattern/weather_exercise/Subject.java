package book.observer_pattern.weather_exercise;

public interface Subject<T> {
    void onAdd(Observer observer);
    void onDelete(Observer observer);
    void onChange(T data);
}
