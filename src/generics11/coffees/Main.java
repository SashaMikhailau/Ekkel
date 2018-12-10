package generics11.coffees;

import java.io.FileNotFoundException;
import java.lang.reflect.Proxy;

public class Main {
    static int[] array = new int[2];
    static int b = array[3];

    public static void main(String[] args) {
        try {
            eat();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void eat(){

    }
}
