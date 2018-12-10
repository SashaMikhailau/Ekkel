package modifiers.ex16;

import java.util.Comparator;

public class SwapChars {
    public static String swapChars(String input){
        char[] array = input.toCharArray();
        for(int i  =0; i+1< array.length;i+=2){
            char temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        Processor<String> processor = new Processor<String>() {
            @Override
            public String process(Object input) {
                return swapChars((String) input);
            }
        };
        System.out.println(processor.process("ABCEDE"));
    }


}
