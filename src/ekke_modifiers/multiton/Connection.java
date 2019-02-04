package ekke_modifiers.multiton;

public class Connection {
    private static int counter = 0;
    private int id = ++counter;
    Connection() {
    }
    public void doSomething(){
        System.out.println("Doing by Connection "+id);
        checkIn();
    }
    @Override
    public String toString() {
        return "Connection " + id;
    }
    public void checkIn() {
        ConnectionManager.checkIn(this);
    }
}
