package reflection.ex11pets;

import java.util.HashMap;
import java.util.stream.Collectors;

public class PetCount3 {
    static class PetCounter extends HashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            LiteralPetCreator.alltypes.forEach(type->put(type,0));
        }

        void count(Pet pet) {
            keySet().stream().filter(clazz->clazz.isInstance(pet)).forEach((clazz->computeIfPresent(clazz,(k,v)->v+1)));
        }

        @Override
        public String toString() {
            return entrySet().stream()
                    .map(entry -> "key: " + entry.getKey().getSimpleName() + ", value: " + entry.getValue() + "\n")
                    .collect(Collectors.joining());
        }
    }

    public static void countPets(PetsFasade fasade) {
        PetCounter counter = new PetCounter();
        fasade.createStream(20).forEach(pet->counter.count(pet));
        System.out.println(counter);

    }
    public static void main(String[] args) {
        countPets(new PetsFasade(new LiteralPetCreator()));
    }
}
