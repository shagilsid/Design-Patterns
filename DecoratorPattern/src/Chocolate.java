public class Chocolate implements AddOnDecorator {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost()+3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat("with Chocolate");
    }
}