package book.compound_pattern;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
