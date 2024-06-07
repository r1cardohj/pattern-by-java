package decorator;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        this.desc = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
