public class Caramel implements AddOnDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost()+1;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat("with caramel");
    }
}
