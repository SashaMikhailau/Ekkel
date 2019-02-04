package ekkel_generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test<T> {
   private Object array;

    public Test(Class<?> type) {
        this.array = Array.newInstance(type, 10);
    }
    public T[] get() {
        return (T[])array;
    }

    public static void main(String[] args) {
        Test<Integer> test = new Test(Integer.class);
        Integer[] mass = test.get();
        System.out.println(test.get());
    }

}
