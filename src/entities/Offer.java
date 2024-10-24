package entities;

public class Offer {
    private final int offerID;
    private static int offerCount = 1;
    private final int clientID;
    private final StockType nameOfStock;
    private int noOfStock;
    private int priceOfStock;
    private final OfferType offerType;
    private boolean isCompleted;

    public Offer(int clientID,
                 StockType nameOfStock,
                 int noOfStock,
                 int priceOfStock,
                 OfferType offerType) {
        this.offerID = offerCount;
        offerCount++;

        this.clientID = clientID;
        this.nameOfStock = nameOfStock;
        this.noOfStock = noOfStock;
        this.priceOfStock = priceOfStock;
        this.offerType = offerType;
        this.isCompleted = false;
    }

    public int getOfferID() {
        return this.offerID;
    }

    public StockType getNameOfStock() {
        return nameOfStock;
    }

    public int getNoOfStock() {
        return noOfStock;
    }

    public int getPriceOfStock() {
        return priceOfStock;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setNoOfStock(int noOfStock) {
        this.noOfStock = noOfStock;
    }

    public void setPriceOfStock(int priceOfStock) {
        this.priceOfStock = priceOfStock;
    }

    public void setIsCompleted() {
        this.isCompleted = true;
    }

    public String toString() {
        return "Offer ID: " + this.offerID + "\n" +
                "Client ID: " + this.clientID + "\n" +
                "Stock Name: " + this.nameOfStock + "\n" +
                "Quantity of Stock: " + this.noOfStock + "\n" +
                "Price per Stock: " + this.priceOfStock + "\n" +
                "Type of offer: " + this.offerType + "\n" +
                "Offer closed: " + this.isCompleted + "\n";
    }
}
