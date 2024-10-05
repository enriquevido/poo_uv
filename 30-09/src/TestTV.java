public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(45);
        tv1.setVolume(3);
        tv1.channelDown();
        if (tv1.on) {
            System.out.println("TV1: Channel is " + tv1.channel + " and volume is " + tv1.volume);
        }
            else {
            System.out.println("TV1 is turned off");
        }

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel(80);
        tv2.setVolume(7);
        tv2.volumeDown();
        tv2.turnOff();
        if (tv2.on) {
            System.out.println("TV2: Channel is " + tv2.channel + " and volume is " + tv2.volume);
        }
        else {
            System.out.println("TV2 is turned off");
        }
    }
}
