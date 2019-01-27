package reflection.ex1;

import java.io.Serializable;

public class Toy {

    public int iq;
    public Toy(int i1) {
        iq = i1;
    }
}

class FancyToy extends Toy implements Serializable, Runnable {
    public FancyToy(int i1) {
        super(i1);
    }

    @Override
    public void run() {

    }
}
