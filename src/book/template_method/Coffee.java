package book.template_method;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("Brewing coffee");
    }

    public void addCondiments() {
        System.out.println("Added some milk");
    }

}

