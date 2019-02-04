package generics11.coffees;

public class Brewe extends Coffee {
    static class Factory implements reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Brewe();
        }
    }
}
