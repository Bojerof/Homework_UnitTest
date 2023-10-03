package Homework_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Shop(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        products.sort(Comparator.comparing(Product::getCost));
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        int max = 0;
        Product newProduct = new Product();
        for (var product : products) {
            if (max < product.getCost())
                max = product.getCost();
        }
        for (var product : products) {
            if(max == product.getCost()){
                newProduct = product;
            }
        }
        return newProduct;
    }
}