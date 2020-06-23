package book.factory_pattern;

import book.exampl1.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    private static final PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYCheesePizza(nyPizzaIngredientFactory);
        else if (type.equals("veggie"))
            return new NYVeggiePizza(nyPizzaIngredientFactory);
        return null;
    }
}
