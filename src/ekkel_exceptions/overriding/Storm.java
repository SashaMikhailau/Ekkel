package ekkel_exceptions.overriding;

public interface Storm {
    void event();

    void rainHard();
}

class StromException extends RuntimeException {

}
class RaindexOut extends StromException {

}

