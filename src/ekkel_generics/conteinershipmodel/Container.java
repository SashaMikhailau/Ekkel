package ekkel_generics.conteinershipmodel;

import generics11.Generators;

import java.util.ArrayList;

public class Container extends ArrayList<Product> {
    private static long counter;
    private long id = ++counter;

    @Override
    public String toString() {
        return "\tContainer №" + id;
    }

    public Container(int nProducts) {
        Generators.fill(this,Product.generator,nProducts);
    }
}
