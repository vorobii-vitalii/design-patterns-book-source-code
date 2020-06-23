package book.factory_pattern;

public abstract class Pizza {
    protected Sauce sauce;
    protected Dough dough;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
