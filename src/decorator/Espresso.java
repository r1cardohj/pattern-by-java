package decorator;

public class Espresso extends Beverage{

    public Espresso() {
        this.desc = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
