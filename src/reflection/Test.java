package reflection;


import interfaces.horror.Vampire;
import interfaces.horror.VeryBadVampire;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Test{
    public static void main(String[] args) {
        String name = "123";
        name.getClass();
        try {
            Method cb = name.getClass().getDeclaredMethod("checkBounds", new Class[]{byte[].class, int.class, int.class});
            cb.setAccessible(true);
            cb.invoke(name,new byte[]{1,2},0,1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

