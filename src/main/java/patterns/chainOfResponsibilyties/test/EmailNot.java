package patterns.chainOfResponsibilyties.test;

public class EmailNot extends Not {

    public EmailNot(int level) {
        super(level);
    }

    @Override
    void printMessage(String message) {
        System.out.println("Email: " + message);
    }
}
