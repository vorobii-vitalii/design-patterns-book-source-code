package book.compound_pattern;

public class CompoundPatternDemo {

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Observer observer = new Quackologist();
        Flock flock = new Flock();
        flock.addQuackable(new MallardDuck());
        flock.addQuackable(new MallardDuck());
        flock.addQuackable(new RedheadDuck());
        flock.registerObserver(observer);
        flock.quack();
    }

}
