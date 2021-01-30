package StereoCommands;

import ElectricalComponents.Stereo;
import interfaces.ICommand;

public class StereoCDCommand implements ICommand {
    Stereo stereo;

    public StereoCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(1);
    }
}
