package edu.estatuas.stockx.Item;

import edu.estatuas.stockx.Offer.Offer;

import java.util.List;

public interface Item {
    int getAsk();
    int getBid();
    int getSale();
    void setBid(int bid);
    void setAsk(int ask);
    void add(Offer offer);
    List<Offer> getOffers();
}
