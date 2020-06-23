package book.compound_pattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    private QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(quackObservable);
        }
    }
}
