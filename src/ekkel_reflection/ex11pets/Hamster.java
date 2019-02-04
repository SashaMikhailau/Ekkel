package ekkel_reflection.ex11pets;

public class Hamster extends Rodent {
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Hamster();
        }
    }

    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
    }
}
