package book.decorator_pattern.decorator_bevarage;

public class Mocha extends CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.toString() + " Mocha";
    }

    @Override
    public double cost() {
        double beverageCost = beverage.cost();
        if (beverage.getCupType().equals(CupType.NONE))
            return beverageCost + 5.0;
        return beverageCost + 17.0;
    }
}
