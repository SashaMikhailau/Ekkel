package ekkel_generics.adapters;

public class First {
    private String value;

    public First(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "First{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
