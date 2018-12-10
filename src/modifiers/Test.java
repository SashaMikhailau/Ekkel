package modifiers;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static modifiers.debug.Main.*;
//import static modifiers.debugoff.Main.*;

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
