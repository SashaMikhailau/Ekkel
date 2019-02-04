package ekkel_generics;

import java.util.HashMap;
import java.util.Map;

public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<K,V>();
    }

    public static void test(Map<String, Integer> map) {
        System.out.println(map);
    }

    public static void main(String[] args) {
       test(New.<String,Integer>map());


    }
}
