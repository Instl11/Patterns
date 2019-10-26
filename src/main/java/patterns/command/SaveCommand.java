package patterns.command;

public class SaveCommand implements Command {

    private TextFile file;
    private String path;

    public SaveCommand(TextFile file, String path) {
        this.file = file;
        this.path = path;
    }

    @Override
    public void execute() {
        file.save(path);
    }
}
