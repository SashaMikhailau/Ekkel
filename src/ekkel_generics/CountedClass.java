package ekkel_generics;

public class CountedClass {
    private static long count =0;
    private long id = count++;

    @Override
    public String toString() {
        return String.format("%s - №%d", getClass().getSimpleName(), id);
    }

    public static void main(String ...args) {
        //Generator<CountedClass> gen = new BasisGenerator<>(CountedClass.class);
        Generator<CountedClass> gen = BasisGenerator.create(CountedClass.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
