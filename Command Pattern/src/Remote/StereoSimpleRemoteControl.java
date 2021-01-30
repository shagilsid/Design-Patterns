package Remote;

import interfaces.ICommand;

public class StereoSimpleRemoteControl {
    ICommand onCommandSlot;
    ICommand onCDCommandSlot;

    public void setOnCommandSlot(ICommand onCommand){
        onCDCommandSlot=onCommand;
    }

    public void setOnCDCommandSlot(ICommand onCDCommand){
        onCDCommandSlot=onCDCommand;
    }

    public void onCommandPressed(){
        onCDCommandSlot.execute();
    }

    public void onCDCommandPressed(){
        onCDCommandSlot.execute();
    }
}
