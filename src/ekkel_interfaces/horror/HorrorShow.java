package ekkel_interfaces.horror;

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }
    static void f(DangerousMonster monster){
        monster.menace();
        monster.destroy();
    }
    static void v(Lethal lethal){
        lethal.kill();
    }
    public static void main(String[] args) {
        DangerousMonster barn = new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        f(barn);
        u(barn);
        Vampire vlad = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
        v(vlad);
        f(vlad);
        u(vlad);
    }
}
