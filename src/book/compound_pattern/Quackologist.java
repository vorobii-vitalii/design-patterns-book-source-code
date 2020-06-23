package book.compound_pattern;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Duck " + quackObservable + " just quacked...");
    }
}
