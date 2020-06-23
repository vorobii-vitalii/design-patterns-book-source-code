package book.decorator_pattern;

public class ConcreteDecoratorA extends Decorator {
    private final Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public double cost() {
        return component.cost() + 12.0;
    }
}
