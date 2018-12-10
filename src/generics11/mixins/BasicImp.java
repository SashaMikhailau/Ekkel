package generics11.mixins;

public class BasicImp implements Basic {
    private String value;
    @Override
    public void set(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
