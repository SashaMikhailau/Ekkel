package ekkel_exceptions;

public class Retrhower {
    public void f() throws CustomException {
        throw new CustomException("from f()");
    }

    public void g() throws CustomException {
        try {
            f();
        } catch (CustomException e) {
            RuntimeException from_g = new RuntimeException("from g");
            from_g.initCause(e);
            throw from_g;
        }
    }

}
