package Shop;

import java.util.ArrayList;

public class Shop {

    SheetMusic sheetMusic;
    Drumstick drumstick;
    GuitarStrings guitarStrings;

    private ArrayList<ISell> stockList;


    public Shop() {
        stockList = new ArrayList<ISell>();
    }

    public int stockListSize () {
        return stockList.size();
    }

    public void addStock(ISell isell) {
        this.stockList.add(isell);
    }

    public void removeStock(ISell isell) {
        this.stockList.remove(isell);
    }

    public double checkTotalProfitForShop () {
        double totalProfit = drumstick.calculateMarkUp() + sheetMusic.calculateMarkUp() + guitarStrings.calculateMarkUp();
        return totalProfit;
}
}

