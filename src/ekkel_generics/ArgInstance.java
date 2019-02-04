package ekkel_generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ArgInstance<T> {
    Class<T> type;

    public ArgInstance(Class<T> type) {
        this.type = type;
    }

    public T create(int arg) {
        Constructor[] constructors = type.getConstructors();
        /*try {
            Constructor<T> constructor = type.getConstructor(int.class);
            constructor.newInstance(arg);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/
        for (Constructor cons : constructors) {
            if(cons.getParameterCount()==1){
                Class<?>[] params = cons.getParameterTypes();
                for (Class<?> param : params) {
                    if(param==int.class){
                        try {
                            return (T)cons.newInstance(arg);
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(new ArgInstance<Integer>(Integer.class).create(5));
    }
}
