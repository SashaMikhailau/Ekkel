package arrays;

public class BerilliumSphere {
    private static int counter;
    private final int id = ++counter;

    @Override
    public String toString() {
        return "BerilliumSphere " + id;
    }
}
