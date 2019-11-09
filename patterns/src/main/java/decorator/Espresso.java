package decorator;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public Espresso() {
        this.description = "Espresso";
    }
}
