package patterns.decorator.messenger;

public class BasicNotifierDecorator implements Notifier{

    private Notifier notifier;

    public BasicNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
