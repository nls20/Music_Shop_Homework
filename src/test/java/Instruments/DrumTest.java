package Instruments;

import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp () {
        drum = new Drum("Blue", "Percussion", 3);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", drum.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("Percussion", drum.getInstrumentType());
    }

    @Test
    public void hasNumOfDrums() {
        assertEquals(3, drum.getNumOfDrums());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Boom boom boom!", drum.playSound());
    }
}
