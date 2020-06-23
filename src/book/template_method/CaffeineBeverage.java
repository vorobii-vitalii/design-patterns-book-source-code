package book.template_method;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");   
    }

    public abstract void brew();

    public abstract void addCondiments();
    
}
