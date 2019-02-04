package ekkel_reflection.ex11pets;

public class Gerbil extends Rodent{
    static class Factory implements ekkel_reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Gerbil();
        }
    }
    public Gerbil(String name) {
        super(name);
    }

    public Gerbil() {
        super();
    }
}
