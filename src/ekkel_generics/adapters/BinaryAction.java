package ekkel_generics.adapters;

public interface BinaryAction<T,V> {
    T combine(T t, V v);
}
