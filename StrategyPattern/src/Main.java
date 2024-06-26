import ducks.BathTubDuck;
import ducks.CityDuck;
import ducks.Duck;
import quack.NoQuack;
import quack.SayQuack;

public class Main {
    public static void main(String[] args) {

        Duck cityDuck = new CityDuck();
        cityDuck.performFly();
        cityDuck.performQuack();
        cityDuck.performDisplay();

        cityDuck.setQuackBehavior(new NoQuack());
        cityDuck.performQuack();

        System.out.println();

        Duck bathTubDuck = new BathTubDuck();
        bathTubDuck.performQuack();
        bathTubDuck.performDisplay();
        bathTubDuck.performFly();
        bathTubDuck.setQuackBehavior(new SayQuack());
        bathTubDuck.performQuack();
    }
}
