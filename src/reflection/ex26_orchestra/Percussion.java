package reflection.ex26_orchestra;

public class Percussion implements Instrument {
    @Override
    public void play() {
        System.out.println("Percussion playing");

    }

    @Override
    public void prepareInstrument() {
        System.out.println("Percussion.preapreInstrument()");
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }
}
