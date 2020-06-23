package book.observer_pattern.weather_refined;

public class ForecastScreen implements DisplayElement, Observer {

    private Subject subject;

    @Override
    public void display() {
        System.out.println("FORECAST SCREEN");
        System.out.println(subject);
        System.out.println("----------------");
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
    }

}
