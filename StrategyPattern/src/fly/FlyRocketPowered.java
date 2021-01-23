package fly;

import Behavior.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with a rocket");
    }
}
