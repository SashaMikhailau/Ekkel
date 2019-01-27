package reflection.ex26_orchestra;

public class Orchestra {
    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.adjust();
        }
    }
    public static void prepareAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.prepareInstrument();
        }
    }
    public static void playAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(), new WoodWind(), new Percussion()};
        tuneAll(instruments);
        prepareAll(instruments);
        playAll(instruments);
    }

}
