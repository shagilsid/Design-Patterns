package Improv;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    Looks looks;
    Swim swim;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior, Looks looks, Swim swim) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
        this.looks = looks;
        this.swim = swim;
    }

    private QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    private FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    private Looks getLooks() {
        return looks;
    }

    public void setLooks(Looks looks) {
        this.looks = looks;
    }

    private Swim getSwim() {
        return swim;
    }

    public void setSwim(Swim swim) {
        this.swim = swim;
    }

    public String fly() {
        return getFlyBehavior().fly();
    }

    public String swim() {
        return getSwim().swim();
    }

    public String display() {
        return getLooks().display();
    }

    public String quack() {
        return getQuackBehavior().quack();
    }

}
