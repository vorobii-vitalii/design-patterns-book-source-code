package book.factory_pattern;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
