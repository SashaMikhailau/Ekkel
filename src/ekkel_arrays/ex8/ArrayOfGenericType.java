package ekkel_arrays.ex8;

public class ArrayOfGenericType<T> {
    T[] array;

    public ArrayOfGenericType(int size) {
        array = (T[]) new Object[size];
    }
}
