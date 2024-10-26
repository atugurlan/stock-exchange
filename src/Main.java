import entities.Client;
import entities.ClientManager;
import entities.OfferType;
import entities.StockType;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<StockType, Integer> stockWallet1 = new HashMap<>();
        stockWallet1.put(StockType.AMAZON, 10);
        stockWallet1.put(StockType.GOOGLE, 10);

        Client c1 = new Client("Client1", 1000, stockWallet1);
        ClientManager.addClient(c1);
        c1.postOffer(StockType.AMAZON, 5, 9, OfferType.BUY);
        c1.postOffer(StockType.AMAZON, 6, 5, OfferType.BUY);
        c1.postOffer(StockType.AMAZON, 7, 17, OfferType.BUY);
        c1.postOffer(StockType.AMAZON, 8, 5, OfferType.BUY);

        Map<StockType, Integer> stockWallet2 = new HashMap<>();
        stockWallet2.put(StockType.AMAZON, 10);
        stockWallet2.put(StockType.GOOGLE, 10);

        Client c2 = new Client("Client2", 1000, stockWallet2);
        ClientManager.addClient(c2);
        c2.postOffer(StockType.AMAZON, 8, 5, OfferType.SELL);

        ClientManager.print();
    }
}