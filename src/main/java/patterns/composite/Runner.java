package patterns.composite;

import patterns.composite.products.Bread;
import patterns.composite.products.Cheese;
import patterns.composite.products.Milk;
import patterns.composite.products.Orderable;

public class Runner {
    public static void main(String[] args) {

        Orderable cheese = new Cheese(10);
        Orderable milk = new Milk(20);
        Orderable bread = new Bread(30);

        BoxProducts bigBox = new BoxProducts();
        bigBox.addProduct(cheese, milk, bread);

        BoxProducts middleBox = new BoxProducts();
        middleBox.addProduct(cheese, cheese);
        bigBox.addProduct(middleBox);

        System.out.println(bigBox.getPrice());
    }
}
