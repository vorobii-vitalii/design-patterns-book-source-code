package book.decorator_pattern.decorator_bevarage;

public class BeverageDriver {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(CupType.LARGE);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }

}
