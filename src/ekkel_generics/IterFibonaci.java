package ekkel_generics;

import java.util.Iterator;

public class IterFibonaci implements Iterable<Integer> {
    private int size ;
    private Fibonacci fibonacci;

    public IterFibonaci(int size) {
        this.size = size;
        fibonacci = new Fibonacci();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return fibonacci.count < size;
            }

            @Override
            public Integer next() {
                return fibonacci.next();
            }
        };
    }
}
