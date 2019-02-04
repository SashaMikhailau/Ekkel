package ekkel_generics;

public class StoryCharacters {
    private static int counter;
    private int id = ++counter;
    @Override
    public String toString() {
        return String.format("%s №%d", getClass().getSimpleName(), id);
    }

}
