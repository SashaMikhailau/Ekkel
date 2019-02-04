package ekkel_reflection.ex25;

import ekkel_reflection.ex25.inner.Tested;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Tested tested = new Tested();
        Class<? extends Tested> clazz = tested.getClass();
        for(Field field: clazz.getDeclaredFields()){
            field.setAccessible(true);
            System.out.println(field);
            field.setInt(tested,1);
            System.out.println(tested);
        }
        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            method.invoke(tested);
        }
        methodInvocate("procry",tested);
        methodInvocate("pubcry",tested);
        methodInvocate("privcry",tested);
        methodInvocate("packcry",tested);
    }

    public static void methodInvocate(String methodName, Object obj, Object ...args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?>[] classes = Arrays.stream(args).map(arg -> arg.getClass()).toArray(Class<?>[]::new);
        Class<?> aClass = obj.getClass();
        Method method = aClass.getDeclaredMethod(methodName, classes);
        method.setAccessible(true);
        method.invoke(obj, args);
    }
}
