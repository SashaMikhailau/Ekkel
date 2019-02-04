package ekkel_reflection.ex11pets;

public class Manx extends Cat {
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Manx();
        }
    }
    public Manx(String name) {
        super(name);
    }

    public Manx() {
    }
}
