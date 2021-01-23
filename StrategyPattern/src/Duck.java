import Behavior.IDisplayBehavior;
import Behavior.IFlyBehavior;
import Behavior.IQuackBehavior;

public class Duck {
    IDisplayBehavior displayBehavior;
    IQuackBehavior quackBehavior;
    IFlyBehavior flyBehavior;

    public Duck() {
    }


    public void performDisplay(){
        displayBehavior.display();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(IFlyBehavior fb){
        flyBehavior=fb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setQuackBehavior(IQuackBehavior qb){
        quackBehavior=qb;
    }
}
