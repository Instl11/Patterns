package patterns.chainOfResponsibilyties.test;

public class NotSms extends Not {

    public NotSms(int level) {
        super(level);
    }

    @Override
    void printMessage(String message) {
        System.out.println("Sms: " + message);
    }
}
