package ekkel_reflection.ex11pets;

public class Buldog extends Dog {
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Buldog();
        }
    }
    public Buldog(String name) {
        super(name);
    }

    public Buldog() {
        super();
    }
}
