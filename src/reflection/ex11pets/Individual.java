package reflection.ex11pets;

public class Individual {
    private String name;
    private static int counter = 0;

    private int id = counter++;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }
}
