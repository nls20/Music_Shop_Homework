package instruments;

public class PanPipes extends Instrument implements IPlay {

    private int numOfPipes;

    public PanPipes(String colour, String instrumentType, int numOfPipes) {
        super(colour, instrumentType);
        this.numOfPipes = numOfPipes;
    }

    public int getNumOfPipes() {
        return numOfPipes;
    }

    public String playSound() {
        return "Whistle whistle";
    }
}
