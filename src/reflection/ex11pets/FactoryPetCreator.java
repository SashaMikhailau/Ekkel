package reflection.ex11pets;

import reflection.ex13factories.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FactoryPetCreator implements Creator {
    private List<Factory<? extends Pet>> petFactories = new ArrayList<>();
    @SuppressWarnings("unchecked")
    public FactoryPetCreator() {
        petFactories.add(new Buldog.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Mau.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(new Gerbil.Factory());
    }
    private Random rand = new Random(47);
    @Override
    public Pet randomPet() {
        return petFactories.get(rand.nextInt(petFactories.size())).create();
    }

    @Override
    public Pet[] createArray(int size) {
        return createStream(size).toArray(Pet[]::new);
    }

    @Override
    public List<Pet> createList(int size) {
        return createStream(size).collect(Collectors.toList());
    }

    @Override
    public Stream<Pet> createStream(int size) {
        return Stream.generate(this::randomPet).limit(size);
    }
}
