package ekkel_generics.coffees;

public class Mocca extends Coffee {
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Mocca();
        }
    }
}
