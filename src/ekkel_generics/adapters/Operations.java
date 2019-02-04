package ekkel_generics.adapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operations {

    static class SumFirst implements BinaryAction<First, First> {
        @Override
        public First combine(First first, First first2) {
            return new First(first.getValue().concat(first2.getValue()));
        }
    }

    static class SumStrings implements BinaryAction<String, String> {
        @Override
        public String combine(String s, String s2) {
            return s.concat(s2);
        }
    }

    static class SumIntegers implements BinaryAction<Integer, Integer> {
        @Override
        public Integer combine(Integer integer, Integer integer2) {
            return integer + integer2;
        }
    }

    static class MultiplyString implements UnaryAction<String> {
        @Override
        public String transform(String s) {
            return s.concat(s);
        }
    }

    static class MultiplyInteger implements UnaryAction<Integer> {
        @Override
        public Integer transform(Integer integer) {
            return integer * integer;
        }
    }

    static class LetterCOunt implements UnaryWithResult<Integer, String> {
        @Override
        public Integer takeResult(String s) {
            return s.length();
        }
    }

    static class CiferCount implements UnaryWithResult<Integer, Integer> {
        @Override
        public Integer takeResult(Integer integer) {
            int ciferCount = 0;
            while (integer>0) {
                integer/=10;
                ciferCount++;
            }
            return ciferCount;
        }
    }

    public static <T> T makeBinaryACtions(BinaryAction<T,T> action, List<T> list){
        T result = list.get(0);
        for (int i =1;i<list.size();i++) {
            result = action.combine(result, list.get(i));
        }
        return result;
    }

    public static <T> List<T> makeUnaryAction(UnaryAction<T> action, List<T> list) {
        List<T> list2 = new ArrayList<>();
        for (T t : list) {
            list2.add(action.transform(t));
        }
        return list2;
    }

    public static <T, V> List<T> makeUnaryWithResult(UnaryWithResult<T, V> action, List<V> list) {
        List<T> results = new ArrayList<>();
        for (V v : list) {
            results.add(action.takeResult(v));
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Deep", "Purple", "Deer", "Clown");
        List<Integer> integers = Arrays.asList(10, 515, 677);
        List<First> firsts = Arrays.asList(new First("Deep"), new First("Purple"),
                new First("Deer"), new First("Clown"));
        System.out.println(makeUnaryAction(new MultiplyString(),strings));
        System.out.println(makeUnaryAction(new MultiplyInteger(),integers));
        System.out.println(makeUnaryWithResult(new CiferCount(),integers));
        System.out.println(makeUnaryWithResult(new LetterCOunt(),strings));
        System.out.println(makeBinaryACtions(new SumStrings(),strings));
        System.out.println(makeBinaryACtions(new SumIntegers(),integers));
        System.out.println(makeBinaryACtions(new SumFirst(),firsts));
    }



}
