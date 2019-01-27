package reflection.ex11pets;

import java.util.List;
import java.util.stream.Stream;

public interface Creator {
    Pet randomPet();

    Pet[] createArray(int size);

    List<Pet> createList(int size);

    Stream<Pet> createStream(int size);

}
