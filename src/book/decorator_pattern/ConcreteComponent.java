package book.decorator_pattern;

public class ConcreteComponent extends Component {
    private double value;

    public ConcreteComponent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double cost() {
        return value;
    }
}
