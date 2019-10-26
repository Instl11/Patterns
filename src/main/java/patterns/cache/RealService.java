package patterns.cache;

public class RealService implements Service {
    String url;

    public RealService(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Project loaded from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
