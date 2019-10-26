package patterns.decorator.compression;

public interface DataSource {

    void writeData(String data);

    String readData();
}
