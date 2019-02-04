package ekkel_arrays.ex8;

public class Main {
    public static void main(String[] args) {
        ArrayOfGenericType<String> strings = new ArrayOfGenericType<>(5);
        strings.array[0] = "123";
        strings.array[1] = "456";
        Double[] doubles = new Double[5];
        Number[] numbers = doubles;
        numbers[1] = 5.0f;
        System.out.println(numbers[1]);


    }
}
