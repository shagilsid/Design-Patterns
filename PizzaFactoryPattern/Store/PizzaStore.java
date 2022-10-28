package PizzaFactoryPattern.Store;

import PizzaFactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String style){
        Pizza justPizza=createPizza(style);
        justPizza.bake();
        justPizza.cut();
        justPizza.box();
        System.out.println("Here is your Pizza: "+ justPizza);
        return justPizza;
    }

    abstract Pizza createPizza(String style);
}
