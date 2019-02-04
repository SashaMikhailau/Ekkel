package ekkel_generics;

public class Triple<T> {


    private T first,second,third;

    public T getFirst() {
        return first;
    }

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;

    }

    public void setThird(T third) {
        this.third = third;
    }

    public void setSecond(T second) {

        this.second = second;
    }

    public void setFirst(T first) {

        this.first = first;
    }

    public T getSecond() {
        return second;

    }

    public T getThird() {

        return third;
    }
}
