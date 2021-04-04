package instruments;

public class Drum extends Instrument implements IPlay {

    private int numOfDrums;

    public Drum(String colour, String instrumentType, int numOfDrums) {
        super(colour, instrumentType);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    public String playSound() {
        return "Boom boom boom!";
    }
}
