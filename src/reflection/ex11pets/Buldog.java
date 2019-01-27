package reflection.ex11pets;

public class Buldog extends Dog {
    static class Factory implements reflection.ex13factories.Factory {
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
