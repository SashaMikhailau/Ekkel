package modifiers.firstpackage;

public class Supplier {
    protected int i = 4;
    protected void cry() {
    }
    private void weep() {

    }
    public void sing() {

    }
    void dance() {
        weep();
    }
}
class Second{
    public void manipulate() {
        Supplier supplier = new Supplier();
        supplier.cry();
    }
}
