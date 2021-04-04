package Instruments;

import instruments.Guitar;
import instruments.PanPipes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PanPipeTest {

    PanPipes panPipes;

    @Before
    public void setUp () {
        panPipes = new PanPipes("Silver", "Wind", 5);
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", panPipes.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("Wind", panPipes.getInstrumentType());
    }

    @Test
    public void hasNumOfDrums() {
        assertEquals(5, panPipes.getNumOfPipes());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Whistle whistle", panPipes.playSound());
    }
}
