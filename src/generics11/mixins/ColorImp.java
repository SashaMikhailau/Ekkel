package generics11.mixins;

public class ColorImp implements Colored {
    private final String color;

    public ColorImp(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
