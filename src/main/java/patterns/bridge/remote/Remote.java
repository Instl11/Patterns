package patterns.bridge.remote;

public abstract class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    void power(){};
    void volumeDown(){};
    void volumeUp(){};
    void channelDown(){};
    void channelUp(){};
}
