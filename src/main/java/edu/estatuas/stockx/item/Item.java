package edu.estatuas.stockx.item;

import edu.estatuas.stockx.offer.Offer;

import java.util.List;

public interface Item {
    int getAsk();
    int getBid();
    int getSale();
    String getStyle();
    void setSale(int sale);
    void setBid(int bid);
    void setAsk(int ask);
    void add(Offer offer);
    List<Offer> getOffers();
}
