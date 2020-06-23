package book.observer_pattern.weather_refined;

public class SimpleScreen implements DisplayElement, Observer {

    private Subject subject;

    @Override
    public void display() {
        System.out.println(subject);
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
    }

}
