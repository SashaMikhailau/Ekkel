package ekkel_generics;

import java.util.EnumSet;
import java.util.Set;

public class FlowersSetTest {
    public static void main(String[] args) {
        Set<Flowers> set = Setc.union(EnumSet.range(Flowers.ORANGE, Flowers.WHITE), EnumSet.range(Flowers.GREEN, Flowers.VIOLET));
        System.out.println(set);
        System.out.println(Setc.difference(set,EnumSet.range(Flowers.MARIN,Flowers.GREEN.WHITE)));
        System.out.println(Setc.intersect(set,EnumSet.range(Flowers.MARIN,Flowers.GREEN.WHITE)));
        System.out.println(Setc.complement(set,EnumSet.range(Flowers.MARIN,Flowers.GREEN.WHITE)));
    }
}
