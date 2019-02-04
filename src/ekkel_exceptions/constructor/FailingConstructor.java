package ekkel_exceptions.constructor;

public class FailingConstructor {
    private FileDisposer fd1;
    private FileDisposer fd2;


    public FailingConstructor(boolean b) throws ConstructingException {
        fd1 = new FileDisposer();
        try {
            if (b == true) {
                throw new ConstructingException();
            }
        } catch (ConstructingException e) {
            fd1.dispose();
            throw e;
        }

        fd2 = new FileDisposer();

    }

    public void dispose() {
        fd1.dispose();
        fd2.dispose();
        System.out.println("Disposed");
    }

    public static void main(String[] args) {
            try {
                FailingConstructor failingConstructor = new FailingConstructor(false);
                try {
                    System.out.println("Processing");
                }
                finally {
                    System.out.println("Cleanup");
                    failingConstructor.dispose();}
            } catch (ConstructingException e) {
                System.out.println("Construction failed");
            }

        }
        }


