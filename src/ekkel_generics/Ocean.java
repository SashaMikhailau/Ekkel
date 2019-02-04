package ekkel_generics;

import java.util.*;

public class Ocean {
    public static void eat(BigFish bigFish, SmallFish smallFish) {
        System.out.printf("%s eats %s\n",bigFish,smallFish);
    }

    public static void main(String[] args) {
        Random random = new Random(46);
        Queue<SmallFish> queue = new LinkedList<>();
        Generator<SmallFish> gen1 = SmallFish.generator();
        Generators.fill(queue, gen1, 10);
        List<BigFish> list = new ArrayList<>();
        Generator<BigFish> gen2 = BigFish.generator();
        Generators.fill(list, gen2, 4);
        for (SmallFish sf : queue) {
            eat(list.get(random.nextInt(list.size())), sf);
        }

    }
}
class BigFish{
    private static long counter;
    private long id = ++counter;

    @Override
    public String toString() {
        return "BigFish" + id;
    }

    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }

}
class SmallFish{
    private static long counter;
    private long id = ++counter;

    @Override
    public String toString() {
        return "SmallFish" + id;
    }

    public static Generator<SmallFish> generator(){
        return new Generator<SmallFish>() {
            @Override
            public SmallFish next() {
                return new SmallFish();
            }
        };
    }
}
