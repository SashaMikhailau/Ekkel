package generics11;

public class ConcreteSelFBound extends SelfBound<ConcreteSelFBound> {
    @Override
    ConcreteSelFBound transform(ConcreteSelFBound concreteSelFBound) {
        return concreteSelFBound;
    }

    public static void main(String[] args) {
        ConcreteSelFBound csb = new ConcreteSelFBound();
        AnotherSelfBound asb = new AnotherSelfBound();

        ConcreteSelFBound csb2 = csb.get(csb);
        AnotherSelfBound asb2 = asb.get(asb);

    }
}

    class AnotherSelfBound extends SelfBound<AnotherSelfBound> {
        @Override
        AnotherSelfBound transform(AnotherSelfBound anotherSelfBound) {
            return anotherSelfBound;
        }
    }


