package patterns.decorator.compression;

public class BasicDataSourceDecorator implements DataSource {

    DataSource wrapped;

    public BasicDataSourceDecorator(DataSource source) {
        this.wrapped = source;
    }

    @Override
    public void writeData(String data) {
        wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}
