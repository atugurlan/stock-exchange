package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class Matcher {
    private HashMap<StockType, HashMap<Double, ArrayList<Offer>>> buyOffers;
    private HashMap<StockType, HashMap<Double, ArrayList<Offer>>> sellOffers;

    public Matcher(HashMap<StockType, HashMap<Double, ArrayList<Offer>>> buyOffers) {
        this.buyOffers = new HashMap<StockType, HashMap<Double, ArrayList<Offer>>>();
        this.sellOffers = new HashMap<StockType, HashMap<Double, ArrayList<Offer>>>();
    }

    public void addBuyOffer(Offer offer){
        addOffer(offer, buyOffers);
    }

    public void addSellOffer(Offer offer){
        addOffer(offer, sellOffers);
    }

    private void addOffer(Offer offer, HashMap<StockType, HashMap<Double, ArrayList<Offer>>> offers) {
        StockType stockType = offer.getNameOfStock();  // Assuming getNameOfStock() returns StockType
        double price = offer.getPriceOfStock();  // Assuming getPrice() returns the offer price

        HashMap<Double, ArrayList<Offer>> priceOffers = offers.computeIfAbsent(stockType, k -> new HashMap<>());
        ArrayList<Offer> offerList = priceOffers.computeIfAbsent(price, k -> new ArrayList<>());

        offerList.add(offer);
    }
}
