package patterns.composite.products;

public class BaseProduct implements Orderable {

    private int price;

    public BaseProduct(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
