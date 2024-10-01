public class TV {
    private int channel;
    private int volume;
    private boolean on;

    TV(){
        channel = 1;
        volume = 0;
        on = false;
    }
    //tv

    public void turnOn(){
        this.on = true;
        System.out.println("TV ON");
    }

    public void turnOff(){
        this.on = false;
        System.out.println("TV OFF");
    }

    public void setChannel(int channel){
        this.channel = channel;
        System.out.println("Channel = " + channel);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume = " + volume);
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

}
