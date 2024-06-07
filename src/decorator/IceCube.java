package decorator;

public class IceCube extends CondimentDecorator{
    public IceCube(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + .05;
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + ", IceCube";
    }
}
