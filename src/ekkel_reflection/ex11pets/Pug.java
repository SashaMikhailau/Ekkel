package ekkel_reflection.ex11pets;

public class Pug extends Dog {
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Pug();
        }
    }
    public Pug(String name) {
        super(name);
    }

    public Pug() {
        super();
    }
}
