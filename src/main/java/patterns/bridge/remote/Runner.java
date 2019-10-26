package patterns.bridge.remote;

public class Runner {
    public static void main(String[] args) {
        Device device = new Radio();
        Remote remote = new BasicRemote(device);
        remote.power();
    }
}
