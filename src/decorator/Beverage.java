package decorator;

public abstract class Beverage {
    public enum Size {Tall, GRANDE, VENTI};
    Size size = Size.Tall;
    String desc = "Unknown Beverage";

    public String getDesc() {
        return this.desc;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
