package generics11.coffees;

public class Capuccino extends Coffee {
    static class Factory implements reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Capuccino();
        }
    }
}
