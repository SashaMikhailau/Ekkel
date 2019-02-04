package reflection.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class ToyTest {
    public static void testClass(Class cc) {
        System.out.println(cc.getCanonicalName());
        System.out.println(cc.getName());
        System.out.println(cc.getSimpleName());
        for (Class inter : cc.getInterfaces()) {
            System.out.println(inter);
        }
    }

    public static void main(String[] args) {
        Class cc = null;
        try {
            cc = Class.forName("reflection.ex1.FancyToy");
        }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        testClass(cc);
        Class up = cc.getSuperclass();
        Object obj = null;
        try {
            Constructor constructor = Stream.of(up.getConstructors())
                    .filter(constr -> constr.getParameterCount() == 1 && constr.getParameterTypes()[0] == int.class)
                    .findAny().orElse(null);
            if (constructor != null) {
                obj = constructor.newInstance(10);
            }

        } catch (IllegalAccessException|InstantiationException|InvocationTargetException e) {
            e.printStackTrace();
            System.exit(1);
        }
        testClass(obj.getClass());
        System.out.println(((Toy)obj).iq);

    }
}
