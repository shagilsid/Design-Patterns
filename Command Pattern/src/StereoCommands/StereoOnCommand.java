package StereoCommands;

import ElectricalComponents.Stereo;
import interfaces.ICommand;

public class StereoOnCommand implements ICommand {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}
