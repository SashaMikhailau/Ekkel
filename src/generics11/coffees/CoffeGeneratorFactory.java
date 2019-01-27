package generics11.coffees;

import generics11.Generator;
import generics11.coffees.Coffee;
import reflection.ex13factories.Factory;

import java.util.*;
import java.util.stream.Stream;

public class CoffeGeneratorFactory implements Generator<Coffee>,Iterable<Coffee> {
    private int size;

    public CoffeGeneratorFactory(int size) {
        this.size = size;
    }

    private Random rand = new Random(47);
    private List<Factory<? extends Coffee>> factories = Arrays.asList(
            new Capuccino.Factory(), new Mocca.Factory(),new Latte.Factory(),new Amerocano.Factory(),new Brewe.Factory()
    );

    @Override
    public Coffee next() {
        return factories.get(rand.nextInt(factories.size())).create();
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            if (hasNext()) {
                count--;
                return CoffeGeneratorFactory.this.next();
            } else throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        CoffeGeneratorFactory factory = new CoffeGeneratorFactory(20);
        for (Iterator<Coffee> iter = factory.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
