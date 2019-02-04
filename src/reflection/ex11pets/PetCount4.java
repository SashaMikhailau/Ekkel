package reflection.ex11pets;

public class PetCount4 {
    private static void countPets(PetsFasade fasade) {
        TypeCounter counter = new TypeCounter(Pet.class);
        fasade.createStream(20).forEach(pet->counter.count(pet));
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countPets(new PetsFasade(new FactoryPetCreator()));
    }
}
