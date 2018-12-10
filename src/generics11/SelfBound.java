package generics11;

public abstract class SelfBound<T extends SelfBound<T>> {
    abstract T transform(T t);

    public T get(T t) {
        System.out.println(t.getClass().getSimpleName());
        return transform(t);
    }


}
