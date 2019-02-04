package ekkel_reflection.ex10;

public class PrimitiveDetector {
    public static void main(String[] args) {
        System.out.println(isPrimitive(new char[]{'c'}));
        System.out.println(new char[]{'c'}.getClass());
        System.out.println(new char[]{'c'}.getClass().getSuperclass());
        System.out.println(boolean.class.isPrimitive());
        System.out.println(Boolean.class.isPrimitive());


    }
    public static boolean isPrimitive(Object obj) {
        return obj.getClass().isPrimitive();
    }
}
