package patterns.command;

public class PrintCommand implements Command {

    TextFile file;

    public PrintCommand(TextFile file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.print();
    }
}
