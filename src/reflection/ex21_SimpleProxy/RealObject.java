package reflection.ex21_SimpleProxy;

public class RealObject implements Interface {
    @Override
    public void doSomethig() {
        System.out.println("Real do something");
    }

    @Override
    public void doSomethingElse(String name) {
        for (int i = 0; i < 1000000000; i++) {
            i += 2;
        }
        System.out.println("Read do something else( "+name+")");
    }
}
