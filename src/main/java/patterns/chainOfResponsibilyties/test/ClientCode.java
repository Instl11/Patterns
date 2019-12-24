package patterns.chainOfResponsibilyties.test;

public class ClientCode {
    public static void main(String[] args) {

        EmailNot emailNot = new EmailNot(1);
        NotSms notSms = new NotSms(2);
        emailNot.setNotifier(notSms);

        emailNot.notifyMessage("Hello", 2);
    }
}
