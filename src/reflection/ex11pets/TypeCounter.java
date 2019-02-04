package reflection.ex11pets;

import java.util.HashMap;
import java.util.stream.Collectors;

public class TypeCounter extends HashMap<Class<?>,Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (baseType.isAssignableFrom(type)) {
            countClass(type);
        } else {
            throw new RuntimeException();
        }
    }

    private void countClass(Class<?> type) {
        merge(type, 1, (i1, i2) -> i1 + 1);
        Class<?> superclass = type.getSuperclass();
        if (superclass != null && baseType.isAssignableFrom(superclass)) {
            countClass(superclass);
        }
    }

    @Override
    public String toString() {
        return entrySet().stream().map(entry -> "key: " + entry.getKey().getSimpleName() + " value: " + entry.getValue() + "\n").
                collect(Collectors.joining());
    }
}
