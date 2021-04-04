package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void setUp () {
        drumstick = new Drumstick("Wooden sticks for playing drum", 2.00, 4.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("Wooden sticks for playing drum", drumstick.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2.00, drumstick.getBuyingPrice(), 0.0);
    }

    @Test
    public void canCheckMarkup() {
        assertEquals(2.00, drumstick.calculateMarkUp(), 0.0);
    }
}
