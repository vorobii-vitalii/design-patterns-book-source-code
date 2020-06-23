package book.factory_pattern;

public class CFPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new CFDough();
    }

    @Override
    public Sauce createSauce() {
        return new CFSauce();
    }

}
