package quack;

import Behavior.IQuackBehavior;

public class SayQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I Quack");
    }
}
