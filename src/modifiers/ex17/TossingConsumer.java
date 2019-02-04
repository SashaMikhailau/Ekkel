package modifiers.ex17;

public class TossingConsumer {
    static void useTossing(TossingFactory factory) {
        Tossing tossing = factory.getTossing();
        while (tossing.toss()) {

        }
    }

    public static void main(String[] args) {
        useTossing(CoinTossing.factory);
        useTossing(DiceTossing.factory);
    }
}
