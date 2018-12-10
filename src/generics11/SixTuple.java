package generics11;

import java.util.ArrayList;
import java.util.List;

public class SixTuple<T,U,X,V,Z,Y> {
    T t;
    U u;
    X x;
    V v;
    Z z;
    Y y;

    public SixTuple(T t, U u, X x, V v, Z z, Y y) {
        this.t = t;
        this.u = u;
        this.x = x;
        this.v = v;
        this.z = z;
        this.y = y;
    }

    @Override
    public String toString() {
        return "generics11.SixTuple{" +
                "t=" + t +
                ", u=" + u +
                ", x=" + x +
                ", v=" + v +
                ", z=" + z +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        SixTuple<String, Integer, String, Long, Double, List<String>> list = new SixTuple<>("123",1,"456",5l,
        5.5,new ArrayList<>());
        System.out.println(list);
    }
}
