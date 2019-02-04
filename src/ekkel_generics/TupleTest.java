package ekkel_generics;
import java.util.ArrayList;

import static ekkel_generics.Tuple.*;
public class TupleTest {
    public static TwoTuple<String,Integer> f() {
        return tuple("123", 10);
    }
    public static TwoTuple f2() {
        return tuple("123", 10);
    }
    public static ThreeTuple<String,Double,Integer> f3() {
        return tuple("123", 10.0, 56
        );
    }
    public static FourTuple<String,Double,Integer,String> f4() {
        return tuple("123", 10.0, 56,"456");
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
        TwoTuple<String,Integer> two = f2();
        System.out.println(f3());
        System.out.println(f4());
        ArrayList list = new ArrayList<Integer>();
        list.add("123");
        list.add(5);
        list.add(new Object());
        ArrayList<String> list2 = list;
        for (String s : list2) {
            System.out.println("start");
            System.out.println(s);
        }




}}
