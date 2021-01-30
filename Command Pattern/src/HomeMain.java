import ElectricalComponents.Light;
import ElectricalComponents.Stereo;
import LightCommands.LightOffCommand;
import LightCommands.LightOnCommand;
import Remote.LightSimpleRemoteControl;
import Remote.StereoSimpleRemoteControl;
import StereoCommands.StereoCDCommand;
import StereoCommands.StereoOnCommand;

public class HomeMain {
    public static void main(String[] args) {
        LightSimpleRemoteControl lightRemote=new LightSimpleRemoteControl();
        StereoSimpleRemoteControl stereoRemote=new StereoSimpleRemoteControl();
        Light light=new Light();
        Stereo stereo=new Stereo();

        lightRemote.setOnSlot(new LightOnCommand(light));
        lightRemote.setOffSlot(new LightOffCommand(light));

        stereoRemote.setOnCommandSlot(new StereoOnCommand(stereo));
        stereoRemote.setOnCDCommandSlot(new StereoCDCommand(stereo));

        lightRemote.onButtonPressed();
        stereoRemote.onCommandPressed();
        lightRemote.offButtonPressed();
    }
}
