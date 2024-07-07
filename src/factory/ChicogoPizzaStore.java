package factory;

public class ChicogoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicogoStyleCheesePizza();
            case "pepperoni":
                return new ChicogoStylePepperoniPizza();
            case "clam":
                return new ChicogoStyleClamPizza();
            case "veggie":
                return new ChicogoStyleVeggiePizza();
            default:
                return null;
        }
    }
}
