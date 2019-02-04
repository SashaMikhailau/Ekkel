package modifiers.ex15;

public class Another {
    public Outer get(){
        return new Outer(5) {
            @Override
            public void cry() {
                System.out.println("Anonymous "+x);
            }
        };
    }

    public static void main(String[] args) {
        new Another().get().cry();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
