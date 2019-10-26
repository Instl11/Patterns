package patterns.decorator.messenger;

public class PhoneNotifierDecorator extends BasicNotifierDecorator {

    public PhoneNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("ALARM! *Phone*");
    }
}
