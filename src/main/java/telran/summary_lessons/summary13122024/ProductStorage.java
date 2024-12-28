package telran.summary_lessons.summary13122024;

import telran.summary_lessons.summary13122024.model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductStorage {

    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductStorage() {
        init();
    }

    private void init () {
        Product soup = new Product(1, "Soup");
        Product pasta = new Product(2, "Pasta");
        Product burger = new Product(3, "Burger");
        Product wine = new Product(4, "Wine");

        productMap.put(soup.getId(), soup);
        productMap.put(pasta.getId(), pasta);
        productMap.put(burger.getId(), burger);
        productMap.put(wine.getId(), wine);
    }

    public void printProducts() {
        //for (Map.Entry<Integer, Product> product : productMap.entrySet());
        productMap.forEach((key, value) -> {
            System.out.println("" + key + " - " + value.getTitle());
        });
    }

    public Product getProduct(int key) {
        return productMap.get(key);
    }

    public Product getOrCreate(String title) {
        Collection<Product> values = productMap.values();
        for (Product product : values) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }

        int maxKey = 0;
        for (Integer key : productMap.keySet()) {
            maxKey = Math.max(key, maxKey);
        }

        Product product = new Product(maxKey+1,title);
        productMap.put(product.getId(), product);
        return product;
    }
}
