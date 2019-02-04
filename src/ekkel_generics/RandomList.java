package ekkel_generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage  =new ArrayList<>();
    private Random random = new Random(47);

    public void add(T element) {
        storage.add(element);
    }

    public T get() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<Integer> list1 = new RandomList<>();
        RandomList<Object> list2 = new RandomList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(new Object());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get());
            System.out.println(list2.get());
        }

    }

}
