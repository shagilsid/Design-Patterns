package PizzaFactoryPattern;

import PizzaFactoryPattern.Store.MansarovarPizzaStore;
import PizzaFactoryPattern.Store.PatrakarPizzaStore;
import PizzaFactoryPattern.Store.PizzaStore;

public class MainPizzaStore {

    public static void main(String[] args) {
        PizzaStore pizzaStore=new PatrakarPizzaStore();
//        pizzaStore.orderPizza("grassy");

        PizzaStore mansarovarPizzaStore=new MansarovarPizzaStore();
        mansarovarPizzaStore.orderPizza("School");

    }
}
