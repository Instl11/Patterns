package patterns.decorator.compression;

public class FileDataSource implements DataSource {

    String path;

    public FileDataSource(String path) {
        this.path = path;
    }

    @Override
    public void writeData(String data) {
        System.out.println("FileDataSource is writing data: " + data);
    }

    @Override
    public String readData() {
        return "FileDataSource read data: Hello world!!";
    }
}
