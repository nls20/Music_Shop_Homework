package instruments;

public abstract class Instrument {

    private String colour;
    private String instrumentType;

    public Instrument(String colour, String instrumentType) {
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

}
