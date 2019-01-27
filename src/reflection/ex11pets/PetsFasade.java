package reflection.ex11pets;

import java.util.List;
import java.util.stream.Stream;

public class PetsFasade implements Creator {
    private Creator creator;

    public PetsFasade(Creator creator) {
        this.creator = creator;
    }


    @Override
    public Pet randomPet() {
        return creator.randomPet();
    }

    @Override
    public Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    @Override
    public List<Pet> createList(int size) {
        return creator.createList(size);
    }

    @Override
    public Stream<Pet> createStream(int size) {
        return creator.createStream(size);
    }
}
