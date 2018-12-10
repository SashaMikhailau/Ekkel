package modifiers.secondpackage;

import modifiers.firstpackage.Supplier;

public class InheritConsumer extends Supplier {
    public static void main(String[] args) {
        InheritConsumer ic = new InheritConsumer();
        ic.cry();
        ic.sing();
        Supplier supplier = new Supplier();
        supplier.sing();
    }
}
