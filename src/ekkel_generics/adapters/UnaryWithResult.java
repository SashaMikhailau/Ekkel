package ekkel_generics.adapters;

public interface UnaryWithResult<T,V> {
    T takeResult(V v);
}
