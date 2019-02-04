package ekkel_generics;

public class BasisGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasisGenerator(Class<T> type) {
        this.type = type;
    }
    public static <T> BasisGenerator<T> create(Class<T> type) {
        return new BasisGenerator<T>(type);
    }
    @Override
    public  T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Generator<CountedClass> fibon = create(CountedClass.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(fibon.next());
        }
    }
}
