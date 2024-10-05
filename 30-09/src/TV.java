public class TV {
    int channel;
    int volume;
    boolean on;

    TV(){
        channel = 1;
        volume = 1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 120)
            this.channel = newChannel;
    }

    public void setVolume(int newVolume){
        if (on && newVolume >= 1 && newVolume <= 7)
            this.volume = volume;
    }

    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if (on && volume < 7)
            volume++;
    }

    public void volumeDown(){
        if (on && volume > 1)
            volume--;
    }

}
