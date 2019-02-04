package ekkel_innerclasses.selectors;

public interface Selector<T> {
    T current();

    boolean end();

    void next();
}
