package ekkel_generics;

public class ThreeTuple<A,B,C> {
    A a;
    B b;
    C c;

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public ThreeTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
