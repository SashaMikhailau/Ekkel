package ekkel_reflection.ex20;

import java.lang.reflect.Modifier;
import java.util.stream.Stream;

public class ex20 {
    public static void main(String[] args) {

        args = new String[]{"java.lang.Object"};
        Class<?> clazz;
        String regex = "\\w+\\.";
        try {
            clazz = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
        System.out.println("Methods:");
        Stream.of(clazz.getDeclaredMethods())
                .forEach(method -> System.out.println(method.toString().replaceAll(regex, "")));
        System.out.println("Constructors:");
        Stream.of(clazz.getConstructors())
                .forEach(constr-> System.out.println(constr.toString().replaceAll(regex, "")));
        System.out.println("Interfaces:");
        Stream.of(clazz.getInterfaces())
                .forEach(inter-> System.out.println(inter.getSimpleName()));
        Class<?> spr = clazz.getSuperclass();
        if (spr != null) {
            System.out.println("Superclass - "+spr.getSimpleName());
        }
        System.out.println("Declaredfileds:");
        Stream.of(clazz.getDeclaredFields())
                .forEach(field-> System.out.println(field.getType().getSimpleName()+" "+field.getName()));
        System.out.println("Annotations:");
        Stream.of(clazz.getAnnotations())
                .forEach(annotation-> System.out.println(annotation.toString()));
        System.out.println(Modifier.toString(clazz.getModifiers()));}
}
