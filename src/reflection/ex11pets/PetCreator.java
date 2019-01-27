package reflection.ex11pets;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class PetCreator implements Creator {
    private Random rand = new Random(47);
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet() {
        try {
            return types().get(rand.nextInt(types().size())).newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            throw new RuntimeException();        }
    }

    public Pet[] createArray(int size) {
        return createStream(size).toArray(Pet[]::new);
    }
    public Stream<Pet> createStream(int size) {
        return Stream.generate(() -> randomPet()).limit(size);
    }
    public List<Pet> createList(int size) {
        return createStream(size).collect(Collectors.toList());
    }


}
