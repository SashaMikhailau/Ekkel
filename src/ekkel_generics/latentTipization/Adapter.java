package ekkel_generics.latentTipization;

import java.util.Collection;

public class Adapter {
    public static <T> Addable<T> addableCollection(Collection<T> collection) {
        return new AddableCollection<>(collection);
    }
}
