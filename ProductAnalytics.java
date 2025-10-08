import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Category: " + category;
    }
}

public class ProductAnalytics {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1000, "Electronics"),
                new Product("Phone", 700, "Electronics"),
                new Product("Shirt", 50, "Clothing"),
                new Product("Jeans", 80, "Clothing"),
                new Product("Blender", 120, "Home Appliances")
        );

        Map<String, List<Product>> grouped = products.stream()
                .collect(Collectors.groupingBy(p -> p.category));
        System.out.println("Products grouped by category:");
        grouped.forEach((cat, list) -> System.out.println(cat + ": " + list));

        Map<String, Optional<Product>> mostExpensive = products.stream()
                .collect(Collectors.groupingBy(
                        p -> p.category,
                        Collectors.maxBy(Comparator.comparingDouble(p -> p.price))
                ));
        System.out.println("\nMost expensive product in each category:");
        mostExpensive.forEach((cat, prod) -> System.out.println(cat + ": " + prod.get()));

        double avgPrice = products.stream()
                .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("\nAverage price of all products: " + avgPrice);
    }
}
