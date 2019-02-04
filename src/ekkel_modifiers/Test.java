package ekkel_modifiers;


import java.util.HashMap;
import java.util.Map;
//import static ekkel_modifiers.debugoff.Main.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, null);
        map.put(2, "Beatles");
        map.put(3, "Cdiez");

        System.out.println(map);
        map.computeIfAbsent(1, k -> "Empty");
        System.out.println(map);



    }
}
