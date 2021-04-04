package Instruments;

import instruments.Guitar;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp () {
        trumpet = new Trumpet("Gold", "Brass", 3);
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("Brass", trumpet.getInstrumentType());
    }

    @Test
    public void hasNumOfDrums() {
        assertEquals(3, trumpet.getNumOfValves());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Toot toot", trumpet.playSound());
    }
}
