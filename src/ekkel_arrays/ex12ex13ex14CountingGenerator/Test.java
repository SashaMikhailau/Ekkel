package ekkel_arrays.ex12ex13ex14CountingGenerator;

import generics11.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Double[] doubles = createArray(Double.class, 10, new CountingGenerator.Double());
        //System.out.println(Arrays.toString(doubles));
        //String[] strings = createArray(String.class, 10, new CountingGenerator.String());
        //Stream.of(strings).forEach(System.out::println);

        for (Class<?> clazz : CountingGenerator.class.getClasses()) {
            try {
                Generator<?> newInstance = (Generator<?>)clazz.newInstance();
                Class<?> type = newInstance.next().getClass();
                Object[] array = createArray(type, 10, newInstance);
                System.out.println(Arrays.toString(array));

            } catch (InstantiationException|IllegalAccessException e) {
                e.printStackTrace();
            }


        }
    }
    @SuppressWarnings("unchecked")
    public static <T> T[] createArray(Class<T> clazz, int size, Generator<?> generator) {
        T[] array =  (T[])Array.newInstance(clazz, size);
        for (int i = 0; i < array.length; i++) {
            array[i] = (T)generator.next();
        }
        System.out.println(array.getClass());
        return array;
    }
}
