package ekkel_exceptions.overriding;

public abstract class Inning {
    public Inning(){
    }

    public void event(){}

    public abstract void walk();

    public abstract void atBat();

}

class BaseballException extends RuntimeException{

}

class Strike extends BaseballException{

}

class Foul extends BaseballException {

}

class PopFoul extends Foul {

}
