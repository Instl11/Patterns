package patterns.bridge.program;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system...");
        developer.writeCode();
    }
}
