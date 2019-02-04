package ekkel_exceptions.innerclasses;

public class Outer {
    private static int sty = 10;
    private int y = 5;
    private static void stPlay() {
    }

    private void play() {

        class LocalClass{
            private static final int z = 4;
        }
        System.out.println(LocalClass.z);

    }

    private abstract class Inner {
        private static final int innerX =5;


    }



    public static void main(String[] args) {
        new Outer().play();
    }
}
