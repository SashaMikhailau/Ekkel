package ekkel_reflection.ex7;

public class SweetShop {
    public static void main(String[] args) {
        try {
            for (String arg : args) {
                Class.forName(arg);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
class Candy{
    static{
        System.out.println("Candy Loading");
    }
}

class Cookie {
    static{
        System.out.println("Cookie loading");
    }
}
class Gum{
    static {
        System.out.println("GUm loading");
    }
}


