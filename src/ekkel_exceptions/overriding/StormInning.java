package ekkel_exceptions.overriding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StormInning extends Inning implements Storm {
    class Inner{

    }

    public StormInning() {

    }

    @Override
    public void event()  {


    }


    @Override
    public void rainHard() {

    }
    public void judje() {

    }
    @Override
    public void walk() {

    }

    @Override
    public void atBat() {
        StormInning.Inner iiner = new StormInning.Inner();
    }

    public static void main(String[] args) {

            StormInning inning = new StormInning();
            inning.rainHard();
            inning.judje();

    }
}

class UmpireException extends RuntimeException{

}
