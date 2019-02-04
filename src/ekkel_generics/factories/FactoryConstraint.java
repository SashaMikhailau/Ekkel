package ekkel_generics.factories;

public class FactoryConstraint<T> {
    private T element;

    public <F extends Factory<T>> FactoryConstraint(F factory) {
        this.element = factory.create(5);
    }

    public static void main(String[] args) {
        FactoryConstraint<Integer> factory1 = new FactoryConstraint<Integer>(new IntegerFactory());
        System.out.println(factory1.element.doubleValue());
        FactoryConstraint<Thread> factory2 = new FactoryConstraint<Thread>(new WidjetFactory());
        System.out.println(factory2.element);


    }
}
