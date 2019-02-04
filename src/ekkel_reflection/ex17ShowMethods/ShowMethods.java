package ekkel_reflection.ex17ShowMethods;

import java.lang.reflect.Executable;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ShowMethods {
    private static Pattern pattern = Pattern.compile("(\\w+\\.)|(native\\s+)|(final\\s+)");

    public static void main(String[] args) {
        args = new String[]{"ekkel_reflection.ex17ShowMethods.ShowMethods"};
        if (args.length < 1) {
            return;
        }

        Class<?> clazz;
        try {
            clazz = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
        String searchQuery = "";

        if (args.length > 1) {
            searchQuery = args[1];
        }
        printElemntInfo(clazz.getMethods(),searchQuery);
        printElemntInfo(clazz.getConstructors(),searchQuery);


    }

    private static void printElemntInfo(Executable[] memners, String searchQuery) {
        Stream.of(memners).filter(member -> member.toString().contains(searchQuery))
                .forEach(method -> System.out.println(pattern.matcher(method.toString()).replaceAll("")));
    }


}
