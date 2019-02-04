package reflection.ex11pets;

import reflection.ex13factories.Factory;

public class Gerbil extends Rodent{
    static class Factory implements reflection.ex13factories.Factory {
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
