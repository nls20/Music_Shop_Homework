package Shop;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Strings for the guitar", 3.00, 6.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("Strings for the guitar", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(3.00, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6.00, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void getMarkUpPrice() {
        assertEquals(3.00, guitarStrings.calculateMarkUp(), 0.0);
    }
}
