package ekkel_exceptions.lastlesson;

public class Human {
    static void throwException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new Sneeze();

                case 1:
                    throw new Annoyance();

                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                throwException(i);
            } catch (RuntimeException e) {
                try {
                    throw e.getCause();
                } catch (Sneeze e2) {
                    System.out.println("Sneeze " + e2);
                } catch (Annoyance e2) {
                    System.out.println("Annoyance " + e2);
                } catch (Throwable throwable) {
                    System.out.println("Throwable " + throwable);
                }

            }
        }

    }
}

class Sneeze extends Annoyance{

}

class Annoyance extends RuntimeException {

}
