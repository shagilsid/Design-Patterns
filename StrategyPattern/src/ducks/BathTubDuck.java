package ducks;

import display.SoftDisplay;
import fly.NoFly;
import quack.NoQuack;

public class BathTubDuck extends Duck {

    public BathTubDuck() {
        this.flyBehavior = new NoFly();
        this.quackBehavior = new NoQuack();
        this.displayBehavior = new SoftDisplay();
    }
}
