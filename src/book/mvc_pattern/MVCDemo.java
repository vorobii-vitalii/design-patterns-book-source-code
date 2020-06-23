package book.mvc_pattern;

public class MVCDemo {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(view);
        controller.subscribeObserver(model);
        view.setCurrentInputState(24);
        view.setCurrentInputState(12);
        view.setCurrentInputState(-2);
    }

}
