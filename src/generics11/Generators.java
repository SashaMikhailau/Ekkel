package generics11;

import java.util.Collection;
import java.util.Collections;

public class Generators {

    public static <T> void fill(Collection<T> coll, Generator<T> gen, int number) {
        for (int i = 0; i < number; i++) {
            coll.add(gen.next());
        }
    }
}
