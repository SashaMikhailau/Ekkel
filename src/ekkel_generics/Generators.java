package ekkel_generics;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> ArrayList<T> fill(ArrayList<T> list, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> list, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> Queue<T> fill(Queue<T> list, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            list.add(gen.next());
        }
        return list;
    }


    public static void main(String[] args) {
        Collection<StoryCharacters> col = fill(new LinkedList<StoryCharacters>(), new CharacterGenerator(), 5);

        Collection<StoryCharacters> col3 = fill(new ArrayList<StoryCharacters>(), new CharacterGenerator(), 5);
        for (StoryCharacters sc : col) {
            System.out.println(sc);
        }

    }
}
