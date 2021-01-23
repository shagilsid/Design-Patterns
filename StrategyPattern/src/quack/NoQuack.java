package quack;

import Behavior.IQuackBehavior;

public class NoQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I do not quack");
    }
}
