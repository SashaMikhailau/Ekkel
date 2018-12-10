package exceptions.constructor;

public class FileDisposer {
    private boolean disposed;

    public FileDisposer() {

    }

    @Override
    public String toString() {
        return "FileDisposer{" +
                "disposed=" + disposed +
                '}';
    }

    public boolean isDisposed() {
        return disposed;
    }

    public void dispose(){
        disposed = true;
        System.out.println(this);

    }
}
