package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;
    Drumstick drumstick;

    @Before
    public void setUp() {
        shop = new Shop();
        sheetMusic = new SheetMusic("notes for playing", 3.00, 5.00);
        guitarStrings = new GuitarStrings("Strings for playing", 6.00, 8.00);
        drumstick = new Drumstick("Stick", 5.00, 9.00);
        shop.addStock(guitarStrings);
        shop.addStock(drumstick);
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitarStrings);
        shop.addStock(drumstick);
        assertEquals(4, shop.stockListSize());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(guitarStrings);
        assertEquals(1, shop.stockListSize());
    }

    @Test
    public void checkTotalProfitForShop() {
        assertEquals(6.00, shop.checkTotalProfitForShop(), 0.0);
    }




}
