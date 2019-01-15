package generics11.coffees;

import reflection.ex13factories.Factory;

public class Amerocano extends Coffee {
    static class Factory implements reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Amerocano();
        }
    }
}
