package reflection.ex26_orchestra;

public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println("Wind play()");

    }

    @Override
    public void prepareInstrument() {
        clearSplitValve();   
    }

    protected void clearSplitValve() {
        System.out.println("Wind.clearsplitvalve()");
    }

    @Override
    public void adjust() {
        
    }

    @Override
    public String what() {
        return "Wind";
    }
}
