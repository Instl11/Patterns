package patterns.decorator.compression;

public class Runner {
    public static void main(String[] args) {

        BasicDataSourceDecorator encoded = new CompressionDecorator(
                                                new EncryptionDecorator(
                                                    new FileDataSource("out/OutputDemo.txt")));

        String string = "Hello fucking world!!!";

        encoded.writeData(string);
    }
}
