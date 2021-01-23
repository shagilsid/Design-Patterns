import Behavior.IDisplayBehavior;
import Behavior.IFlyBehavior;
import Behavior.IQuackBehavior;
import display.HardDisplay;
import fly.FlyHigh;
import quack.SayQuack;

public class CityDuck extends Duck{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;
    public CityDuck(){
        quackBehavior=new SayQuack();
        flyBehavior=new FlyHigh();
        displayBehavior=new HardDisplay();

    }
}
