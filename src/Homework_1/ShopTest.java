package Homework_1;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        List<Product> products = createList();
        Shop shop = new Shop(products);
        Product maxCost = shop.getMostExpensiveProduct();
        List<Product> sortProducts = shop.getSortedListProducts();
        assertList(maxCost, sortProducts);
        System.out.println("Максимальный цена " + maxCost + "\n");
        for (Product item : sortProducts) {
            System.out.println(item);
        }
    }

    public static List<Product> createList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(20, "water"));
        products.add(new Product(15, "bread"));
        products.add(new Product(25, "chocolate"));
        products.add(new Product(5, "tea"));
        return products;
    }
    public static void assertList(Product maxCost, List<Product> sortProducts){
        if(!maxCost.equals(null))
            assertThat(maxCost.getCost()).isEqualTo(25);
        List<String> nameProducts = new ArrayList<>();
        List<Integer> costProducts = new ArrayList<>();
        if (!sortProducts.equals(null)) {
            for (Product item : sortProducts) {
                nameProducts.add(item.getTitle());
                costProducts.add(item.getCost());
            }
            assertThat(nameProducts.toArray())
                    .containsSequence("tea", "bread", "water", "chocolate")
                    .hasSize(4);
        }
    }
}
    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */





