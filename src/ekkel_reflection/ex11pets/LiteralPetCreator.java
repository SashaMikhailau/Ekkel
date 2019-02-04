package ekkel_reflection.ex11pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    public static final List<Class<? extends Pet>> alltypes = Collections.unmodifiableList(Arrays.asList(
            Pet.class,Cat.class,Dog.class,Rodent.class,Gerbil.class,Hamster.class, Manx.class,Mau.class,Pug.class,Buldog.class
    ));
    private static final List<Class<? extends Pet>> types = alltypes.subList(alltypes.indexOf(Gerbil.class), alltypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
