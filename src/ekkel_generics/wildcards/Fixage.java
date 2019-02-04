package ekkel_generics.wildcards;

import java.util.*;

public class Fixage {
    public static void make(Holder<List<?>> holder) {
        List l = holder.getT();
        List<?> l2 = holder.getT();
        holder.setT(l);
        holder.setT(l2);
        l.add(new Object());
        //l2.add(new Object());
        Object o = l.get(0);
        Object o2 = l2.get(0);
    }

    public static void makeList(List<Holder<?>> list) {
        Holder l = list.get(0);
        Holder<?> l2 = list.get(0);
        list.add(l);
        list.add(l2);

        l.setT(new Object());
        //l2.setT(new Object());

        Object o = l.getT();
        Object o2 = l2.getT();
    }



    public static void main(String[] args) {
        List<Holder<?>> list = new ArrayList<Holder<?>>();
        list.add(new Holder<Integer>());
        makeList(list);
        Byte[] possibles = {1, 2, 3, 4, 5, 6};
        Set<Byte> set = new HashSet<Byte>(Arrays.asList(possibles));
    }
}
