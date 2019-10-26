package patterns.command;

//Invoker
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
