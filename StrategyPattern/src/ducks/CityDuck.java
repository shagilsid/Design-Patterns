package ducks;

import Behavior.IDisplayBehavior;
import Behavior.IFlyBehavior;
import Behavior.IQuackBehavior;
import display.HardDisplay;
import fly.FlyHigh;
import quack.SayQuack;

public class CityDuck extends Duck {

    public CityDuck() {
        this.flyBehavior = new FlyHigh();
        this.quackBehavior = new SayQuack();
        this.displayBehavior = new HardDisplay();
    }
}
