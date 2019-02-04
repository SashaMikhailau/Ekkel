package ekkel_generics;

public class GenericMethods {
    public static void main(String[] args) {
        f("555",6f,(byte)5);
    }
    public static  <A, B> void f(A a, B b, Byte c) {
        System.out.printf("A type is %s, B type is %s, C type is %s",a.getClass().getSimpleName(),b.getClass().getSimpleName(),
                c.getClass().getSimpleName());
    }
}
