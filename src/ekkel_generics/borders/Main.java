package ekkel_generics.borders;

public class Main {
    public static <BUG extends Runnable> void makeRun(BUG bug) {
        bug.run();
    }

    public static <BUG extends Flyable> void makeFlye(BUG bug) {
        bug.fly();
    }

    public static void main(String[] args) {
        Border border = new Border();
        makeFlye(border);
        makeRun(border);
    }
}
