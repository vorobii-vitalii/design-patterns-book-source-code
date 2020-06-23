package book.decorator_pattern.decorator_bevarage;

public class Milk extends CondimentDecorator {
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.toString() + " Milk";
    }

    @Override
    public double cost() {
        double beverageCost = beverage.cost();
        if (beverage.getCupType().equals(CupType.NONE))
            return beverageCost + 5.0;
        return beverageCost + 17.0;
    }
}
