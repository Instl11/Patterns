package patterns.decorator.messenger;

public class EmailNotifier implements Notifier {

    @Override
    public void send(){
        System.out.println("ALARM! *Email*");
    }
}
