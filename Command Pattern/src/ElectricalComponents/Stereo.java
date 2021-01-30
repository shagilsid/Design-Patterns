package ElectricalComponents;

public class Stereo {
    public void on(){
        System.out.println("Stereo is On");
    }

    public void off(){
        System.out.println("Stereo is OFF");
    }

    public void setCD(){
        System.out.println("Stereo is set for CD input");
    }

    public void setDVD(){
        System.out.println("Stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println("Stereo is set for Radio input");
    }

    public void setVolume(int volume){
        System.out.println("Stereo Volume is set to "+volume);
    }
}
