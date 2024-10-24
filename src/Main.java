import entities.Client;
import entities.OfferType;
import entities.StockType;

import java.util.HashMap;
import java.util.Map;
import java.util.Concurrent;

public class Main {
    public static void main(String[] args) {
        Map<StockType, Integer> stockWallet1 = new HashMap<>();
        stockWallet1.put(StockType.AMAZON, 10);
        stockWallet1.put(StockType.GOOGLE, 10);

        Client c1 = new Client("Client1", 30, stockWallet1);
        Client c2 = new Client("Client2", 50, stockWallet1);
        Client c3 = new Client("Client3", 50, stockWallet1);
        Client c4 = new Client("Client4", 50, stockWallet1);
    }
}