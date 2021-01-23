package display;

import Behavior.IDisplayBehavior;

public class HardDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("I look hard");
    }
}
