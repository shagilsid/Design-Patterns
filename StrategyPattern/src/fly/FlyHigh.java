package fly;

import Behavior.IFlyBehavior;

public class FlyHigh implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I Fly High");
    }
}
