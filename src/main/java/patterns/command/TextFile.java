package patterns.command;

//Receiver
public class TextFile {

    public void save(String path) {
        System.out.println("Saving to: " + path);
    }

    public void open() {
        System.out.println("Open...");
    }

    public void print() {
        System.out.println("Printing...");
    }
}
