package patterns.decorator.compression;

public class CompressionDecorator extends BasicDataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressData(data));
    }

    @Override
    public String readData() {
        return decompressData(super.readData());
    }

    private String compressData(String data) {
        return "CompressionDecorator compress data: " + data;
    }

    private String decompressData(String data) {
        return "CompressionDecorator decompress data: " + data;
    }
}
