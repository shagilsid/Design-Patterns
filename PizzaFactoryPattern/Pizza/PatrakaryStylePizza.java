package PizzaFactoryPattern.Pizza;

public class PatrakaryStylePizza implements Pizza {
    private final String style;
    public PatrakaryStylePizza(String style) {
        this.style=style;
        System.out.printf("Creating pizza of style %s \n",style);
    }

    @Override
    public void bake() {
        System.out.println("Baking Patrakar Style Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Patrakar Style Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Patrakar Style Pizza");
    }

    @Override
    public String toString() {
        return String.format("%s style pizza from Patrakar Store",style);
    }
}
