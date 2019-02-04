package modifiers.ex19;

public class MultiInner {
    class FirstInner{
        class SecondInner{

        }
    }

    public static void main(String[] args) {
        MultiNested.FirstNested.SecondNested nested = new MultiNested.FirstNested.SecondNested();
    }
}
