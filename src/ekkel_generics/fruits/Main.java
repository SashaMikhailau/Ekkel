package ekkel_generics.fruits;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Integer[5];
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        List<? extends Number> list = new ArrayList<Integer>(list1);
        List<? super Integer> list2 = new ArrayList<Number>();
        list2.add(new Integer(5));
        Number n = list.get(0);
        System.out.println(list.indexOf(5));



    }
}
