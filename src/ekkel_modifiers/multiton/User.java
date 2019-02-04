package ekkel_modifiers.multiton;

public class User {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Connection c = ConnectionManager.getConnection();

                c.doSomething();

        }
    }
}
