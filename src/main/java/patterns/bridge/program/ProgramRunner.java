package patterns.bridge.program;

public class ProgramRunner {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDev()),
                new StockExchange(new CppDev())
        };

        for (Program pr : programs) {
            pr.developProgram();
        }
    }
}
