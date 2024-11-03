package com.example.stockExchangeBackend.client;


import jakarta.persistence.*;

@Entity
@Table

public class Client {
    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private int id;
    private String name;
    private int moneyWallet;

    public Client(int id, String name, int moneyWallet) {
        this.id = id;
        this.name = name;
        this.moneyWallet = moneyWallet;
    }

    public Client() {
    }

    public Client(String name, int moneyWallet) {
        this.name = name;
        this.moneyWallet = moneyWallet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneyWallet(int moneyWallet) {
        this.moneyWallet = moneyWallet;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMoneyWallet() {
        return moneyWallet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moneyWallet=" + moneyWallet +
                '}';
    }
}
