package modifiers.ex7;

public class CLosed {
    private void test() {
        System.out.println("Puter in Inner");
    }
    private void useInnerClass(){
        Inner inner = new Inner();
        inner.approach();
        System.out.println(inner.z);
    }

    private int x = 4;
    private class Inner{
        private int z = 4;
        public void approach(){
            x = 5;
            test();
        }
    }

    public static void main(String[] args) {
        CLosed cLosed = new CLosed();
        cLosed.useInnerClass();
    }
}
