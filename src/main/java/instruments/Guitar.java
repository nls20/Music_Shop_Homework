package instruments;

public class Guitar extends Instrument implements IPlay {

    private int numOfStrings;

    public Guitar(String colour, String instrumentType, int numOfStrings) {
        super(colour, instrumentType);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String playSound() {
        return "Strum strum";
    }
}
