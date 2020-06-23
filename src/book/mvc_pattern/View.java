package book.mvc_pattern;

import java.util.HashSet;
import java.util.Set;

public class View implements Observer<Model>, Observable {
    private Set<Observer<Integer>> observers;
    private Integer currentInputState;

    public View(Observable observable) {
        observable.subscribeObserver(this);
        observers = new HashSet<>();
        currentInputState = 0;
    }

    public void setCurrentInputState(Integer currentInputState) {
        this.currentInputState = currentInputState;
        notifyObservers();
    }

    public void draw(Model model) {
        System.out.println("-----------------");
        System.out.println("DATA: " + model.getSomeData());
        System.out.println("-----------------");
    }

    @Override
    public void update(Model model) {
        draw(model);
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(currentInputState);
        }
    }
}
