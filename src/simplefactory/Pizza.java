package simplefactory;

public class Pizza {
    public void prepare() {}
    public void bake() {}
    public void cut() {}
    public void box() {}
}

class CheesePizza extends Pizza {}

class PepperoniPizza extends Pizza {}

class ClamPizza extends Pizza {}

class VeggiePizza extends Pizza {}