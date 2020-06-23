package book.factory_pattern;

public class CFPizzaStore extends PizzaStore {
    private static final PizzaIngredientFactory cfPizzaIngredientFactory = new CFPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CFCheesePizza(cfPizzaIngredientFactory);
        else if (type.equals("veggie"))
            return new CFVeggiePizza(cfPizzaIngredientFactory);
        return null;
    }
}
