package instruments;

public class Trumpet extends Instrument implements IPlay {

    private int numOfValves;

    public Trumpet(String colour, String instrumentType, int numOfValves) {
        super(colour, instrumentType);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String playSound() {
        return "Toot toot";
    }
}
