package display;

import Behavior.IDisplayBehavior;

public class SoftDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("I display soft");
    }
}
