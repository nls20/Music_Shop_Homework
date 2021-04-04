package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Printed music to play along to", 2.00, 3.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("Printed music to play along to", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2.00, sheetMusic.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3.00, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetMarkUpPrice () {
        assertEquals(1.00, sheetMusic.calculateMarkUp(), 0.0);
    }
}
