package ekkel_generics.factories;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
    private Map<String, Factory<?>> map = new HashMap<>();
    private Class<T> type;

    public ClassTypeCapture(Class<T> type) {
        this.type = type;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Number> ct1 = new ClassTypeCapture<>(Number.class);
        ct1.addClass("Widjet", new WidjetFactory());
        ct1.addClass("Integer", new IntegerFactory());
        System.out.println(ct1.createNew("Integer"));

    }

    public boolean isType(Object arg) {
        return type.isInstance(arg);
    }

    public void addClass(String typeName, Factory<?> factory) {
        map.put(typeName, factory);
    }

    public T createNew(String typeName) {
        Object obj = null;
        try {
            obj = map.get(typeName).create(5);
        } catch (NullPointerException e) {
            System.out.println("Not registered factory");
        }
        if(isType(obj)) return (T)obj;

        return null;
    }
}
    class House extends Building{}
    class Building{}

