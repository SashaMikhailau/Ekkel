package ekkel_modifiers.ex17;

public class CoinTossing implements Tossing {
    private static final int MAX = 5;
    private int start = 0;
    @Override
    public boolean toss() {
        System.out.println("CoinTossing "+start);
        return ++start != MAX;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public CoinTossing getTossing() {
            return new CoinTossing();
        }
    };
}
