package reflection.ex11pets;

public class Mau extends Cat {
    static class Factory implements reflection.ex13factories.Factory {
        @Override
        public Object create() {
            return new Mau();
        }
    }
    public Mau(String name) {
        super(name);
    }

    public Mau() {
        super();
    }
}
