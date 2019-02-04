package ekkel_innerclasses.selectors;

import java.util.*;

public class Sequence {
    private Content[] array;
    private int current = 0;
    private Selector selector;

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public Sequence(int size) {
        this.array = new Content[size];
        selector = new SequenceSelector();
    }

    public boolean add(Content e) {
        if (current < array.length) {
            array[current++] = e;
            return true;
        }
        return false;
    }

    public Selector selector() {
        return selector;
    }
    public Selector reverseSelector(){
        return new ReverseSelector();
    }


    class SequenceSelector implements Selector<Content> {
        private int position = 0;

        @Override
        public Content current() {
            if (!end()) {
                return array[position];
            }
            return null;

        }

        @Override
        public boolean end() {
            return position >= array.length;
        }

        @Override
        public void next() {
            if (!end()) {
                position++;
            }
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }
    class ReverseSelector implements Selector<Content>{
        private int position = array.length - 1;
        @Override
        public Content current() {
            if(!end()){
                return array[position];
            }
            return null;
        }

        @Override
        public boolean end() {
            return position<0;
        }

        @Override
        public void next() {
            if(!end()){
                position--;
            }
        }
    }

}
