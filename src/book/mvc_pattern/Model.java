package book.mvc_pattern;

import java.util.HashSet;
import java.util.Set;

public class Model implements Observable, Observer<Integer> {
    private Set<Observer> observerSet;
    private Integer someData;

    public Model() {
        observerSet = new HashSet<>();
        someData = 0;
    }

    public void setSomeData(Integer someData) {
        this.someData = someData;
        notifyObservers();
    }

    public Integer getSomeData() {
        return someData;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerSet) {
            o.update(this);
        }
    }

    @Override
    public void update(Integer data) {
        setSomeData(data);
    }
}
