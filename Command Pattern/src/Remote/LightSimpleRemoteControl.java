package Remote;

import interfaces.ICommand;

public class LightSimpleRemoteControl {
    ICommand onSlot;
    ICommand offSlot;

    public void setOnSlot(ICommand onCommand){
        onSlot=onCommand;
    }

    public void setOffSlot(ICommand offCommand){
        offSlot=offCommand;
    }

    public void onButtonPressed(){
        onSlot.execute();
    }
    public void offButtonPressed(){
        offSlot.execute();
    }
}
