package ekkel_arrays.ex15;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] array = {"B", "N", "C", "A"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
