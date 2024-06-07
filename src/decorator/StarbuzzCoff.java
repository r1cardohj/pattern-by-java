package decorator;

public class StarbuzzCoff {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc()
            + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new IceCube(beverage2);
        System.out.println(beverage2.getDesc() + " $" + beverage2.cost());
    }
}
