package PizzaFactoryPattern.Pizza;

import PizzaFactoryPattern.Pizza.Pizza;

public class MansarovarPizza implements Pizza {
    private final String style;

    public MansarovarPizza(String style) {
        this.style = style;
        System.out.printf("Creating pizza of style %s \n",style);
    }

    @Override
    public void bake() {
        System.out.println("Baking Mansarovar Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Mansarovar Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Mansarovar Pizza");
    }

    @Override
    public String toString() {
        return String.format("%s style pizza from Mansarovar Store",style);
    }
}
