package PizzaFactoryPattern.Store;

import PizzaFactoryPattern.Pizza.PatrakaryStylePizza;
import PizzaFactoryPattern.Pizza.Pizza;

public class PatrakarPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String style) {
        return new PatrakaryStylePizza(style);
    }
}
