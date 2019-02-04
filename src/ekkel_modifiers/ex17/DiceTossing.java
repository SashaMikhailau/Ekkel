package ekkel_modifiers.ex17;

public class DiceTossing implements Tossing {
    private static final int MAX = 10;
    private int start;
    @Override
    public boolean toss() {
        System.out.println("Dicetossing "+start);
        return ++start != MAX;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new DiceTossing();
        }
    };
}
