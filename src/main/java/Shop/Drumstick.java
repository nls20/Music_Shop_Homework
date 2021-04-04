package Shop;

public class Drumstick implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Drumstick(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }
}
