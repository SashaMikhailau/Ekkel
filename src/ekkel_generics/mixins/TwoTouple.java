package ekkel_generics.mixins;

public class TwoTouple<T,V> {
    private T t; V v;

    public TwoTouple(T t, V v) {
        this.t = t;
        this.v = v;
    }
    public T first() {
        return t;
    }
    public  V second() {
        return v;
    }
}
