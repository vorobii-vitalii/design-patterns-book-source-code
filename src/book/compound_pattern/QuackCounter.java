package book.compound_pattern;

public class QuackCounter implements Quackable {
    private final Quackable quackable;
    private static Long countQuacks = 0L;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        countQuacks += 1L;
    }

    public static Long getCountQuacks() {
        return countQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
