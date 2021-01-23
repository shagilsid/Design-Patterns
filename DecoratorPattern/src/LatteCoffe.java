public class LatteCoffe implements Beverage {
    @Override
    public String getDescription() {
        return new String("Latte Coffe");
    }

    @Override
    public int getCost() {
        return 3;
    }
}
