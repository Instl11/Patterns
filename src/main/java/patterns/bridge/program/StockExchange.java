package patterns.bridge.program;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange...");
        developer.writeCode();
    }
}
