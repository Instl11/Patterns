package patterns.composite;

import patterns.composite.products.Orderable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxProducts implements Orderable {

    private List<Orderable> products = new ArrayList<>();

    void addProduct(Orderable... product) {
        products.addAll(Arrays.asList(product));
    }

    @Override
    public int getPrice() {

        return products.stream()
                .mapToInt(Orderable::getPrice)
                .sum();
    }

    void removeAll(){
        products.clear();
    }

    void remove(Orderable product){
        products.remove(product);
    }
}
