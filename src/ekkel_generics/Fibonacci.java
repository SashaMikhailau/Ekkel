package ekkel_generics;

public class Fibonacci implements Generator<Integer> {
    protected int count = 0;



    private int fib(int n) {
        if(n <2)return 1;
        return fib(n - 2) + fib(n - 1);
    }
    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        IterFibonaci fibonacci = new IterFibonaci(16);
        for (Integer n :fibonacci) {
            System.out.print(n+ " ");
        }
    }
}
