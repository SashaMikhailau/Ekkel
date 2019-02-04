package ekkel_generics;

import java.util.Random;

public class CharacterGenerator implements Generator<StoryCharacters> {
    private Random random = new Random(47);
    private Class[] types = {BadCharacter.class, GoodCharacter.class};



    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters)types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Generator<StoryCharacters> generator = new CharacterGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}
