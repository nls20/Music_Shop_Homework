package Instruments;

import instruments.Drum;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp () {
        guitar = new Guitar("Brown", "String", 7);
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void hasNumOfDrums() {
        assertEquals(7, guitar.getNumOfStrings());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Strum strum", guitar.playSound());
    }
}

