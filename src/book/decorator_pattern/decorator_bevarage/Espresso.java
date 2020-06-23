package book.decorator_pattern.decorator_bevarage;

public class Espresso extends Beverage {

    public Espresso(CupType cupType) {
        super("Espresso", cupType);
    }

    @Override
    public double cost() {
        return 13.0;
    }
}
