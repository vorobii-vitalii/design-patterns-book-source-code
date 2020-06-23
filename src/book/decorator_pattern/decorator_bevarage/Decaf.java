package book.decorator_pattern.decorator_bevarage;

public class Decaf extends Beverage {

    public Decaf(CupType cupType) {
        super("Decaf", cupType );
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
