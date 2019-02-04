package reflection.ex8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class RecursiveIerarchy {
    private static int counter = 0;
    public static void main(String[] args) {
        getParent(ArrayList.class);
    }

    public static <T> void getParent(Class<T> type) {

        Class<? super T> parentType = type.getSuperclass();
        if (parentType != null) {
            getParent(parentType);
        }
        for (Class cc : type.getInterfaces()) {
            System.out.println("Interface: " + cc.getName());
            getParent(cc);
        }
        System.out.println(type.getName()+ " level " + ++counter);
        Stream.of(type.getDeclaredFields()).forEach(field -> System.out.print(field.getType().getSimpleName()+" "
        +field.getName()+" "));
        System.out.println();



    }
}
