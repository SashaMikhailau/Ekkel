package ekke_modifiers.multiton;

public class ConnectionManager {
    //private static int current = 0;
    private static int size = 10;
    private static Connection[] connections = new Connection[size];
    static {
        for (int i =0;i<size;i++) {
            connections[i] = new Connection();
        }
    }


    public static Connection getConnection() {
        for (int i = 0; i < size; i++) {
            if (connections[i] != null) {
                Connection c = connections[i];
                connections[i] = null;
                return c;
            }
        }
        return null;
    }

    public static void checkIn(Connection c) {
        for (int i = 0; i < size; i++) {
            if (connections[i] == null) {
                connections[i] = c;
                return;
            }
        }
    }
}

