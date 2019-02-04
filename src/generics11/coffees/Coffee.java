package generics11.coffees;

public class Coffee {
    private static long counter;
    private long id = ++counter;

    @Override
    public String toString() {
        return String.format("%s %d", getClass().getSimpleName(), id);
    }
}
