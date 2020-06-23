package book.mvc_pattern;

public interface Observable {
    void subscribeObserver(Observer observer);
    void notifyObservers();
}
