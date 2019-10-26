package patterns.cache;

public class ProxyService implements Service {

    private String url;
    private RealService realService;

    public ProxyService(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realService == null) {
            realService = new RealService(url);
        }
        realService.run();
    }
}
