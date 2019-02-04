package ekkel_generics.wildcards;

import org.omg.PortableInterceptor.HOLDING;

public class WildCards {
  public static void setTo(Holder holder, Object arg) {
        holder.setT(arg);
        holder.setT(new Object());
        arg = holder.getT();
        Object obj = holder.getT();

    }
    public static void unBoundedSet(Holder<?> holder, Object arg) {
/*        holder.setT(arg);
        holder.setT(new Object());*/
        arg = holder.getT();
        Object obj = holder.getT();
    }
    public static <T> void exactSet(Holder<T> holder, T arg) {
        holder.setT(arg);
/*        holder.setT(new Object());*/
        arg = holder.getT();
        Object obj = holder.getT();
    }
    public static <T> void extendSet(Holder<? extends T> holder, T arg) {
/*        holder.setT(arg);
        holder.setT(new Object());*/
        arg = holder.getT();
        Object obj = holder.getT();
    }
    public static <T> void superSet(Holder<? super T> holder, T arg) {
        holder.setT(arg);
/*        holder.setT(new Object());
        arg = holder.getT();*/
        Object obj = holder.getT();
    }


    public static void main(String[] args) {
        Holder raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded= new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
   /*     Long lng = 1l;
        unBoundedSet(raw, lng);
        unBoundedSet(qualified, lng);
        unBoundedSet(unbounded, lng);
        unBoundedSet(bounded, lng);

        exactSet(raw, lng);
        exactSet(qualified, lng);
        exactSet(unbounded, lng);
        exactSet(bounded, lng);

        extendSet(raw, lng);
        extendSet(qualified, lng);
        extendSet(unbounded, lng);
        extendSet(bounded, lng);

        superSet(raw, lng);
        superSet(qualified, lng);
        superSet(unbounded, lng);
        superSet(bounded, lng);*/

    }
}
