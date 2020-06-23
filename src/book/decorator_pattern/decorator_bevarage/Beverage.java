package book.decorator_pattern.decorator_bevarage;

public abstract class Beverage {
    private String description = "";
    private CupType cupType = CupType.NONE;

    public Beverage() { }

    public Beverage(String description, CupType cupType) {
        this.description = description;
        this.cupType = cupType;
    }

    public String getDescription() {
        return description;
    }

    public CupType getCupType() {
        return cupType;
    }

    public void setCupType(CupType cupType) {
        this.cupType = cupType;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription();
    }
}
