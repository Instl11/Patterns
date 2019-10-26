package patterns.decorator.messenger;

public class Runner {
    public static void main(String[] args) {

        Notifier notifier = new SmsNotifierDecorator(
                                new PhoneNotifierDecorator(
                                        new EmailNotifier()));

        notifier.send();
    }
}
