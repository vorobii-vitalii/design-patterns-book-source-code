package book.mvc_pattern;

import java.util.HashSet;
import java.util.Set;

public class Controller implements Observer<Integer>, Observable {
    private Set<Observer<Integer>> observers;

    public Controller(Observable observable) {
        observers = new HashSet<>();
        observable.subscribeObserver(this);
    }

    @Override
    public void update(Integer data) {
        for (Observer o : observers) {
            o.update(data);
        }
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {

    }

}
