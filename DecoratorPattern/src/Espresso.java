public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return new String("Espresso");
    }

    @Override
    public int getCost() {
        return 4;
    }
}
