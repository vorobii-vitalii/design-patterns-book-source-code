package book.factory_pattern;

public class CFCheesePizza extends Pizza {
    private PizzaIngredientFactory cfPizzaIngredientFactory;

    public CFCheesePizza(PizzaIngredientFactory cfPizzaIngredientFactory) {
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
