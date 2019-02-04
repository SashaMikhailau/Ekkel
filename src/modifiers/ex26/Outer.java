package modifiers.ex26;

public class Outer {


    class Inner{
        private int x, y;

        public Inner(int x, int y) {
            System.out.println("Old Inner");
            this.x = x;
            this.y = y;
        }
    }

}
