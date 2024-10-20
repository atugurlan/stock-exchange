package entities;

public class Offer {
    private int offerID;
    private static int offerCount = 1;
    private int clientID;
    private StockType nameOfStock;
    private int noOfStock;
    private double priceOfStock;
    private OfferType offerType;
    private boolean isCompleted;

    public Offer(int clientID,
                 StockType nameOfStock,
                 int noOfStock,
                 double priceOfStock,
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

    public double getPriceOfStock() {
        return priceOfStock;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public void setNoOfStock(int noOfStock) {
        this.noOfStock = noOfStock;
    }

    public void setPriceOfStock(double priceOfStock) {
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
