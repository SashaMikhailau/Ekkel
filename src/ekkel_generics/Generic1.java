package ekkel_generics;

public class Generic1<T> {
    T t;
    void set(T t) {
        this.t = t;
    }
    public  static  <T> void make(Generic1<? super T> gen,T t){
        gen.set(t);
    }

    public static <T> T makeBack(Generic2<? extends T> gen) {
        return gen.getT();
    }

    public static void main(String[] args) {

    }

}
