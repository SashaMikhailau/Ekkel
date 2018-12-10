package generics11.conteinershipmodel;

import generics11.Generator;

import java.util.Random;

public class Product {
    private static long counter;
    private long id = ++counter;
    private String description;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\t\t%d: %s, price - %f", id, description, price);
    }

    public static Generator<Product> generator = new Generator<Product>() {
        Random random = new Random();
        @Override
        public Product next() {
            return new Product("Test product", random.nextDouble() * 1000 + 0.99);
        }
    };
}
