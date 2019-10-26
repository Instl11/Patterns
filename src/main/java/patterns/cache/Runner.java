package patterns.cache;

public class Runner {
    public static void main(String[] args) {
        Service service =
                new ProxyService("https://www.github.com/Instl11/test");
        service.run();
    }
}
