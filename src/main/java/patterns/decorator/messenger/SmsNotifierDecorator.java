package patterns.decorator.messenger;

public class SmsNotifierDecorator extends BasicNotifierDecorator {

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("ALARM! *SMS*");
    }
}
