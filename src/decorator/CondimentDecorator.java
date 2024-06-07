package decorator;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;
    public abstract String getDesc();
    public Size getSize() {
        return this.beverage.getSize();
    }
}
