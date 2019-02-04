package exceptions.lastTasks;

public class A {
    public void throwException() throws ExceptionA {
        throw new ExceptionA();
    }
}

class B extends A {
    @Override
    public void throwException() throws ExceptionB {
        throw new ExceptionB();
    }
}

class C extends B {
    @Override
    public void throwException() throws ExceptionC {
        throw new ExceptionC();
    }

    public static void main(String[] args){
        A a = new C();
        try {
            a.throwException();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }
}
