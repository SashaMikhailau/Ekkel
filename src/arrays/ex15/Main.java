package arrays.ex15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] array = {"B", "N", "C", "A"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
