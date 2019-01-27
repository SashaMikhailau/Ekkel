package reflection.ex25.inner;

public class Tested {
    private int privi = 5;
    protected int proti = 6;
    int packi=7;
    public int pubi = 8;

    protected void procry() {
        System.out.println("Protected cry");
    }
    private void privcry(){
        System.out.println("Private cry");
    }

    public void pubcry(){
        System.out.println("Public cry");
    }
    void packcry(){
        System.out.println("Package cry");
    }

    @Override
    public String toString() {
        return "Tested{" +
                "privi=" + privi +
                ", proti=" + proti +
                ", packi=" + packi +
                ", pubi=" + pubi +
                '}';
    }
}
