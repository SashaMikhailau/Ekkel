package ekkel_generics;

public class LinkedStack<T> {

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        public Node() {
        }

        private boolean end() {
            return item==null &&next==null;
        }
    }

    private Node top = new Node();
    public void push(T element) {
        top = new Node(element,top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> list = new LinkedStack<>();
        for(String s:"1 2 3 4 5".split("\\s+")) {
            list.push(s);
        }
        String s = "";
        while((s = list.pop())!=null){
            System.out.println(s);
        }
    }
}
