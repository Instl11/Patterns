package patterns.decorator.compression;

public class EncryptionDecorator extends BasicDataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data){
        return "EncryptionDecorator encrypt data: " + data;
    }

    private String decode(String data){
        return "EncryptionDecorator decrypt data: " + data;
    }
}
