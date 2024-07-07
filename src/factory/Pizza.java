package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    void cut() {
        System.out.println("cutting....");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}

class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grate Reggiano Cheese");
    }
}

class NYStyleVeggiePizza extends Pizza {
}

class NYStyleClamPizza extends Pizza {
}

class NYStylePepperoniPizza extends Pizza {
}

class ChicagoStyleCheesePizza extends Pizza {

}

class ChicogoStylePepperoniPizza extends Pizza {
}

class ChicogoStyleClamPizza extends Pizza {
}

class ChicogoStyleVeggiePizza extends Pizza {
}

class ChicogoStyleCheesePizza extends Pizza {
    public ChicogoStyleCheesePizza() {
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void  cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
