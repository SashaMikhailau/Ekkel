package ekkel_generics.latentTipization;

import java.util.Collection;

public class  AddableCollection<T> implements Addable<T> {
    private Collection<T> collection;

    public AddableCollection(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void add(T t) {
        collection.add(t);
    }
}
