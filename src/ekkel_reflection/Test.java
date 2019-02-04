package ekkel_reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

