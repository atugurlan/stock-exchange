import entities.Client;
import entities.OfferType;
import entities.StockType;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<StockType, Integer> stockWallet1 = new HashMap<>();
        stockWallet1.put(StockType.AMAZON, 10);
        stockWallet1.put(StockType.GOOGLE, 10);

        Client c1 = new Client("Client1", 30, stockWallet1);
        c1.postOffer(StockType.AMAZON, 5, 5, OfferType.BUY);
        System.out.println(c1.toString());

        c1.modifyOfferByPrice(1, 7);
        System.out.println(c1.toString());
    }
}