package ekkel_exceptions.instance;

public enum Animals {
    BEAR{
        public void printFood() {
            System.out.println("Fish");
        }
    },ELEPHANT
    ,FISH
    ;
    Animals(){
        System.out.println(name());
    }


}
