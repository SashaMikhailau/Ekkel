package ekkel_generics;

public class FourTuple<A,B,C,D> {
    A a;
    B b;
    C c;
    D d;

    public FourTuple(A a, B b, C c, D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
