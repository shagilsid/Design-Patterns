package fly;

import Behavior.IFlyBehavior;

public class NoFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I do not fly");
    }
}
