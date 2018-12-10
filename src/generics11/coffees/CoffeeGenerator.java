package generics11.coffees;

import generics11.Generator;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private static Class[] TYPES = {Brewe.class, Capuccino.class, Latte.class, Amerocano.class, Mocca.class};
    private Random random = new Random(47);
    int size;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {

        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee)TYPES[random.nextInt(TYPES.length)].newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException();}

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public boolean hasNext() {
            return count>0;
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator(5);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }

}
