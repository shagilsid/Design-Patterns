package PizzaFactoryPattern.Store;

import PizzaFactoryPattern.Pizza.MansarovarPizza;
import PizzaFactoryPattern.Pizza.Pizza;

public class MansarovarPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String style) {
        return new MansarovarPizza(style);
    }
}
