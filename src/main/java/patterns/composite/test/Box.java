package patterns.composite.test;

import patterns.composite.products.Orderable;

import java.util.ArrayList;
import java.util.List;

public class Box implements Orderable {

    private List<Orderable> products = new ArrayList<>();

    @Override
    public int getPrice() {
        return products.stream()
                .mapToInt(Orderable::getPrice)
                .sum();
    }


}
