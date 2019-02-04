package ekkel_reflection.ex11pets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForNameCreator extends PetCreator {
    private static final List<Class<? extends Pet>> types = new ArrayList<>();

    private static final String[] names = {"Buldog", "Gerbil", "Hamster", "Manx", "Mau", "Pug"};
    static {
        loader();
    }
    @SuppressWarnings("unchecked")
    private static void loader() {
        Stream.of(names).map(name->"ekkel_reflection.ex11pets."+ name).forEach(value-> {
            try {
                types.add((Class<? extends Pet>)Class.forName(value));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException();
            }
        });
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
