package book.factory_pattern;

public class CFVeggiePizza extends Pizza {
    private PizzaIngredientFactory cfPizzaIngredientFactory;

    public CFVeggiePizza(PizzaIngredientFactory cfPizzaIngredientFactory) {
        this.cfPizzaIngredientFactory = cfPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = cfPizzaIngredientFactory.createDough();
        sauce = cfPizzaIngredientFactory.createSauce();
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
