package modifiers.ex20;

import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface Inter {
    static void cry(){
        System.out.println("Inside interface");
    }

    public static void main(String[] args) {
        System.out.println(" end " + Stream.of(5, 6, 7, 8, 9).filter(i -> i >= 7).peek(System.out::print).count());

    }
    class InterInner{
        void f(){


        }
    }
}
