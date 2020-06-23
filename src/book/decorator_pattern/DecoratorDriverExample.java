package book.decorator_pattern;

public class DecoratorDriverExample {

    public static void main(String[] args) {
        Component component = new ConcreteComponent(12.0);
        component = new ConcreteDecoratorA(component);
        System.out.println(component.cost());
    }

}
