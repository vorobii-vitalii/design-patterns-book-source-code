package book.compound_pattern;

import java.util.ArrayList;
import java.util.List;

/*
    Composite pattern
 */
public class Flock implements Quackable {
    private List<Quackable> quackables;

    public Flock() {
        quackables = new ArrayList<>();
    }

    public void addQuackable(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable q: quackables) {
            q.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable q : quackables) {
            q.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
