package ekkel_generics;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Setc {
    public static <T> Set<T> union(Set<T> setA,Set<T> setB) {
        Set<T> tempSet = getCopy(setA);
        tempSet.addAll(setB);
        return tempSet;
    }



    public static <T> Set<T> getCopy(Set<T> sourceSet) {
        if(sourceSet instanceof EnumSet){
            System.out.println("Enum clone");
            return ((EnumSet) sourceSet).clone();
        }
        System.out.println("Usual clone");
        return new HashSet<>(sourceSet);
    }

    public static <T> Set<T> difference(Set<T> setA,Set<T> setB) {
        Set<T> tempSet = getCopy(setA);

        tempSet.removeAll(setB);
        return tempSet;
    }
    public static <T> Set<T> intersect(Set<T> setA,Set<T> setB) {
        Set<T> tempSet = getCopy(setA);
        tempSet.retainAll(setB);
        return tempSet;
    }

    public static <T> Set<T> complement(Set<T> setA, Set<T> setB) {
        return difference(union(setA, setB), intersect(setA, setB));
    }


}
