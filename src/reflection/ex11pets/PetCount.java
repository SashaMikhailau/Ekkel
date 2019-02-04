package reflection.ex11pets;

import java.util.HashMap;
import java.util.stream.Stream;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        void count(String type) {
            merge(type, 1, (i1, i2) -> i1 + 1);
        }
    }

    public static void countPets(PetCreator petCreator) {
        PetCounter counter = new PetCounter();
        Stream.of(petCreator.createArray(20)).forEach(pet->{
            if (pet instanceof Pet) {
                counter.count("Pet");
                if (pet instanceof Cat) {
                    counter.count("Cat");
                    if (pet instanceof Manx) {
                        counter.count("Manx");
                    }
                    if (pet instanceof Mau) {
                        counter.count("Mau");
                    }
                }
                if (pet instanceof Dog) {
                    counter.count("Dog");
                    if (pet instanceof Buldog) {
                        counter.count("Buldog");
                    }
                    if (pet instanceof Pug) {
                        counter.count("Pug");
                    }
                }
                if (pet instanceof Rodent) {
                    counter.count("Rodent");
                    if (pet instanceof Hamster) {
                        counter.count("Hamster");
                    }
                    if (pet instanceof Gerbil) {
                        counter.count("Gerbil");
                    }
                }
            }
        });
        System.out.println(counter);

    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
