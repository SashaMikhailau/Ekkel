package modifiers.ex19;

public class MultiNested {
    static class FirstNested{
        static class SecondNested{

        }
    }

    public static void main(String[] args) {
        MultiInner.FirstInner.SecondInner inner = new MultiInner().new FirstInner().new SecondInner();
    }
}
