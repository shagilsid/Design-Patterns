public interface AddOnDecorator extends Beverage {
    //Beverage beverage;
    @Override
    int getCost();

    @Override
    String getDescription();
}
