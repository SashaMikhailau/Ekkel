package ekkel_generics.factories;

public class IntegerFactory implements Factory<Integer> {
    @Override
    public Integer create(int value) {
        return value;
    }

}
