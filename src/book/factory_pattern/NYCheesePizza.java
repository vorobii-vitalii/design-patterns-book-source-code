package book.factory_pattern;

public class NYCheesePizza extends Pizza {
    private PizzaIngredientFactory nyPizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory nyPizzaIngredientFactory) {
        this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = nyPizzaIngredientFactory.createDough();
        sauce = nyPizzaIngredientFactory.createSauce();
    }

    @Override
    public void bake() {
    }

    @Override
    public void cut() {
    }

    @Override
    public void box() {
    }

}
