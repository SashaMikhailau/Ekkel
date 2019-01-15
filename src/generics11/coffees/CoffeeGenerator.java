package generics11.coffees;

import generics11.Generator;
import reflection.ex11pets.TypeCounter;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    @Override
    public String toString() {
        return coffeeCounter.toString();
    }

    private static Class[] TYPES = {Brewe.class, Capuccino.class, Latte.class, Amerocano.class, Mocca.class};
    private TypeCounter coffeeCounter = new TypeCounter(Coffee.class);
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
            Coffee coffee = (Coffee)TYPES[random.nextInt(TYPES.length)].newInstance();
            coffeeCounter.count(coffee);
            return coffee;
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
        CoffeeGenerator coffees = new CoffeeGenerator(20);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
        System.out.println(coffees);
    }

}
