package ekkel_exceptions.exception_hide;

public class Test {
    public static void main(String[] args) {
        f();
    }

    public static void f(){
        try {
            try {
                throw new ImportantException();
            } finally {
                try {
                    throw new NotImportantException();
                } finally {
                    throw new ReplaceException();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
